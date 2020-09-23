/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ffox.dbackup;

import intradyn.cv.config.*;
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.lang.RandomStringUtils;
import org.ini4j.Ini;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Backup Tab Test Suite.
 * Includes: History, Remote Share Configuration, CIFS, NFS backups
 * @author bkett
 * @since 0.3.0
 */
public class BackupTest extends org.junit.Assert {

    private static String backupTab = "//div[@id='tabs']/ul/li[5]/a/span";
    private static int sdelay = 5;
    private static Ini config;
    private static Ini fetchers;
    private static WebDriver backup;

    /**
     * Standard Constructor
     */
    public BackupTest() {
    }

    /**
     * Opens the main browser window at the beginning of the test suite.
     */
    @BeforeClass
    public static void setUpClass() {
        String configName = "remote-backup-settings.ini";
        String fetchersName = "fetchers.ini";
        try {
            backup = ComplianceVault.login();
        } catch (Exception e) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + e.getMessage());
        }
        try {
            config = new Ini(new FileReader(configName));
            fetchers = new Ini(new FileReader(fetchersName));
            //Section get = config.get("SMB");
        } catch (IOException e) {
            System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
        }
    }

    /**
     * Kills everything after the tests have finished running.
     */
    @AfterClass
    public static void tearDownClass() {
        backup.quit();
    }

    /**
     * Navigates to the backup section before running any tests.
     */
    @Before
    public void setUp() {
        backup.findElement(By.xpath(backupTab)).click();
        SelHelpers.Delay(backup, sdelay);
    }

    /**
     * Resets the delay period after running a test.
     */
    @After
    public void tearDown() {
        SelHelpers.Delay(backup, sdelay);
    }

    /**
     * Checks the Backup history GUI menu for content.
     */
    @Test
    public void testHistory() {
        By histlink = By.xpath("//div/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(histlink, backup));
        assertEquals(backup.findElement(histlink).getText(), "View Backup History");
        backup.findElement(histlink).click();
        SelHelpers.Delay(backup, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Remote Backup History", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));

        assertTrue(SelHelpers.isElementPresent(By.xpath("//th[@id='Start']/a"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//th[@id='End']/a"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//th[@id='Files']/a"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//th[@id='Error Messages']/a"), backup));
        assertEquals("Start", backup.findElement(By.xpath("//th[@id='Start']/a")).getText());
        assertEquals("End", backup.findElement(By.xpath("//th[@id='End']/a")).getText());
        assertEquals("Files", backup.findElement(By.xpath("//th[@id='Files']/a")).getText());
        assertEquals("Error Messages", backup.findElement(By.xpath("//th[@id='Error Messages']/a")).getText());
    }

    /**
     * Attempts to configure remote shares, both NFS & CIFS. Also checks naming
     * schemes.
     */
    @Test
    public void testRemoteHostConfig() {
        By conflink = By.xpath("//div/li[3]/a/span");
        assertTrue(SelHelpers.isElementPresent(conflink, backup));
        assertEquals(backup.findElement(conflink).getText(), "Remote Host Config");
        backup.findElement(conflink).click();
        SelHelpers.Delay(backup, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Remote Backup Host Configuration", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));

        int conf_descbegin = 1, conf_descend = 3;
        for (int i = conf_descbegin; i <= conf_descend; i++) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[" + i + "]/dt/label"), backup));
            String descript;
            switch (i) {
                case 1:
                    descript = "Encryption Key";
                    break;
                case 2:
                    descript = "Filesystem type on host";
                    break;
                case 3:
                    descript = "Tape Archive will also be used";
                    break;
                default:
                    descript = "FAIL";
                    break;
            }
            assertEquals(backup.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[" + i + "]/dt/label")).getText(), descript);
        }
        //assert inputs exist
        assertTrue(SelHelpers.isElementPresent(By.id("id_encryptionkey"), backup));
        assertTrue(SelHelpers.isElementPresent(By.id("id_hostname"), backup));
        assertTrue(SelHelpers.isElementPresent(By.id("id_hostpath"), backup));
        assertTrue(SelHelpers.isElementPresent(By.id("id_usetape"), backup));

        //Must determine file system nfs or smb

        assertTrue(SelHelpers.isElementPresent(By.id("id_fstype_0"), backup));
        assertTrue(SelHelpers.isElementPresent(By.id("id_fstype_1"), backup));

        backup.findElement(By.id("id_encryptionkey")).clear();
        backup.findElement(By.id("id_hostname")).clear();
        backup.findElement(By.id("id_hostpath")).clear();

        assertTrue(SelHelpers.isElementPresent(By.id("submit"), backup));
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), backup));

        //Input a random string into the description

        //false test on blank key
        String randKey = RandomStringUtils.randomAlphabetic(30);
        backup.findElement(By.id("id_encryptionkey")).clear();
        String randName = randKey;
        backup.findElement(By.id("id_hostname")).sendKeys(randName);
        String randPath = RandomStringUtils.randomAlphabetic(10);
        backup.findElement(By.id("id_hostpath")).sendKeys(randPath);
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd[2]/ul/li"), backup));

        //false test on short key
        String badKey = RandomStringUtils.randomAlphabetic(5);
        backup.findElement(By.id("id_encryptionkey")).sendKeys(badKey);
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd[2]/ul/li"), backup));

        //false test on blank host
        backup.findElement(By.id("id_encryptionkey")).sendKeys(randKey);
        backup.findElement(By.id("id_hostname")).clear();
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='cifs_nfs_hostname']/dl/dd[2]/ul/li"), backup));

        //flase test on blank path
        backup.findElement(By.id("id_hostname")).sendKeys(randName);
        backup.findElement(By.id("id_hostpath")).clear();
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='cifs_nfs_hostpath']/dl/dd[2]/ul/li"), backup));

        //False test on Bad input
        backup.findElement(By.id("id_hostpath")).sendKeys(randPath);
        backup.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("error"), backup));
        String curPlace = backup.getCurrentUrl();
        backup.get(curPlace);

        //clear it all out
        backup.findElement(By.id("id_hostpath")).clear();
        backup.findElement(By.id("id_hostname")).clear();
        backup.findElement(By.id("id_encryptionkey")).clear();

        //Do SMB first, thus needs do some Xtra stuffz
        if (!backup.findElement(By.id("id_fstype_1")).isSelected()) {
            backup.findElement(By.id("id_fstype_1")).click();
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='cifs_details']/dl/dt/label"), backup));
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='cifs_details']/dl[2]/dt/label"), backup));
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='cifs_details']/dl[3]/dt/label"), backup));
            assertEquals("Domain name on host", backup.findElement(By.xpath("//div[@id='cifs_details']/dl/dt/label")).getText());
            assertEquals("Username on host", backup.findElement(By.xpath("//div[@id='cifs_details']/dl[2]/dt/label")).getText());
            assertEquals("Password on host", backup.findElement(By.xpath("//div[@id='cifs_details']/dl[3]/dt/label")).getText());

            assertTrue(SelHelpers.isElementPresent(By.id("id_hostuser"), backup));
            assertTrue(SelHelpers.isElementPresent(By.id("id_hostpass"), backup));
            //Here is where you would enter "good" input. As the share hasn't been set up, I'm going to lay the tracks.
            Ini.Section smb = config.get("SMB");
            RemoteBackup.configureShare(smb, backup);
            backup.get(curPlace);
        }
        //Not samba? Must be NFS
        SelHelpers.Delay(backup, 10);
        backup.findElement(By.id("id_fstype_0")).click();
        Ini.Section nfs = config.get("NFS");
        RemoteBackup.configureShare(nfs, backup);
    }

    /**
     * NOTE: This test will work on WINDOWS ONLY
     * This test exists in 5 stages: I) Perform a Factory Reset, wiping any data from previous tests on the machine.
     * II) Add a fetcher named IMAP4, and perform a backup on data fetched. III) Wipe the data, and restore.
     * IV) Add another fetcher named Allison, and perform a backup on fetched data. V) Wipe again, and restore.
     */
    @Test
    public void testCIFSRemoteBackup() {
        By backuplink = By.xpath("//div/li[5]/a/span");
        assertTrue(SelHelpers.isElementPresent(backuplink, backup));
        assertEquals(backup.findElement(backuplink).getText(), "Backup Now");
        backup.findElement(backuplink).click();
        SelHelpers.Delay(backup, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Backup Now", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));
        assertEquals("This will perform an immediate backup of data, to the location specified by Remote Host Config.",
                backup.findElement(By.xpath("//div[@id='main']/div/form/fieldset/p")).getText());
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), backup));

        //Mount the shares, delete any contents, and unmount the shares.


        if (!FileSystems.windowsMount(config.get("SMB"))) {
            fail("Failed to mount the Samba Share.\n");
        }
//        if (!FileSystems.windowsMount(config.get("NFS"))) {
//            fail("Failed to mount the NFS Share.\n");
//        }

        if (!FileSystems.clean(config.get("SMB"))) {
            fail("Failed to purge the contents of the SMB share.\n");
        }

//        if (!FileSystems.clean(config.get(("NFS")))) {
//            fail("Failed to purge the contents of the NFS share.\n");
//        }

        if (!FileSystems.windowsUMount(config.get("SMB"))) {
            fail("Failed to unmount the SMB Share.");
        }
//        if (!FileSystems.windowsUMount(config.get("NFS"))) {
//            fail("Failed to unmount the NFS Share.");
//        }

        try {
            //Pre-Emptively Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }
        DateAndTime.set();
        RemoteBackup.configureShare(config.get("SMB"));
        Fetchers.nuke();
        Fetchers.add(fetchers.get("IMAP4"));
        Fetchers.activateAll();
        Fetchers.runGuiTest(fetchers.get("IMAP4"));
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            fail("Couldn't sleep.");
        }
        //Backup
        backup.findElement(By.id("submit")).click();

        if (backup.getCurrentUrl().contains("login")) {
            try {
                Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                String user = cv.get("User");
                String pass = cv.get("Password");
                WebElement username = backup.findElement(By.id("user_login"));
                username.sendKeys(user);
                WebElement passWord = backup.findElement(By.id("user_pass"));
                passWord.sendKeys(pass);
                WebElement loginButton = backup.findElement(By.id("submit"));
                loginButton.click();
                backup.findElement(By.id("submit")).click();
            } catch (Exception e) {
                System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
            }
        }

        assertEquals(ComplianceVault.getServer() + "/status/jobs/details/RemoteBackup/", backup.getCurrentUrl());

        //OK so, gonna do a bunch of content tests on the status page for RemBkup
        //Content tests
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Process Details", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td[2]"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td[2]"), backup));

        //This is the Current Status
        By status = By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td[2]");
        //assertTrue(SelHelpers.isElementPresent(status, backup));

        assertEquals("Process:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b")).getText());
        assertEquals("Start Time:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/b")).getText());
        assertEquals("End Time:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td/b")).getText());
        SelHelpers.verifyTextPresent("No info file detected; performing a full backup.", backup);

        while (backup.findElement(status).getText().equalsIgnoreCase("In-Progress")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.err.println("Failed to Sleep.");
            }
        }

        try {
            //Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }

        try {
            
            //Restore
            Data.Restore(config.get("SMB"));
            backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
            if (backup.getCurrentUrl().contains("login")) {
                try {
                    Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                    String user = cv.get("User");
                    String pass = cv.get("Password");
                    WebElement username = backup.findElement(By.id("user_login"));
                    username.sendKeys(user);
                    WebElement passWord = backup.findElement(By.id("user_pass"));
                    passWord.sendKeys(pass);
                    WebElement loginButton = backup.findElement(By.id("submit"));
                    loginButton.click();

                    backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
                } catch (Exception e) {
                    System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
                }
            }
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/fieldset/dl/dd"), backup));
            if (Integer.parseInt(backup.findElement(By.xpath("//div[@id='main']/div/fieldset/dl/dd")).getText().replace(" [details]", "")) <= 0) {
                fail("No emails were restored from a fetcher mailbox which had more than one message.");
            }

        } catch (Exception ex) {
            fail("Failed to restore the box\n" + ex.getLocalizedMessage());
        }

        //Now the secondary backup. No content tests needed...
        RemoteBackup.configureShare(config.get("SMB"));
        Fetchers.nuke();
        Fetchers.add(fetchers.get("Allison"));
        Fetchers.activateAll();
        Fetchers.runGuiTest(fetchers.get("Allison"));
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            fail("Couldn't sleep.");
        }
        backup.get(ComplianceVault.getServer() + "/rembackup/backup/");
        backup.findElement(By.id("submit")).click();
        while (backup.findElement(status).getText().equalsIgnoreCase("In-Progress")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.err.println("Failed to Sleep.");
            }
        }
        try {
            //Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }

        try {
            DateAndTime.set();
            //Restore
            Data.Restore(config.get("SMB"));
            backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
            if (backup.getCurrentUrl().contains("login")) {
                try {
                    Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                    String user = cv.get("User");
                    String pass = cv.get("Password");
                    WebElement username = backup.findElement(By.id("user_login"));
                    username.sendKeys(user);
                    WebElement passWord = backup.findElement(By.id("user_pass"));
                    passWord.sendKeys(pass);
                    WebElement loginButton = backup.findElement(By.id("submit"));
                    loginButton.click();
                    backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
                } catch (Exception e) {
                    System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
                }
            }
            if (Integer.parseInt(backup.findElement(By.xpath("//div[@id='main']/div/fieldset/dl/dd")).getText().replace(" [details]", "")) <= 0) {
                fail("No emails were restored from a fetcher mailbox which had more than one message.");
            }

        } catch (Exception ex) {
            fail("Failed to restore the box\n" + ex.getLocalizedMessage());
        }
    }

    /**
     * NOTE: This test will work on WINDOWS ONLY
     * This test exists in 5 stages: I) Perform a Factory Reset, wiping any data from previous tests on the machine.
     * II) Add a fetcher named IMAP4, and perform a backup on data fetched. III) Wipe the data, and restore.
     * IV) Add another fetcher named Allison, and perform a backup on fetched data. V) Wipe again, and restore.
     */
    @Test
    public void testNFSRemoteBackup() {
        //This will be the NFS backup code. HOWEVER since we don't have an NFS share...

        By backuplink = By.xpath("//div/li[5]/a/span");
        assertTrue(SelHelpers.isElementPresent(backuplink, backup));
        assertEquals(backup.findElement(backuplink).getText(), "Backup Now");
        backup.findElement(backuplink).click();
        SelHelpers.Delay(backup, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Backup Now", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));
        assertEquals("This will perform an immediate backup of data, to the location specified by Remote Host Config.",
                backup.findElement(By.xpath("//div[@id='main']/div/form/fieldset/p")).getText());
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), backup));

        if (!FileSystems.windowsMount(config.get("NFS"))) {
            fail("Failed to mount the NFS Share.\n");
        }
        if (!FileSystems.clean(config.get(("NFS")))) {
            fail("Failed to purge the contents of the NFS share.\n");
        }
        if (!FileSystems.windowsUMount(config.get("NFS"))) {
            fail("Failed to unmount the NFS Share.");
        }

        try {
            //Pre-Emptively Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }
        DateAndTime.set();
        RemoteBackup.configureShare(config.get("NFS"));
        Fetchers.nuke();
        Fetchers.add(fetchers.get("IMAP4"));
        Fetchers.activateAll();
        Fetchers.runGuiTest(fetchers.get("IMAP4"));
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            fail("Couldn't sleep.");
        }
        //Backup
        backup.findElement(By.id("submit")).click();

        if (backup.getCurrentUrl().contains("login")) {
            try {
                Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                String user = cv.get("User");
                String pass = cv.get("Password");
                WebElement username = backup.findElement(By.id("user_login"));
                username.sendKeys(user);
                WebElement passWord = backup.findElement(By.id("user_pass"));
                passWord.sendKeys(pass);
                WebElement loginButton = backup.findElement(By.id("submit"));
                loginButton.click();
                backup.findElement(By.id("submit")).click();
            } catch (Exception e) {
                System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
            }
        }
        assertEquals(ComplianceVault.getServer() + "/status/jobs/details/RemoteBackup/", backup.getCurrentUrl());
        assertTrue(SelHelpers.isElementPresent(header, backup));
        assertEquals("Process Details", backup.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td/b"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td[2]"), backup));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td[2]"), backup));

        //This is the Current Status
        By status = By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td[2]");
        //assertTrue(SelHelpers.isElementPresent(status, backup));

        assertEquals("Process:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b")).getText());
        assertEquals("Start Time:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/b")).getText());
        assertEquals("End Time:", backup.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td/b")).getText());
        SelHelpers.verifyTextPresent("No info file detected; performing a full backup.", backup);

        while (backup.findElement(status).getText().equalsIgnoreCase("In-Progress")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.err.println("Failed to Sleep.");
            }
        }
        try {
            //Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }
        try {
            //Restore
            Data.Restore(config.get("NFS"));
            backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
            if (backup.getCurrentUrl().contains("login")) {
                try {
                    Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                    String user = cv.get("User");
                    String pass = cv.get("Password");
                    WebElement username = backup.findElement(By.id("user_login"));
                    username.sendKeys(user);
                    WebElement passWord = backup.findElement(By.id("user_pass"));
                    passWord.sendKeys(pass);
                    WebElement loginButton = backup.findElement(By.id("submit"));
                    loginButton.click();
                } catch (Exception e) {
                    System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
                }
            }
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/fieldset/dl/dd"), backup));
            if (Integer.parseInt(backup.findElement(By.xpath("//div[@id='main']/div/fieldset/dl/dd")).getText().replace(" [details]", "")) <= 0) {
                fail("No emails were restored from a fetcher mailbox which had more than one message.");
            }

        } catch (Exception ex) {
            fail("Failed to restore the box\n" + ex.getLocalizedMessage());
        }

        //Now the secondary backup. No content tests needed...
        RemoteBackup.configureShare(config.get("NFS"));
        Fetchers.nuke();
        Fetchers.add(fetchers.get("Allison"));
        Fetchers.activateAll();
        Fetchers.runGuiTest(fetchers.get("Allison"));
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            fail("Couldn't sleep.");
        }
        backup.get(ComplianceVault.getServer() + "/rembackup/backup/");
        backup.findElement(By.id("submit")).click();
        while (backup.findElement(status).getText().equalsIgnoreCase("In-Progress")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.err.println("Failed to Sleep.");
            }
        }
        try {
            //Wipe the box.
            Data.factoryReset(config.get("config"));
        } catch (Exception ex) {
            fail("Failed to reset the box\n" + ex.getLocalizedMessage());
        }

        try {
            DateAndTime.set();
            //Restore
            Data.Restore(config.get("NFS"));
            backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
            if (backup.getCurrentUrl().contains("login")) {
                try {
                    Ini.Section cv = new Ini(new FileReader("compliance-vault-settings.ini")).get("Compliance Vault");
                    String user = cv.get("User");
                    String pass = cv.get("Password");
                    WebElement username = backup.findElement(By.id("user_login"));
                    username.sendKeys(user);
                    WebElement passWord = backup.findElement(By.id("user_pass"));
                    passWord.sendKeys(pass);
                    WebElement loginButton = backup.findElement(By.id("submit"));
                    loginButton.click();
                    backup.get(ComplianceVault.getServer() + "/emails/summarycounts/");
                } catch (Exception e) {
                    System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
                }
            }
            if (Integer.parseInt(backup.findElement(By.xpath("//div[@id='main']/div/fieldset/dl/dd")).getText().replace(" [details]", "")) <= 0) {
                fail("No emails were restored from a fetcher mailbox which had more than one message.");
            }

        } catch (Exception ex) {
            fail("Failed to restore the box\n" + ex.getLocalizedMessage());
        }
    }
}
