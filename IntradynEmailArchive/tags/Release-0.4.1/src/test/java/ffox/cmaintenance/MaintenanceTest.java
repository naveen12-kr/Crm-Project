/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ffox.cmaintenance;

import intradyn.cv.config.Fetchers;
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Maintenance Tab Test Suite.
 * Includes: Update History, Update Now, Client Tools, Maintenance Key, Reboot, SDW (As a factory reset)
 * @author bkett
 * @since 0.2.0
 */
public class MaintenanceTest extends org.junit.Assert {

    private static WebDriver maintenance;
    private static String maintTab = "//div[@id='tabs']/ul/li[6]/a/span";
    private static int sdelay = 5;

    /**
     * Opens the main browser window at the beginning of the test suite.
     */
    @BeforeClass
    public static void setUpClass() {
        try {
            maintenance = ComplianceVault.login();
        } catch (Exception e) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + e.getMessage());
        }
    }

    /**
     * Kills everything after the tests have finished running.
     */
    @AfterClass
    public static void tearDownClass() {
        maintenance.quit();
    }

    /**
     * Navigates to the maintenance section before running any tests.
     */
    @Before
    public void setUp() {
        maintenance.findElement(By.xpath(maintTab)).click();
        SelHelpers.Delay(maintenance, 5);
    }

    /**
     * Resets the delay period after running a test.
     */
    @After
    public void tearDown() {
        SelHelpers.Delay(maintenance, 5);
    }

    /**
     * Checks the GUI of the update history of the Compliance vault.
     */
    @Test
    public void testUpdateHist() {
        //find/assert history link
        By Uhlink = By.xpath("//li[@id='activemenu']/a/span");
        assertTrue(SelHelpers.isElementPresent(Uhlink, maintenance));
        maintenance.findElement(Uhlink).click();
        SelHelpers.Delay(maintenance, sdelay);

        //content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Package Update History", maintenance.findElement(header).getText());
        //find update box
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));
    }

    //Register already has a test
    //Proxy server already has a test
    /**
     * Tests whether the machine is up to date. Will FAIL if it is not.
     */
    @Test
    public void testUpdateNow() {
        By uplink = By.xpath("//div[@id='menu']/ul/div/li[5]/a/span");
        assertTrue(SelHelpers.isElementPresent(uplink, maintenance));
        maintenance.findElement(uplink).click();
        SelHelpers.Delay(maintenance, sdelay);
        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));

        //So, if registration hasn't occurred, problems seem to happen. Added to prevent this
        if (SelHelpers.isElementPresent(By.xpath("//input[@name='online']"), maintenance)) {
            maintenance.findElement(By.xpath("//input[@name='online']")).click();
            ////div[@id='main']/p[2]/a

            if (SelHelpers.isElementPresent(By.xpath("//div[@id='main']/p[2]/a"), maintenance)) {
                maintenance.findElement(By.xpath("//div[@id='main']/p[2]/a")).click();
            }
            if (SelHelpers.isElementPresent(By.xpath("//div[@id='content']/div/p[3]/a"), maintenance)){
                maintenance.findElement(By.xpath("//div[@id='content']/div/p[3]/a")).click();
            }
        }
        maintenance.get(ComplianceVault.getServer()+"/upgrade/update/");
        assertEquals("Update Now", maintenance.findElement(header).getText());

        SelHelpers.Delay(maintenance, 5);
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));
        //assertTrue(SelHelpers.isElementPresent(By.xpath("//table[@id='tableForm']/tbody/tr/td/b"), maintenance));
        assertEquals("Update Information", maintenance.findElement(
                By.xpath("//div[@id='main']/div/table/caption/div/div")).getText());

        if (SelHelpers.isElementPresent(By.xpath("//table[@id='tableForm']/tbody/tr/td/b"), maintenance)) {
            assertEquals("Failed, because the box is not up to date. The RazorSafe needs to be at 5.1.4",
                    "You have the latest version of RazorSafe.", maintenance.findElement(By.xpath("//table[@id='tableForm']/tbody/tr/td/b")).getText());
        }

        By areUpdates = By.xpath("//div[@id='main']/p[3]");
        if (SelHelpers.isElementPresent(areUpdates, maintenance)
                && maintenance.findElement(areUpdates).getText().equals("The RazorSafe can be upgraded to any of the following versions. All preceding versions will be included automatically; so, for example, selecting the latest version would apply all available upgrades in order.")) {
            fail("The RazorSafe is not up to date.");
        }
    }

    /**
     * Tests whether the client tools are accessible from the GUI and that
     * all relevant text is present.
     */
    @Test
    public void testDownloadTools() {
        By toollink = By.xpath("//div[@id='menu']/ul/div[2]/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(toollink, maintenance));
        maintenance.findElement(toollink).click();
        SelHelpers.Delay(maintenance, sdelay);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Download Tools", maintenance.findElement(header).getText());

        //Find the link
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/p[2]/a"), maintenance));
        String mainwindow = maintenance.getWindowHandle();
        maintenance.findElement(By.xpath("//div[@id='main']/p[2]/a")).click();
        SelHelpers.Delay(maintenance, sdelay);
        maintenance.switchTo().window("_different_window");
        //Check Content
        int links_descbegin = 3, links_descend = 20;
        for (int i = links_descbegin; i < links_descend; i += 2) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/td[3]"), maintenance));
            String descript;
            switch (i) {
                case 3:
                    descript = "Search Plug-in for Microsoft Outlook 2003 installer package, including prerequisites for first-time installation. (Build 12524 12/07/2011)";
                    break;
                case 5:
                    descript = "Search Plug-in for Microsoft Outlook 2007/10-x86 installer package, including prerequisites for first-time installation. (Build 12526 - 12/09/2011)";
                    break;
                case 7:
                    descript = "Search Plug-In for Microsoft 2007 (All Users) installer package, including prerequisites for first-time installation. (Build 12526 - 12/09/2011) [Installation Instructions]";
                    break;
                case 9:
                    descript = "Search Plug-in for Microsoft Outlook 2010-x64 installer package, including prerequisites for first-time installation. (Build 12526 - 12/09/2011)";
                    break;
                case 11:
                    descript = "A supplement client side tool to save Outlook contact information. (Build 12525 - 12/07/2011)";
                    break;
                case 13:
                    descript = "Tool to archive email from a Groupwise system. (8/1/2011)";
                    break;
                case 15:
                    descript = "A supplemental server-side tool for Microsoft Exchange Server to transfer historical data. (Build 12517 - 12/05/2011)";
                    break;
                case 17:
                    descript = "A supplemental client-side tool to import/export emails between RazorSafe and PST file (individual or in batch mode) (Build 12509 - 12/02/2011)";
                    break;
                case 19:
                    descript = "Lotus Notes search plugin database and instructions. (12-13-2010)";
                    break;
                default:
                    descript = "FAIL";
                    break;
            }
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/td/a"), maintenance));
            assertEquals(maintenance.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/td[3]")).getText(), descript);
        }
        int headbeg = 2, headend = 18;
        for (int i = headbeg; i <= headend; i += 2) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/th"), maintenance));
            String tool;
            switch (i) {
                case 2:
                    tool = "Search Plug-in for Microsoft Outlook 2003";
                    break;
                case 4:
                    tool = "Search Plug-in for Microsoft Outlook 2007 (Single User Only) and Outlook 2010-x86 (Both Single User and All Users)";
                    break;
                case 6:
                    tool = "Search Plug-in for Microsoft Outlook 2007 (All Users Only)";
                    break;
                case 8:
                    tool = "Search Plug-in for Microsoft Outlook 2010-x64";
                    break;
                case 10:
                    tool = "Tools for Outlook Contacts (Exchange versions 2007+SP1 or 2010 only)";
                    break;
                case 12:
                    tool = "Tools for Novell Groupwise";
                    break;
                case 14:
                    tool = "Tools for Microsoft Exchange Servers (all Exchange versions)";
                    break;
                case 16:
                    tool = "Pst Tools for Microsoft Outlook Pst Files";
                    break;
                case 18:
                    tool = "Tools for IBM Lotus Notes and Domino";
                    break;
                default:
                    tool = "Failed";
            }
            assertEquals(maintenance.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/th")).getText(), tool);
        }

        //stuff missed by loops
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr/th"), maintenance));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr[20]/td[3]"), maintenance));
        assertEquals(maintenance.findElement(By.xpath("//div[@id='content']/table/tbody/tr[20]/td[3]")).getText(),
                "A supplemental server-side tool for IBM Lotus Domino to transfer historical emails. (12-16-2010)");
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='content']/table/tbody/tr[20]/td/a"), maintenance));
        maintenance.switchTo().window(mainwindow);
    }

    /**
     * Tests whether the Compliance Vault has been properly assigned a Key. Will fail if not registered.
     */
    @Test
    public void testKey() {
        By keylink = By.xpath("//div[@id='menu']/ul/div[3]/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(keylink, maintenance));
        assertEquals(maintenance.findElement(keylink).getText(), "Maintenance Key");
        maintenance.findElement(keylink).click();
        SelHelpers.Delay(maintenance, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Maintenance Key Contract", maintenance.findElement(header).getText());

        //box
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));
        int rowNum = 4;
        for (int i = 1; i <= rowNum; i++) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/fieldset/dl[" + i + "]/dt/label"), maintenance));
        }
        assertEquals(maintenance.findElement(By.xpath("//div[@id='main']/div/fieldset/dl[2]/dd")).getText(), "This key is valid and currently subscribed to services.");

    }
    //Skip Logs

    /**
     * Reboots the machine. Passes if supervisor comes back, fails after a 1 hour timeout.
     */
    @Test
    public void testReboot() {
        By rebootlink = By.xpath("//div[@id='menu']/ul/div[4]/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(rebootlink, maintenance));
        assertEquals(maintenance.findElement(rebootlink).getText(), "Reboot/Shutdown");
        maintenance.findElement(rebootlink).click();
        SelHelpers.Delay(maintenance, sdelay);

        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Reboot/Shutdown", maintenance.findElement(header).getText());

        //box
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));
        assertEquals("Select the appropriate option to reboot or shutdown.", maintenance.findElement(
                By.xpath("//div[@id='main']/div/table/caption/div/div")).getText());

        assertTrue(SelHelpers.isElementPresent(By.id("reboot"), maintenance));
        assertTrue(SelHelpers.isElementPresent(By.id("shutdown"), maintenance));
        assertEquals("Reboot", maintenance.findElement(By.id("reboot")).getAttribute("value"));
        assertEquals("Shutdown", maintenance.findElement(By.id("shutdown")).getAttribute("value"));

        //reboot the machine
        maintenance.findElement(By.id("reboot")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), maintenance));

        try {
            //Thread.sleep(15000);

            maintenance.get(ComplianceVault.getServer() + "/auth/login");
            while (SelHelpers.isElementPresent(By.id("user_login"), maintenance)) {
                Thread.sleep(10000);
                maintenance.get(ComplianceVault.getServer() + "/auth/login");
            }
            while (!SelHelpers.isElementPresent(By.id("user_login"), maintenance)) {
                Thread.sleep(10000);
                maintenance.get(ComplianceVault.getServer() + "/auth/login");
            }
            maintenance.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
            maintenance.findElement(By.id("user_login"));
            maintenance.close();
            maintenance = ComplianceVault.login();
            //Thread.sleep(60000);
        } catch (Exception ex) {
            fail();
        }
    }
    //Skip rest

    //TODO: Test Data Retention (1.1.0)
    @Ignore
    private void testRetention() {
        By datalink = By.xpath("//div[@id='menu']/ul/div[5]/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(datalink, maintenance));
        assertEquals(maintenance.findElement(datalink).getText(), "Data Retention Policy");
        maintenance.findElement(datalink).click();
        SelHelpers.Delay(maintenance, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Configure Data Retention Policy", maintenance.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), maintenance));
        assertEquals("Retain email contents on system harddrive",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
        assertTrue(SelHelpers.isElementPresent(By.id("emailretain"), maintenance));
        //dropdown
        int retentionlength = 22;
        dropDown(maintenance.findElement(By.id("emailretain")), retentionlength);
        /*
         * Much more work will need to be done: 1)Construction of a fetcher.
         * Alotting for the emails to get had. 2)Setting up the wipe. 3)Wipe it.
         * 4)Show it's gone.
         */
    }

    /**
     * Runs a factory reset from the GUI. Checks all relevant text and menus
     * to determine if they are present. This test is TIME intensive and also
     * reboots the machine. It is best to NOT interrupt it during execution.
     */
    @Test
    public void testDataWipe() {
        By datalink = By.xpath("//div[@id='menu']/ul/div[5]/li[3]/a/span");
        assertTrue(SelHelpers.isElementPresent(datalink, maintenance));
        assertEquals(maintenance.findElement(datalink).getText(), "Secure Data Wipe");
        maintenance.findElement(datalink).click();
        SelHelpers.Delay(maintenance, 10);

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, maintenance));
        assertEquals("Secure Data Wipe", maintenance.findElement(header).getText());
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div/div"), maintenance));

        int numfields = 3;
        int wipechoices = 4;
        int toarchive_ornot = 2;
        for (int i = 1; i <= numfields; i++) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[" + i + "]/dt/label"), maintenance));

        }
        for (int j = 1; j <= wipechoices; j++) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[" + j + "]/label"), maintenance));
            assertTrue(SelHelpers.isElementPresent(By.id("id_delete_" + (j - 1)), maintenance));

        }
        for (int k = 1; k <= toarchive_ornot; k++) {
            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li[" + k + "]/label"), maintenance));
            assertTrue(SelHelpers.isElementPresent(By.id("id_archive_" + (k - 1)), maintenance));
        }
        assertTrue(SelHelpers.isElementPresent(By.id("id_sdwcode"), maintenance));

        assertEquals("Data Wipe Policy",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
        assertEquals("Pre-SDW Archive",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label")).getText());
        assertEquals("Force Code",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label")).getText());

        assertEquals("Fast - delete only, not wiped",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li/label")).getText());
        assertEquals("Quick Secure - wiped 3 times",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[2]/label")).getText());
        assertEquals("More Secure - wiped 7 times",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[3]/label")).getText());
        assertEquals("Most Secure (Peter Gutmann method) - wiped 35 times",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[4]/label")).getText());

        assertEquals("Archive the emails to tape before wiping them from the disk.",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li/label")).getText());
        assertEquals("Perform Secure Data Wipe now (no archive).",
                maintenance.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li[2]/label")).getText());

        assertTrue(SelHelpers.isElementPresent(By.id("submit"), maintenance));
        assertTrue(SelHelpers.isElementPresent(By.id("cancel"), maintenance));
        assertEquals("Begin Data Wipe", maintenance.findElement(By.id("submit")).getAttribute("value"));
        assertEquals("Cancel", maintenance.findElement(By.id("cancel")).getAttribute("value"));

        //blank submit
        maintenance.findElement(By.id("submit")).click();
        maintenance.switchTo().alert().accept();
        SelHelpers.Delay(maintenance, 10);
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), maintenance));

        maintenance.findElement(By.id("id_sdwcode")).sendKeys("hahahahahahahhbooohoo");
        maintenance.findElement(By.id("submit")).click();
        maintenance.switchTo().alert().accept();
        assertTrue(SelHelpers.isElementPresent(By.className("error"), maintenance));

        maintenance.findElement(By.id("id_sdwcode")).clear();
        //Factory Wipe Code: SRM-FC-FAC-RST

        //Nuke fetchers if they exist!
        Fetchers.nuke();
        //Add a fetcher!
        Fetchers.add(Fetchers.Protocol.IMAP4, "IMAP4", "Intradyn1", "10.100.1.220");

        //Click the right buttons
        maintenance.findElement(By.id("id_delete_0")).click();
        maintenance.findElement(By.id("id_archive_1")).click();

        //Kill the box!
        String factoryResetCode = "SRM-FC-FAC-RST";
        maintenance.findElement(By.id("id_sdwcode")).sendKeys(factoryResetCode);
        maintenance.findElement(By.id("submit")).click();
        maintenance.switchTo().alert().accept();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            fail("Couldn't Sleep.");
        }
        maintenance.get(ComplianceVault.getServer() + "/down/");
        try {

            while (!(SelHelpers.isElementPresent(By.xpath("//img[@alt='Alert']"), maintenance))) {
                Thread.sleep(10000);
            }
            maintenance.findElement(By.xpath("//img[@alt='Alert']")).click();
            assertTrue(SelHelpers.isElementPresent(By.xpath("//input[@name='CMD']"), maintenance));
            maintenance.findElement(By.xpath("//input[@name='CMD']")).click();

            //special login
            Integer special_count = 0;
            while (!SelHelpers.isElementPresent(By.id("user_login"), maintenance)) {
                Thread.sleep(10000);
                maintenance.get(ComplianceVault.getServer() + "/auth/login");
                special_count++;
                if (special_count > 360) {
                    fail("Waited 1 hour and can't get login page.");
                }
            }
            maintenance.close();
            maintenance = ComplianceVault.login();

            //Ok so the EULA pops up here. Gonna just deal with it.
            assertTrue(SelHelpers.isElementPresent(By.id("accept"), maintenance));
            maintenance.findElement(By.id("accept")).click();

            //So this is some validation that no fetchers exist after a wipe. Not sure why but this is a good measure of success.
            maintenance.get(ComplianceVault.getServer() + "/fetch/config/");
            assertEquals("no active fetchers", maintenance.findElement(
                    By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/i")).getText());
            assertEquals("no inactive fetchers", maintenance.findElement(
                    By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td/i")).getText());
        } catch (Exception ex) {
            fail("System did not come back up.\n"+ex.getMessage());
        }
    }

    @Ignore
    private static void dropDown(WebElement element, int length) {
        try {
            assertTrue(element.isEnabled());

        } catch (AssertionError e) {
            System.err.println("The dropdown menu is not enabled on the HTML"
                    + "page.");
        }
        try {
            assertTrue(element.isDisplayed());
        } catch (AssertionError e) {
            System.err.println("This dropdown menu is not displayed on the HTML"
                    + "page.");
        }
        Select select = new Select(element);
        List<WebElement> eleList = select.getOptions();

        int count = 0;
        for (WebElement e : eleList) {
            e.click();
            count++;
        }
        assertEquals(length, count);
    }
}
