package ffox.bconfiguration;

import intradyn.cv.config.Fetchers;
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Test class for the Configuration tab of ComplianceVault 5.1.4 web portal.
 * (Supervisor screen)
 *
 * @author bkett
 * @since 0.1.0
 */
public class ConfigurationTest extends junit.framework.Assert {

     private static String configTab = "//div[@id='tabs']/ul/li[7]/a/span";
    private static WebDriver register;
    private static int ntpButtonIndex = 1;
    private static int manualButtonIndex = 0;
    private static String fetcherServ = "10.100.1.220";

    /**
     * Instantiates the browser.
     *
     */
    @BeforeClass
    public static void setUpOnce() {
        try {
            register = ComplianceVault.login();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    /**
     * Refresh page to root for test (Configuration tab)
     *     
     */
    @Before
    public void setUp() {
        register.findElement(By.xpath(configTab)).click();
        SelHelpers.Delay(register, 5);
    }

    /**
     * Tests the existence of and the functionality of the "Register Product"
     * link in the menu bar of the Configuration tab. This is accomplished by
     * Asserting the existence of the header for the page and that the content
     * matches what is displayed in Razorsafe 5.1.4. This test DOES NOT include
     * asserting the ability to register. This is by design and will not be
     * implemented in version 1.0.0
     *
     */
    @Test
    public void testRegistration() {
        String registerMenuLink = "//div[@id='menu']/ul/div[1]/li[2]/a/span";
        String regHeader = "//div[@id='main']/h1";

        //Assert that the Register Product link exists.
        By test = By.xpath(registerMenuLink);
        assertTrue(SelHelpers.isElementPresent(test, register));

        //Assert that the Register Settings Header Exists
        SelHelpers.Delay(register, 5);
        By testH = By.xpath(regHeader);
        assertTrue(SelHelpers.isElementPresent(testH, register));

        //Assert the content matches.
        String regText = "Product Registration";
        assertEquals(register.findElement(testH).getText(), regText);

    }

    /**
     * Tests the existence of and the functionality of the "Email Settings" link
     * in the menu bar of the Configuration tab. This test asserts the existence
     * of the header, the select menus, and additionally validates the displayed
     * text matches what was posted in Razorsafe 5.1.4. The test clicks on all
     * of the options in each select menu and checks to see if the number of
     * options is correct. Finally, Default settings are submitted and test
     * concludes with validating submission successful.
     *
     */
    @Test
    public void testEmailSettings() {
        //Constants
        String emailSetMenu = "//div[@id='menu']/ul/div[2]/li[2]/a/span";
        String emailSetHeader = "//div[@id='main']/h1";
        //Assert that the Email settings Menu Exists
        By test = By.xpath(emailSetMenu);
        assertTrue(SelHelpers.isElementPresent(test, register));
        register.findElement(test).click();

        //Assert that the header for Email Settings exists
        By test2 = By.xpath(emailSetHeader);
        assertTrue(SelHelpers.isElementPresent(test2, register));

        //Assert the content matches.
        String emailSetText = "Email Settings";
        assertEquals(register.findElement(test2).getText(), emailSetText);

        //Check the Dropdown Menus
        //Assert the dropdown menus exist.
        String charDID = "id_charset";
        String eStorageDID = "id_emailstorage";

        By cD = By.id(charDID);
        assertTrue(SelHelpers.isElementPresent(cD, register));
        By eD = By.id(eStorageDID);
        assertTrue(SelHelpers.isElementPresent(eD, register));

        //Assert the Titles are correct
        String charDTitle = "//div[@id='main']/div/form/fieldset/dl/dt";
        String emailDTitle = "//div[@id='main']/div/form/fieldset/dl[2]/dt";
        String charDropdown = "Default Charset";
        String emailDropdown = "Email Storage Scheme";

        assertEquals(register.findElement(
                By.xpath(charDTitle)).getText(), charDropdown);
        assertEquals(register.findElement(
                By.xpath(emailDTitle + "/label")).getText(), emailDropdown);

        /*
         * Assert the menu items are Selectable, and that the correct number of
         * options for each dropdown menu exist.
         */
        dropDown(register.findElement(cD), 7);
        if (register.findElement(eD).isEnabled()) {
            dropDown(register.findElement(eD), 2);
        }

        Select s = new Select(register.findElement(By.id("id_charset")));
        s.getOptions().get(1).click();
        SelHelpers.Delay(register, 5);

        //Assert Save button exists.
        String saveID = "submit";
        assertTrue(SelHelpers.isElementPresent(By.id(saveID), register));

        //Click it!
        register.findElement(By.id(saveID)).click();
        SelHelpers.Delay(register, 5);

        //Assert that the button works by checking to see if an element with the 
        //class name success appears.
        assertTrue(SelHelpers.isElementPresent(By.className("success"),
                register));

        //Reset to defaults
        register.findElement(test).click();
        s = new Select(register.findElement(By.id("id_charset")));
        s.getOptions().get(0).click();
        register.findElement(By.id(saveID)).click();

    }

    /**
     * Tests the existence of and the functionality of the "Default User
     * Settings" link in the menu bar of the Configuration tab. This test
     * validates the existence of the header, the select menus, the spans of the
     * menus, as well as assessing the options of each select menu (exists).
     * Default settings are submitted and test concludes with validating
     * submission successful.
     *
     */
    @Test
    public void testUserSettings() {
        String userSetMenu = "//div[@id='menu']/ul/div[2]/li[3]/a/span";
        String userSetHeader = "//div[@id='main']/h1";
        //assert that the User settings Menu Exists
        By test = By.xpath(userSetMenu);
        assertTrue(SelHelpers.isElementPresent(test, register));
        register.findElement(test).click();

        //assert that the header for User Settings exists
        By test2 = By.xpath(userSetHeader);
        assertTrue(SelHelpers.isElementPresent(test2, register));

        //assert the content matches.
        String userSetText = "Default User Settings";
        assertEquals(register.findElement(test2).getText(), userSetText);

        //assert the Titles are correct
        String langDTitle = "//div[@id='main']/div/form/fieldset/dl/dt";
        String timeDTitle = "//div[@id='main']/div/form/fieldset/dl[2]/dt";
        String langDropdown = "Default Language";
        String timeDropdown = "Time Zone";

        assertEquals(register.findElement(
                By.xpath(langDTitle)).getText(), langDropdown);
        assertEquals(register.findElement(
                By.xpath(timeDTitle + "/label")).getText(), timeDropdown);

        //Check the Dropdown Menus
        //assert the dropdown menus exist.
        String langDID = "id_language";
        String timeDID = "id_timezone";

        By lD = By.id(langDID);
        assertTrue(SelHelpers.isElementPresent(lD, register));
        By tD = By.id(timeDID);
        assertTrue(SelHelpers.isElementPresent(tD, register));

        //assert the menu items are Selectable, and that the correct number 
        //of options for each dropdown menu exist.
        Select lSelect = new Select(register.findElement(lD));
        List<WebElement> langL = lSelect.getOptions();

        int count = 0;
        for (WebElement e : langL) {
            e.click();
            count++;
        }
        assertEquals(4, count);


        //  Code to test the second dropdown in Default User Settings
        Select tSelect = new Select(register.findElement(tD));
        List<WebElement> timeZoneL =
                tSelect.getOptions();
        count = 0;
        for (WebElement e : timeZoneL) {
            e.click();
            count++;
        }
        assertEquals(404, count);
        timeZoneL.get(0).click();


        //Sets the Char Menu.
        langL.get(1).click();
        SelHelpers.Delay(register, 5);

        //assert Save button exists.
        String saveID = "submit";
        assertTrue(SelHelpers.isElementPresent(By.id(saveID), register));

        //Click it!
        register.findElement(By.id(saveID)).click();
        SelHelpers.Delay(register, 5);

        //assert that the button works by checking to see if an element with the 
        //class name success appears.
        assertTrue(SelHelpers.isElementPresent(By.className("success"),
                register));
    }

    /**
     * Tests the existence of and the functionality of the "Set Date/Time" link
     * in the menu bar of the Configuration tab. This test validates the
     * existence of the header and the NTP Server selection radio button. Then
     * it checks the select menus, and the spans of the menus, as well as
     * assessing the options of each select menu for in terms of number for the
     * generated options. A slew of invalid text is entered into the textbox.
     * This is submitted and test concludes with validating submission
     * successful.
     *
     */
    @Test
    public void testSetTimeNTP() {

        String dateTimeMenu = "//div[@id='menu']/ul/div[2]/li[4]/a/span";
        String dateTimeHeader = "//div[@id='main']/h1";
        //assert that the Date/Time settings Menu exists
        By test = By.xpath(dateTimeMenu);
        assertTrue(SelHelpers.isElementPresent(test, register));
        register.findElement(test).click();

        //assert that the header for Date/Time settings exists
        By test2 = By.xpath(dateTimeHeader);
        assertTrue(SelHelpers.isElementPresent(test2, register));

        //assert the content matches.
        String timeDateText = "Set Time and Date";
        assertEquals(register.findElement(test2).getText(), timeDateText);

        //Check the Menus
        //assert the menus exist.
        String timeDID = "id_curZone";
        String methodRName = "method";

        By timeD = By.id(timeDID);
        assertTrue(SelHelpers.isElementPresent(timeD, register));

        By methodR = By.name(methodRName);
        assertTrue(SelHelpers.areElementsPresent(methodR, register));

        //assert the Titles are correct
        String timezone = "//div[@id='main']/div/form/fieldset/dl/dt";
        String timeMethod = "//div[@id='main']/div/form/fieldset/dl[2]";

        String lang = "Your Timezone";
        String methodRadio = "Time Determination Method";

        assertEquals(register.findElement(
                By.xpath(timezone + "/label")).getText(), lang);
        assertEquals(register.findElement(
                By.xpath(timeMethod + "/dt/label")).getText(), methodRadio);

        //assert the menu items are Selectable, and that the correct number 
        //of options for each dropdown menu exist.
        List<WebElement> radio = register.findElements(methodR);
        radio.get(ntpButtonIndex).click();

        if (register.findElement(By.xpath("//input[@id='id_method_1']")).isSelected()
                && register.findElement(By.xpath("//fieldset[@class='nomargin']/dl[2]/dd/ul/li[2]/label")).getText().equals(
                "Synchronize with NTP Server")) {
            //assert the correct submenus appear
            String preSetNTPD = "id_ntppreselects";
            String ntpServsTB = "id_ntpservers";
            By presetD = By.id(preSetNTPD);
            assertTrue(SelHelpers.isElementPresent(presetD, register));
            By ntpServTB = By.id(ntpServsTB);
            assertTrue(SelHelpers.isElementPresent(ntpServTB, register));

            //assert the titles are correct
            String ntpPresets = "//div[@id='main']/div/form/fieldset/dl[4]/dt";
            String servs = "//div[@id='main']/div/form/fieldset/dl[5]/dt";
            String servsDropDown = "Preselected NTP Servers";
            String servsBox = "NTP Servers";

            assertEquals(register.findElement(
                    By.xpath(ntpPresets + "/label")).getText(), servsDropDown);
            assertEquals(register.findElement(
                    By.xpath(servs + "/label")).getText(), servsBox);

            //Play with the new Boxes
            dropDown(register.findElement(By.id(preSetNTPD)), 8);
            WebElement servAddr = register.findElement(By.id(ntpServsTB));
            servAddr.clear();
            servAddr.sendKeys("Boo Yah Baby! abcdefghijklmnopqrstuvwxyz"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456790-="
                    + " ,./`;'[]\\~!@#$%^&*()_+<>?:\"{}|");
        } else {
            fail("The requisite NTP radio Button isn't present. Check the HTML.");
        }
        //assert Save button exists.
        String saveID = "submit";
        assertTrue(SelHelpers.isElementPresent(By.id(saveID), register));
        //Click it!
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"),
                register));
    }

    /**
     * Tests the existence of and the functionality of the "Set Date/Time" link
     * in the menu bar of the Configuration tab. This test validates the
     * existence of the header and the Set Time Manually radio button. A slew of
     * invalid text is entered into the textbox. This is submitted, and the test
     * asserts a failure dialogue. valid text is entered and the test then
     * concludes with validating submission successful.
     *
     */
    @Test
    public void testSetTimeManual() {
        String dateTimeMenu = "//div[@id='menu']/ul/div[2]/li[4]/a/span";
        String dateTimeHeader = "//div[@id='main']/h1";
        //assert that the Date/Time settings Menu exists
        By test = By.xpath(dateTimeMenu);
        assertTrue(SelHelpers.isElementPresent(test, register));
        register.findElement(test).click();

        //assert that the header for Date/Time settings exists
        By test2 = By.xpath(dateTimeHeader);
        assertTrue(SelHelpers.isElementPresent(test2, register));

        //assert the content matches.
        String timeDateText = "Set Time and Date";
        assertEquals(register.findElement(test2).getText(), timeDateText);

        //Check the Menus
        //assert the menus exist.
        String timeDID = "id_curZone";
        String methodRName = "method";

        By timeD = By.id(timeDID);
        assertTrue(SelHelpers.isElementPresent(timeD, register));

        By methodR = By.name(methodRName);
        assertTrue(SelHelpers.areElementsPresent(methodR, register));

        //assert the Titles are correct
        String timezone = "//div[@id='main']/div/form/fieldset/dl/dt";
        String timeMethod = "//div[@id='main']/div/form/fieldset/dl[2]";

        String lang = "Your Timezone";
        String methodRadio = "Time Determination Method";

        assertEquals(register.findElement(
                By.xpath(timezone + "/label")).getText(), lang);
        assertEquals(register.findElement(
                By.xpath(timeMethod + "/dt/label")).getText(), methodRadio);


        //assert the menu items are Selectable, and that the correct number 
        //of options for each dropdown menu exist.
        List<WebElement> radio = register.findElements(methodR);
        radio.get(manualButtonIndex).click();

        if (register.findElement(By.xpath("//input[@id='id_method_0']")).isSelected()
                && register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl[2]/dd/ul/li/label")).getText().equals("Set Time Manually")) {

            //assert the correct submenus appear
            String curDateTimeTBID = "id_datetime";
            By dateTimeTB = By.id(curDateTimeTBID);
            assertTrue(SelHelpers.isElementPresent(dateTimeTB, register));
            //assert the titles are correct
            String curDateTime = "//div[@id='main']/div/form/fieldset/dl[3]/dt";
            String dateTimeBox = "Date and Time";
            assertEquals(register.findElement(
                    By.xpath(curDateTime + "/label")).getText(), dateTimeBox);

            WebElement failBox = register.findElement(By.id(curDateTimeTBID));
            failBox.clear();
            failBox.sendKeys("Boo Hoo!");

            String saveID = "submit";
            assertTrue(SelHelpers.isElementPresent(By.id(saveID), register));
            register.findElement(By.id(saveID)).click();
            assertTrue(SelHelpers.isElementPresent(By.xpath("//ul[@class='errorlist']"), register));
            WebElement textBox = register.findElement(By.id(curDateTimeTBID));
            textBox.clear();
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nou = simple.format(date);
            register.findElement(By.id("id_datetime")).sendKeys(nou);
            register.findElement(By.id(saveID)).click();
            assertTrue(SelHelpers.isElementPresent(By.className("success"),
                    register));
        } else {
            fail("The requisite buttons aren't present. Check the HTML.");
        }

        //assert Save button exists.
        String saveID = "submit";
        assertTrue(SelHelpers.isElementPresent(By.id(saveID), register));
        //Click it!
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"),
                register));
    }

    /**
     * Tests the existence of and the functionality of the "SMTP Server: link in
     * the menu bar of the configuration tab. This test validates all of the
     * features present in the supervisor as of 5.1.4, such as headers, inputs
     * etc. This test is coupled to the Email Viewing Test Suite.
     *
     */
    @Test
    public void testSTMPServer() {

        //Move to SMTP config.
        String smtpLink = "//div[@id='menu']/ul/div[4]/li[3]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(smtpLink), register));
        register.findElement(By.xpath(smtpLink)).click();

        //Check Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/h1"), register));
        assertEquals("SMTP Configuration",
                register.findElement(By.xpath("//div[@id='main']/h1")).getText());

        //Assert existence of SMTP status.
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/form/dl/dt/label"), register));

        //Assert the existance of the Start/Stop Button
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@class='button1']"), register));

        //Turn on SMTP if it's off
        if (register.findElement(By.xpath("//input[@class='button1']")).getAttribute("value").equals("Start Now")) {
            register.findElement(By.xpath("//input[@class='button1']")).click();
            assertEquals("SMTP Server is currently running.",
                    register.findElement(
                    By.xpath("//fieldset[@class='nomargin']/form/dl/dt/label")).getText());
        }

        //Turn off SMTP
        register.findElement(By.xpath("//input[@class='button1']")).click();
        assertEquals("SMTP Server is currently stopped.",
                register.findElement(
                By.xpath("//fieldset[@class='nomargin']/form/dl/dt/label")).getText());

        //Check Hosts Table
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div[2]/table/caption/div"), register));
        assertEquals("SMTP Authorized Hosts", register.findElement(
                By.xpath("//div[@id='main']/div[2]/table/caption/div")).getText());

        //Check to see if there are any hosts entered in
        if (!SelHelpers.isElementPresent(By.xpath("//td[@class='norowth row1']/em"), register)) {
            //Nuke em
            while (SelHelpers.isElementPresent(
                    By.xpath("//td[@class='row1 Center']/form/input[2]"), register)) {
                register.findElement(
                        By.xpath("//td[@class='row1 Center']/form/input[2]")).click();
                register.switchTo().alert().accept();
            }
            //Double Tap
            assertTrue(SelHelpers.isElementPresent(By.xpath("//td[@class='norowth row1']/em"), register));
        }
        //Add a blank server
        assertTrue(SelHelpers.isElementPresent(By.id("id_newName"), register));
        register.findElement(By.id("id_newName")).clear();
        register.findElement(By.name("add")).click();

        //Check it fails
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));

        //Add a good one
        register.findElement(By.id("id_newName")).clear();
        register.findElement(By.id("id_newName")).sendKeys("abc");
        register.findElement(By.name("add")).click();

        //confirm
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td"), register));

        //Nuke it
        register.findElement(
                By.xpath("//td[@class='row1 Center']/form/input[2]")).click();
        register.switchTo().alert().accept();
        //Double Tap
        assertTrue(SelHelpers.isElementPresent(By.xpath("//td[@class='norowth row1']/em"), register));
    }

    /**
     * Tests the existence of and the functionality of the "Email Notification"
     * link in the menu bar of the configuration tab.This test validates all of
     * the features present in the supervisor as of 5.1.4, such as headers,
     * inputs etc. This test is coupled to the SMTP Server test.
     *
     */
    @Test
    public void testEmailNotification() {

        //Move to Email Notification config.
        String emailNoteLink = "//div[@id='menu']/ul/div[3]/li[2]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='menu']/ul/div[3]/li[2]/a/span"), register));
        register.findElement(By.xpath(emailNoteLink)).click();

        //Check off all the txt boxes
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_adminemail']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_server']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_username']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_password']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_fromaddress']"), register));

        //Better have the right titles
        assertEquals("Admin Email Address", register.findElement(
                By.xpath("//label[@for='id_adminemail']")).getText());
        assertEquals("Outgoing Mail Server", register.findElement(
                By.xpath("//label[@for='id_server']")).getText());
        assertEquals("Mail Server Username", register.findElement(
                By.xpath("//label[@for='id_username']")).getText());
        assertEquals("Mail Server Password", register.findElement(
                By.xpath("//label[@for='id_password']")).getText());
        assertEquals("From Address", register.findElement(
                By.xpath("//label[@for='id_fromaddress']")).getText());

        //Better be able to find inputs
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_adminemail"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_server"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_username"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_password"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_fromaddress"), register));

        //Check the save (&Test Message) buttons
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        assertTrue(SelHelpers.isElementPresent(By.name("test"), register));

        //Clear anything out just in case (very useful for an aborted test!).
        if (SelHelpers.isElementPresent(By.name("disable"), register)) {
            register.findElement(By.name("disable")).click();
            register.findElement(By.xpath(emailNoteLink)).click();
        }
        //Attempt blank submit
        register.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));

        //Turn on SMTP
        SMTP(true);

        //Fill in fields
        register.findElement(By.id("id_adminemail")).clear();
        register.findElement(By.id("id_server")).clear();
        register.findElement(By.id("id_username")).clear();
        register.findElement(By.id("id_password")).clear();
        register.findElement(By.id("id_fromaddress")).clear();

        register.findElement(By.id("id_adminemail")).sendKeys("joe@2001:0db8::1428:57ab");
        register.findElement(By.id("id_server")).sendKeys("localhost");
        register.findElement(By.id("id_username")).sendKeys("abc");
        register.findElement(By.id("id_password")).sendKeys("abc");
        register.findElement(By.id("id_fromaddress")).sendKeys(
                "1234567890.0987654321@EXAMPLE.WHATEVER.ABC.123.CAT");

        //Check the save button
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        register.findElement(By.id("submit")).click();
        //Make sure it succeeded.
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));

        //Refresh, Clear the fields and attempt a test message
        register.findElement(By.xpath(emailNoteLink)).click();
        register.findElement(By.id("id_adminemail")).clear();
        register.findElement(By.id("id_server")).clear();
        register.findElement(By.id("id_username")).clear();
        register.findElement(By.id("id_password")).clear();
        register.findElement(By.id("id_fromaddress")).clear();
        register.findElement(By.name("test")).click();
        //Make sure it failed.
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));

        //Fill em in and send test
        register.findElement(By.id("id_adminemail")).sendKeys("joe@2001:0db8::1428:57ab");
        register.findElement(By.id("id_server")).sendKeys("localhost");
        register.findElement(By.id("id_username")).sendKeys("");
        register.findElement(By.id("id_password")).sendKeys("");
        register.findElement(By.id("id_fromaddress")).sendKeys(
                "1234567890.0987654321@EXAMPLE.WHATEVER.ABC.123.CAT");
        register.findElement(By.name("test")).click();

        //Make sure it succeeded.
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));

        //Refresh, Find "Turn off Button" and disable
        register.findElement(By.xpath(emailNoteLink)).click();
        assertTrue(SelHelpers.isElementPresent(By.name("disable"), register));
        register.findElement(By.name("disable")).click();
        //Make sure it succeeded.
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));

        //TODO: Check to see test message was sent. Target: 1.0.1 (Couples Email Viewer.)

        //Turn off smtp
        SMTP(false);
    }

    /**
     * Tests the existence of and the functionality of the "Proxy Server" link
     * in the menu bar of the configuration tab. This test validates all of the
     * features present in the supervisor as of 5.1.4, such as headers, inputs
     * etc.
     *
     */
    @Test
    public void testProxyServer() {

        //Move to proxy config.
        String proxyLink = "//div[@id='menu']/ul/div[3]/li[3]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(proxyLink), register));
        register.findElement(By.xpath(proxyLink)).click();

        //Better have the right labels
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_proxyurl']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_proxyport']"), register));

        //Better have the right titles
        assertEquals("Proxy Server", register.findElement(
                By.xpath("//label[@for='id_proxyurl']")).getText());
        assertEquals("Port Number", register.findElement(
                By.xpath("//label[@for='id_proxyport']")).getText());

        //Better be able to find inputs
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_proxyurl"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_proxyport"), register));

        //Check the save (&Test Proxy) buttons
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        assertTrue(SelHelpers.isElementPresent(By.name("test"), register));

        //Clear it out, save. Just in case
        register.findElement(By.id("id_proxyurl")).clear();
        register.findElement(By.id("id_proxyport")).clear();
        register.findElement(By.id("submit")).click();

        //Attempt blank submit
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        assertEquals("Proxy server is now disabled",
                register.findElement(By.className("success")).getText());

        //Go back, try other button
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.name("test")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        assertEquals("Proxy server is now disabled",
                register.findElement(By.className("success")).getText());

        //Go back, clear out the fields, submit bogus info.
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.id("id_proxyurl")).clear();
        register.findElement(By.id("id_proxyport")).clear();

        register.findElement(By.id("id_proxyurl")).sendKeys("10.100.1.1");
        register.findElement(By.id("id_proxyport")).sendKeys("NOU");

        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        //Make sure it failed.
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));


        //Go back, try again (test) with legit info
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.id("id_proxyurl")).clear();
        register.findElement(By.id("id_proxyport")).clear();
        register.findElement(By.id("id_proxyurl")).sendKeys("10.100.1.1");
        register.findElement(By.id("id_proxyport")).sendKeys("8080");

        assertTrue(SelHelpers.isElementPresent(By.name("test"), register));
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        assertEquals("Proxy server is now http://10.100.1.1:8080",
                register.findElement(By.className("success")).getText());

        //Go back, try again (submit) with legit info
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.id("id_proxyurl")).clear();
        register.findElement(By.id("id_proxyport")).clear();
        register.findElement(By.id("id_proxyurl")).sendKeys("http://10.100.1.1");
        register.findElement(By.id("id_proxyport")).sendKeys("8080");

        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        assertEquals("Proxy server is now http://10.100.1.1:8080",
                register.findElement(By.className("success")).getText());

        //Clear it out, save.
        register.findElement(By.xpath(proxyLink)).click();
        register.findElement(By.id("id_proxyurl")).clear();
        register.findElement(By.id("id_proxyport")).clear();
        register.findElement(By.id("submit")).click();
    }

    /**
     * Tests the existence of and the functionality of the "Network Server
     * Control" link in the menu bar of the configuration tab. This test
     * validates all of the features present in the supervisor as of 5.1.4, such
     * as headers, inputs etc.
     *
     */
    @Test
    public void testNetworkServerControl() {
        //Move to network config.
        String servLink = "//div[@id='menu']/ul/div[3]/li[4]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(servLink), register));
        register.findElement(By.xpath(servLink)).click();

        //Better have the right labels
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl/dt/label"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl[2]/dt/label"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl[3]/dt/label"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl[4]/dt/label"), register));

        //Better have the right titles
        assertEquals("HTTP", register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl/dt/label")).getText());
        assertEquals("HTTPS", register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl[2]/dt/label")).getText());
        assertEquals("SSH", register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl[3]/dt/label")).getText());
        assertEquals("SNMP", register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl[4]/dt/label")).getText());

        //Check the buttons
        assertTrue(SelHelpers.isElementPresent(
                By.id("lighttpd"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("lighttpd.ssl"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("sshd"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("snmpd"), register));

        //Hypothetical case
        if (!register.findElement(By.id("lighttpd")).getAttribute("class").equals("on disabled")) {
            register.findElement(By.id("lighttpd")).click();
            assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        }

        //additional robustness
        if (register.findElement(By.id("lighttpd.ssl")).getText().equals("Running")) {
            register.findElement(By.id("lighttpd.ssl")).click();
            SelHelpers.Delay(register, 5);
            assertEquals("Stopped",
                    register.findElement(By.id("lighttpd.ssl")).getText());
        }
        if (register.findElement(By.id("sshd")).getText().equals("Stopped")) {
            register.findElement(By.id("sshd")).click();
            SelHelpers.Delay(register, 5);
            assertEquals("Running",
                    register.findElement(By.id("sshd")).getText());
        }
        if (register.findElement(By.id("snmpd")).getText().equals("Stopped")) {
            register.findElement(By.id("snmpd")).click();
            SelHelpers.Delay(register, 5);
            assertEquals("Running",
                    register.findElement(By.id("snmpd")).getText());
        }

        //Turn em off/on
        register.findElement(By.id("lighttpd.ssl")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Running",
                register.findElement(By.id("lighttpd.ssl")).getText());


        register.findElement(By.id("sshd")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Stopped",
                register.findElement(By.id("sshd")).getText());

        register.findElement(By.id("snmpd")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Stopped",
                register.findElement(By.id("snmpd")).getText());

        //Do it again
        register.findElement(By.id("lighttpd.ssl")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Stopped",
                register.findElement(By.id("lighttpd.ssl")).getText());


        register.findElement(By.id("sshd")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Running",
                register.findElement(By.id("sshd")).getText());

        register.findElement(By.id("snmpd")).click();
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);
        assertEquals("Running",
                register.findElement(By.id("snmpd")).getText());

        //Check the mibs link
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl[4]/dd/a"), register));
        //TODO: Add Download Handling. Will require AutoIt. Target: 1.1.0
        //register.findElement(
        //      By.xpath("//fieldset[@class='nomargin']/dl[4]/dd/a")).click();
        //register.switchTo().alert().dismiss();
    }

    /**
     * Creates and tests fetchers for all supported Protocols. Checks GUI page
     * for correct text and operation of input boxes.
     */
    @Test
    public void testFetchers() {
        //Move to fetcher config.
        String fetcherLink = "//div[@id='menu']/ul/div[4]/li[2]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(fetcherLink), register));
        register.findElement(By.xpath(fetcherLink)).click();

        //Check Title
        String fetchTitle = "//div[@id='main']/h1";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(fetcherLink), register));
        assertEquals("Email Fetcher Configurations",
                register.findElement(By.xpath(fetchTitle)).getText());

        //Check wrappers
        String activeBox = "//div[@id='main']/div/table/caption/div/div";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(activeBox), register));
        assertEquals("Active Fetchers",
                register.findElement(By.xpath(activeBox)).getText());

        String inActiveBox = "//div[@id='main']/div[2]/table/caption/div/div";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(inActiveBox), register));
        assertEquals("Inactive Fetchers",
                register.findElement(By.xpath(inActiveBox)).getText());

        //Find fetcher input and button
        By fetch = By.id("id_newName");
        By addFetch = By.className("button1");
        assertTrue(SelHelpers.isElementPresent(fetch, register));
        assertTrue(SelHelpers.isElementPresent(addFetch, register));
        //Content
        assertEquals("Add Fetcher",
                register.findElement(addFetch).getAttribute("value"));

        //Check blank name
        register.findElement(By.className("button1")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(
                By.className("errorlist"), register));

//        //Before entering into config form, NUKE Em!
        Fetchers.nuke(register);
        //Double tap
        assertEquals("no active fetchers", register.findElement(
                By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/i")).getText());
        assertEquals("no inactive fetchers", register.findElement(
                By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td/i")).getText());

        //send foo
        register.findElement(By.id("id_newName")).click();
        register.findElement(fetch).sendKeys("foo");
        register.findElement(addFetch).click();
        SelHelpers.Delay(register, 5);

        //1) Test elements on add fetcher page

        /*
         * Looking for the Titles The assertions are in order: Config Name,
         * Server Addr, Description, UserName, Pwd, Active Server, Protocol,
         * Port, Mailbox, Create Addtl Email Deletion, Timeout
         */
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_cname']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_saddr']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_desc']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_uname']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_pword']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_active']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_proto']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_port']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_mailbox']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_mirhack']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//fieldset[@class='nomargin']/dl[11]/dt/label"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//label[@for='id_timelimit']"), register));

        //Check Titles Text
        assertEquals("Configuration Name", register.findElement(
                By.xpath("//label[@for='id_cname']")).getText());
        assertEquals("Server Address", register.findElement(
                By.xpath("//label[@for='id_saddr']")).getText());
        assertEquals("Server Description", register.findElement(
                By.xpath("//label[@for='id_desc']")).getText());
        assertEquals("User Name", register.findElement(
                By.xpath("//label[@for='id_uname']")).getText());
        assertEquals("Password", register.findElement(
                By.xpath("//label[@for='id_pword']")).getText());
        assertEquals("Activate Email Server", register.findElement(
                By.xpath("//label[@for='id_active']")).getText());
        assertEquals("Server Protocol", register.findElement(
                By.xpath("//label[@for='id_proto']")).getText());
        assertEquals("Port Number", register.findElement(
                By.xpath("//label[@for='id_port']")).getText());
        assertEquals("Mailbox Name", register.findElement(
                By.xpath("//label[@for='id_mailbox']")).getText());
        assertEquals("Create Additional Archive Mailboxes", register.findElement(
                By.xpath("//label[@for='id_mirhack']")).getText());
        assertEquals("Email Deletion", register.findElement(
                By.xpath("//fieldset[@class='nomargin']/dl[11]/dt/label")).getText());
        assertEquals("Fetch Timeout", register.findElement(
                By.xpath("//label[@for='id_timelimit']")).getText());

        //Check for inputs
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_cname"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_saddr"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_desc"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_uname"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_pword"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_proto"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_port"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_mailbox"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_mirhack"), register));

        //need an assert for each radio button (deletion)
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_delete_0"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_delete_1"), register));

        assertTrue(SelHelpers.isElementPresent(
                By.id("id_timelimit"), register));

        //Check Create Button
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        assertEquals("Create Fetcher",
                register.findElement(By.id("submit")).getAttribute("value"));

        //Clear everything out, just in case. (omit the config name)
        register.findElement(By.id("id_saddr")).clear();
        register.findElement(By.id("id_desc")).clear();
        register.findElement(By.id("id_uname")).clear();
        register.findElement(By.id("id_pword")).clear();
        //register.findElement(By.id("id_mirhack")).clear();
        register.findElement(By.id("id_port")).clear();
        register.findElement(By.id("id_mailbox")).clear();
        register.findElement(By.id("id_timelimit")).clear();
        //Fill it in with defaults
        //reset protocol to IMAP4 (default) and test dropdown
        Select select = new Select(register.findElement(By.id("id_proto")));
        dropDown(register.findElement(By.id("id_proto")), 4);
        List<WebElement> clearProt = select.getOptions();
        clearProt.get(0).click();
        //Set Port to 143 (default)
        register.findElement(By.id("id_port")).clear();
        register.findElement(By.id("id_port")).sendKeys("143");
        //Set mailbox to "inbox" (default)
        register.findElement(By.id("id_mailbox")).clear();
        register.findElement(By.id("id_mailbox")).sendKeys("inbox");
        //Set email deletion to on back up (default)
        assertTrue(SelHelpers.areElementsPresent(
                By.name("proto"), register));
        List<WebElement> radio = register.findElements(By.name("delete"));
        radio.get(0).click();
        assertTrue(radio.get(0).isSelected());
        //set timeout to 15 (default)
        register.findElement(By.id("id_timelimit")).sendKeys("15");
        //Assert create button exists
        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
        //Test blank submit
        register.findElement(By.id("submit")).click();
        assertTrue(SelHelpers.isElementPresent(
                By.className("errorlist"), register));
        //Now, for each option in dropdown, create a fetcher if it's not already there.
        select = new Select(register.findElement(By.id("id_proto")));
        clearProt = select.getOptions();
        int firstProtocol = 0, lastProtocol = 4;
        for (int i = firstProtocol; i < lastProtocol; i++) {
            try {
                Fetchers.add(Fetchers.Protocol.valueOf(clearProt.get(i).getText()), clearProt.get(i).getText(), "Intradyn1", fetcherServ);
            } catch (NoSuchElementException e) {
                fail();
            }
        }

        //Do some stuff with the fetchers and go back to root page
        //TODO: Add "testing connection to email server" for a fetcher. Target : 1.0.1
        //
        register.get(ComplianceVault.getServer() + "/fetch/config");

        //Inactive Table Magic Numbers
        int firstTableRow = 2;
        int lastTableRow = 6;
        for (int i = firstTableRow; i < lastTableRow; i++) {
            if (SelHelpers.isElementPresent(
                    By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[" + i + "]/td[5]/form/a[3]/img"), register)) {

                String curName = register.findElement(By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[" + i + "]/td")).getText();
                register.findElement(By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[" + i + "]/td[5]/form/a[3]/img")).click();
                assertEquals(ComplianceVault.getServer() + "/fetch/edit/?name=" + curName, register.getCurrentUrl());
                register.navigate().back();
            }
        }
        //Activate (moves these to the Active Fetchers Table)
        while (SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td[5]/form/a/img"), register)) {
            register.findElement(
                    By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td[5]/form/a/img")).click();
        }

        int firstIcon = 2, lastIcon = 7;

        //View Status (Shows results of connection Test and other details
        for (int i = firstTableRow; i < lastTableRow; i++) {
            if (SelHelpers.isElementPresent(
                    By.xpath("//div[@id='main']/div/table[2]/tbody/tr[" + i + "]/td[6]/form/a[2]/img"), register)) {
                String curName = register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[" + i + "]/td")).getText();
                for (int j = firstIcon; j < lastIcon; j++) {
                    //Click on the current icon
                    register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[" + i + "]/td[6]/form/a[" + j + "]/img")).click();

                    //Status
                    if (j == 2) {
                        assertEquals(ComplianceVault.getServer() + "/status/jobs/details/MailRetrievalService-" + curName + "/", register.getCurrentUrl());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/h1"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table/caption/div"), register));
                        int rowStart = 2, rowEnd = 6;
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b"), register));
                        for (int k = rowStart; k < rowEnd; k++) {
                            assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[" + k + "]/td/b"), register));
                            SelHelpers.Delay(register, 30);

                        }
                        assertEquals("Process Details", register.findElement(By.xpath("//div[@id='main']/h1")).getText());
                        assertEquals("MailRetrievalService-" + curName,
                                register.findElement(By.xpath("//div[@id='main']/div/table/caption/div")).getText());
                        assertEquals("Process:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr/td/b")).getText());
                        assertEquals("Start Time:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/b")).getText());
                        assertEquals("End Time:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[3]/td/b")).getText());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[4]/td/b"), register));
                        String test = register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[4]/td/b")).getText();
                        if (test.contains("UidFetchingNow:")) {
                            assertEquals("MailboxState:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[6]/td/b")).getText());
                            assertEquals("Activity:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[7]/td/b")).getText());
                            assertEquals("FetchedToday:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[8]/td/b")).getText());
                        } else if (test.contains("FetchedThisHour:")) {
                            assertEquals("MailboxState:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[5]/td/b")).getText());
                            assertEquals("Activity:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[6]/td/b")).getText());
                            assertEquals("FetchedToday:", register.findElement(By.xpath("//div[@id='main']/div/table[2]/tbody/tr[7]/td/b")).getText());
                        } else {
                            fail("The table element list was switched up. Right now the test string has:"+test);
                        }

                        register.navigate().back();
                    } else if (j == 3) {
                        assertEquals(ComplianceVault.getServer() + "/fetch/reset/?name=" + curName, register.getCurrentUrl());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/h1"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li[2]/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("id_reset_0"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("id_reset_1"), register));

                        assertEquals("Reset Fetcher", register.findElement(By.xpath("//div[@id='main']/h1")).getText());
                        assertEquals("Configuration Name", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
                        assertEquals("Fetcher Restart", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label")).getText());
                        assertEquals("Restart the fetcher service", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li/label")).getText());
                        assertEquals("Completely reset the fetcher", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dd/ul/li[2]/label")).getText());
                        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
                        register.findElement(By.id("id_reset_0")).click();
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
                        register.navigate().back();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.id("id_reset_1"), register));
                        register.findElement(By.id("id_reset_1")).click();
                        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
                        register.findElement(By.id("submit")).click();
                        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
                    } else if (j == 4) {
                        assertEquals(ComplianceVault.getServer() + "/fetch/schedule/?fetcher=" + curName, register.getCurrentUrl());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/h1"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[2]/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("id_haveSched_0"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("id_haveSched_1"), register));
                        assertEquals("Scheduling fetcher \"" + curName + "\"", register.findElement(By.xpath("//div[@id='main']/h1")).getText());
                        assertEquals("Fetcher Uptime", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
                        assertEquals("Always run this fetcher (preferred)", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li/label")).getText());
                        assertEquals("Schedule daily downtime for this fetcher", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd/ul/li[2]/label")).getText());

                        assertTrue(SelHelpers.isElementPresent(By.id("submit"), register));
                        register.findElement(By.id("id_haveSched_0")).click();
                        register.findElement(By.id("submit")).click();
                        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
                        register.navigate().back();
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_haveSched_1")).click();

                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dt/label"), register));
                        assertEquals("Week Days", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label")).getText());
                        assertEquals("Shutdown Time", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label")).getText());
                        assertEquals("Reactivation Time", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dt/label")).getText());
                        //TODO: Test whether or not setting a schedule takes a fetcher down and brings it back up. Target: 1.1.0

                        assertTrue(SelHelpers.isElementPresent(By.id("id_starttime"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("id_endtime"), register));
                        register.findElement(By.id("id_starttime")).clear();
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
                        String now = register.getCurrentUrl();
                        register.get(now);
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_haveSched_1")).click();
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_endtime")).clear();
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
                        register.get(now);
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_haveSched_1")).click();
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_endtime")).clear();
                        register.findElement(By.id("id_starttime")).clear();

                        register.findElement(By.id("id_starttime")).sendKeys("00:01");
                        register.findElement(By.id("id_endtime")).sendKeys("00:00");
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
                        register.get(now);
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_haveSched_1")).click();
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_endtime")).clear();
                        register.findElement(By.id("id_starttime")).clear();
                        register.findElement(By.id("id_starttime")).sendKeys("00:00");
                        register.findElement(By.id("id_endtime")).sendKeys("00:00");
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
                        register.get(now);
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_haveSched_1")).click();
                        SelHelpers.Delay(register, 5);
                        register.findElement(By.id("id_endtime")).clear();
                        register.findElement(By.id("id_starttime")).clear();
                        register.findElement(By.id("id_starttime")).sendKeys("00:00");
                        register.findElement(By.id("id_endtime")).sendKeys("00:01");
                        register.findElement(By.id("submit")).click();
                        SelHelpers.Delay(register, 5);
                        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
                        SelHelpers.Delay(register, 5);
                    } else if (j == 5) {
                        assertEquals(ComplianceVault.getServer() + "/fetch/test/?name=" + curName, register.getCurrentUrl());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/h1"), register));

                        assertTrue(SelHelpers.isElementPresent(By.xpath("//dl[@id='1']/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//dl[@id='2']/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//dl[@id='3']/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//dl[@id='4']/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//dl[@id='5']/dt/label"), register));

                        assertTrue(SelHelpers.isElementPresent(By.id("1"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("2"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("3"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("4"), register));
                        assertTrue(SelHelpers.isElementPresent(By.id("5"), register));

                        assertEquals("connection", register.findElement(By.xpath("//dl[@id='1']/dt/label")).getText());
                        assertEquals("correct protocol", register.findElement(By.xpath("//dl[@id='2']/dt/label")).getText());
                        assertEquals("log in", register.findElement(By.xpath("//dl[@id='3']/dt/label")).getText());
                        assertEquals("select mailbox", register.findElement(By.xpath("//dl[@id='4']/dt/label")).getText());
                        assertEquals("messages in mailbox", register.findElement(By.xpath("//dl[@id='5']/dt/label")).getText());

                        assertTrue(SelHelpers.isElementPresent(By.id("startTest"), register));
                        register.findElement(By.id("startTest")).click();
                        SelHelpers.Delay(register, 5);

                        assertEquals("pass", register.findElement(By.xpath("//dl[@id='1']/dd/a")).getText());
                        assertEquals("pass", register.findElement(By.xpath("//dl[@id='2']/dd/a")).getText());
                        assertEquals("pass", register.findElement(By.xpath("//dl[@id='3']/dd/a")).getText());
                        assertEquals("pass", register.findElement(By.xpath("//dl[@id='4']/dd/a")).getText());
                        if (!register.findElement(By.xpath("//dl[@id='5']/dd/a")).getText().equals("pass")) {
                            if (register.findElement(By.xpath("//dl[@id='5']/dd/a")).getText().equals("warn")) {
                                register.findElement(By.xpath("//dl[@id='5']/dd/a")).click();
                                assertEquals("There are no messages in the mailbox inbox (nothing to fetch).",
                                        register.findElement(By.xpath("//dl[@id='5']/dd/div")).getText());
                            } else {
                                fail();
                            }
                        }
                        register.get(ComplianceVault.getServer() + "/fetch/");
                    } else if (j == 6) {
                        assertEquals(ComplianceVault.getServer() + "/fetch/edit/?name=" + curName, register.getCurrentUrl());
                        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='main']/h1"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_saddr']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_desc']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_uname']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_pword']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_active']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_proto']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_port']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_mailbox']"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//fieldset[@class='nomargin']/dl[10]/dt/label"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.xpath("//label[@for='id_timelimit']"), register));

                        //Check Titles Text
                        assertEquals("Configuration Name", register.findElement(
                                By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
                        assertEquals("Server Address", register.findElement(
                                By.xpath("//label[@for='id_saddr']")).getText());
                        assertEquals("Server Description", register.findElement(
                                By.xpath("//label[@for='id_desc']")).getText());
                        assertEquals("User Name", register.findElement(
                                By.xpath("//label[@for='id_uname']")).getText());
                        assertEquals("Password", register.findElement(
                                By.xpath("//label[@for='id_pword']")).getText());
                        assertEquals("Activate Email Server", register.findElement(
                                By.xpath("//label[@for='id_active']")).getText());
                        assertEquals("Server Protocol", register.findElement(
                                By.xpath("//label[@for='id_proto']")).getText());
                        assertEquals("Port Number", register.findElement(
                                By.xpath("//label[@for='id_port']")).getText());
                        assertEquals("Mailbox Name", register.findElement(
                                By.xpath("//label[@for='id_mailbox']")).getText());
                        assertEquals("Email Deletion", register.findElement(
                                By.xpath("//fieldset[@class='nomargin']/dl[10]/dt/label")).getText());
                        assertEquals("Fetch Timeout", register.findElement(
                                By.xpath("//label[@for='id_timelimit']")).getText());

                        //Check for inputs
                        assertFalse(SelHelpers.isElementPresent(
                                By.id("id_cname"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_saddr"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_desc"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_uname"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_pword"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_proto"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_port"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_mailbox"), register));

                        //need an assert for each radio button (deletion)
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_delete_0"), register));
                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_delete_1"), register));

                        assertTrue(SelHelpers.isElementPresent(
                                By.id("id_timelimit"), register));

                        register.get(ComplianceVault.getServer() + "/fetch/");
                    }
                }
            }
        }
//Nuke em again!
        Fetchers.nuke(register);
        //Double Tap
        assertEquals("no active fetchers", register.findElement(
                By.xpath("//div[@id='main']/div/table[2]/tbody/tr[2]/td/i")).getText());
        assertEquals("no inactive fetchers", register.findElement(
                By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td/i")).getText());
    }

    /**
     * Creates and deletes a legal hold. Checks validity of naming schemes.
     */
    @Test
    public void testLegalHolds() {
        //Move to Legal Holds.
        String servLink = "//div[@id='menu']/ul/div[5]/li[2]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(servLink), register));
        register.findElement(By.xpath(servLink)).click();
        SelHelpers.Delay(register, 5);
        //Check Elements
        //Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/h1"), register));
        //Current Legal Holds Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='selectionBar']/a"), register));
        //Legal Holds Table Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table/caption/div/div"), register));
        //Email Results Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='resultsBar']/a"), register));
        //Email Display Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='emailDisplayBar']/a"), register));

        //Check Title Text
        assertEquals("Legal Hold Configuration", register.findElement(
                By.xpath("//div[@id='main']/h1")).getText());

        //Check input and submit buttons
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@id='id_newName']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@value='Add Legal Hold']"), register));

        //Nuke any straggling Tags
        while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), register)) {
            register.findElement(By.xpath("//input[@type='image']")).click();
            SelHelpers.Delay(register, 5);
            register.switchTo().alert().accept();
            SelHelpers.Delay(register, 5);
        }

        //First submit a BAD name
        register.findElement(By.xpath("//input[@id='id_newName']")).sendKeys("HAHAHAHA ;,/\\");
        register.findElement(By.xpath("//input[@value='Add Legal Hold']")).click();
        register.findElement(By.xpath("//input[@id='id_newName']")).clear();
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
        //Click the text box and submit a random string to it.
        String randHold = RandomStringUtils.randomAlphanumeric(10);
        register.findElement(By.xpath("//input[@id='id_newName']")).sendKeys(randHold);
        register.findElement(By.xpath("//input[@value='Add Legal Hold']")).click();
        SelHelpers.Delay(register, 5);
        //Check URL
        assertEquals(ComplianceVault.getServer() + "/tagging/legalhold/create/?name=" + randHold, register.getCurrentUrl());
        //Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/h1"), register));
        //Caption Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/table/caption/div/div"), register));
        //Name Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), register));
        //Description Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label"), register));
        //Legal Hold checkbox Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label"), register));
        //Name inputBox
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_cname"), register));
        //Desc inputBox
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_desc"), register));
        //LegalHold check
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_legalhold"), register));
        //Submit
        assertTrue(SelHelpers.isElementPresent(
                By.id("submit"), register));

        //Titles
        assertEquals("Legal Hold Name", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
        assertEquals("Description", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label")).getText());
        assertEquals("Legal Hold", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label")).getText());
        //Check name was correct
        assertEquals(randHold, register.findElement(By.id("id_cname")).getAttribute("value"));

        //Input a random string into the description
        String randDesc = RandomStringUtils.randomAlphabetic(512);
        register.findElement(By.id("id_desc")).sendKeys(randDesc);
        //assert legal hold checked
        assertTrue(register.findElement(By.id("id_legalhold")).isSelected());
        //Create the hold
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);

        //Assert tag shows up
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td"), register));
        //Assert all the buttons are there
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@type='image']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//img[@alt='View']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//img[@alt='Edit']"), register));

        //clickety clack
        //view button
        register.findElement(By.xpath("//img[@alt='View']")).click();
        SelHelpers.Delay(register, 10);
        //show the results pane opened
        assertTrue(register.findElement(By.id("top_check")).isDisplayed());
        //go back!
        register.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
        register.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
        SelHelpers.Delay(register, 25);

        //edit button
        register.findElement(By.xpath("//img[@alt='Edit']")).click();
        SelHelpers.Delay(register, 5);
        //Check text
        assertEquals(randHold, register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd")).getText());
        assertEquals(randDesc, register.findElement(By.id("id_desc")).getText());
        assertTrue(register.findElement(By.id("id_legalhold")).isSelected());

        //Show everything is disabled
        //Desc inputBox
        assertFalse(register.findElement(By.id("id_desc")).isEnabled());
        //LegalHold check
        assertFalse(register.findElement(By.id("id_legalhold")).isEnabled());

        //Assert new headers are there
        //creation date
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dt/label"), register));
        //creator
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dt/label"), register));

        //Assert Content is there
        //date
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dd"), register));
        //creator
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dd"), register));
        //Creator's name matches user logged on
        assertEquals("admin", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dd")).getText());

        //OK button
        assertTrue(SelHelpers.isElementPresent(
                By.id("ok"), register));
        register.findElement(By.id("ok")).click();
        SelHelpers.Delay(register, 5);

        //Delete it
        //Nuke any straggling Tags
        while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), register)) {
            register.findElement(By.xpath("//input[@type='image']")).click();
            SelHelpers.Delay(register, 5);
            register.switchTo().alert().accept();
            SelHelpers.Delay(register, 5);
        }

        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td/i"), register));
        assertEquals("No legal holds exist.", register.findElement(By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td/i")).getText());

    }

    /**
     * Creates and deletes a tag. Checks validity of naming schemes.
     */
    @Test
    public void testTags() {
        //Move to Tags.
        String servLink = "//div[@id='menu']/ul/div[5]/li[3]/a/span";
        assertTrue(SelHelpers.isElementPresent(
                By.xpath(servLink), register));
        register.findElement(By.xpath(servLink)).click();
        SelHelpers.Delay(register, 5);
        //Check Elements
        //Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/h1"), register));
        //Current Tags Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='selectionBar']/a"), register));
        //Tags Table Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table/caption/div/div"), register));
        //Email Results Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='resultsBar']/a"), register));
        //Email Display Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//h3[@id='emailDisplayBar']/a"), register));

        //Check Title Text
        assertEquals("Tag Configuration", register.findElement(
                By.xpath("//div[@id='main']/h1")).getText());

        //Nuke any straggling Tags
        while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), register)) {
            register.findElement(By.xpath("//input[@type='image']")).click();
            SelHelpers.Delay(register, 5);
            register.switchTo().alert().accept();
            SelHelpers.Delay(register, 5);
        }

        //Check input and submit buttons
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@id='id_newName']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@value='Add Tag']"), register));

        //First submit a BAD name
        register.findElement(By.xpath("//input[@id='id_newName']")).sendKeys("HAHAHAHA ;,/\\");
        register.findElement(By.xpath("//input[@value='Add Tag']")).click();
        register.findElement(By.xpath("//input[@id='id_newName']")).clear();
        assertTrue(SelHelpers.isElementPresent(By.className("errorlist"), register));
        //Click the text box and submit a random string to it.
        String randTag = RandomStringUtils.randomAlphanumeric(10);
        register.findElement(By.xpath("//input[@id='id_newName']")).sendKeys(randTag);
        register.findElement(By.xpath("//input[@value='Add Tag']")).click();
        SelHelpers.Delay(register, 5);
        //Check URL
        assertEquals(ComplianceVault.getServer() + "/tagging/tag/create/?name=" + randTag, register.getCurrentUrl());
        //Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/h1"), register));
        //Caption Box
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/table/caption/div/div"), register));
        //Name Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label"), register));
        //Description Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label"), register));
        //Legal Hold checkbox Header
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label"), register));
        //Name inputBox
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_cname"), register));
        //Desc inputBox
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_desc"), register));
        //LegalHold check
        assertTrue(SelHelpers.isElementPresent(
                By.id("id_legalhold"), register));
        //Submit
        assertTrue(SelHelpers.isElementPresent(
                By.id("submit"), register));

        //Titles
        assertEquals("Tag Name", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dt/label")).getText());
        assertEquals("Description", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[2]/dt/label")).getText());
        assertEquals("Legal Hold", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[3]/dt/label")).getText());
        //Check name was correct
        assertEquals(randTag, register.findElement(By.id("id_cname")).getAttribute("value"));

        //Input a random string into the description
        String randDesc = RandomStringUtils.randomAlphabetic(512);
        register.findElement(By.id("id_desc")).sendKeys(randDesc);
        //assert legal hold NOT checked
        assertFalse(register.findElement(By.id("id_legalhold")).isSelected());
        //Create the hold
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);
        assertTrue(SelHelpers.isElementPresent(By.className("success"), register));
        SelHelpers.Delay(register, 5);

        //Assert tag shows up
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td"), register));
        //Assert all the buttons are there
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//input[@type='image']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//img[@alt='View']"), register));
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//img[@alt='Edit']"), register));

        //clickety clack
        //view button
        register.findElement(By.xpath("//img[@alt='View']")).click();
        SelHelpers.Delay(register, 10);
        //show the results pane opened
        assertTrue(register.findElement(By.id("top_check")).isDisplayed());
        //go back!
        register.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
        register.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
        SelHelpers.Delay(register, 5);

        //edit button
        register.findElement(By.xpath("//img[@alt='Edit']")).click();
        SelHelpers.Delay(register, 10);
        //Check text
        assertEquals(randTag, register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl/dd")).getText());
        assertEquals(randDesc, register.findElement(By.id("id_desc")).getText());
        assertFalse(register.findElement(By.id("id_legalhold")).isSelected());

        //Show everything is disabled
        //Desc inputBox
        assertTrue(register.findElement(By.id("id_desc")).isEnabled());
        //LegalHold check
        assertTrue(register.findElement(By.id("id_legalhold")).isEnabled());

        //Assert new headers are there
        //creation date
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dt/label"), register));
        //creator
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dt/label"), register));

        //Assert Content is there
        //date
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[4]/dd"), register));
        //creator
        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dd"), register));
        //Creator's name matches user logged on
        assertEquals("admin", register.findElement(By.xpath("//div[@id='main']/div/form/fieldset/dl[5]/dd")).getText());

        //OK button
        assertTrue(SelHelpers.isElementPresent(
                By.id("submit"), register));
        register.findElement(By.id("submit")).click();
        SelHelpers.Delay(register, 5);

        //Delete it
        //Nuke any straggling Tags
        while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), register)) {
            register.findElement(By.xpath("//input[@type='image']")).click();
            SelHelpers.Delay(register, 5);
            register.switchTo().alert().accept();
            SelHelpers.Delay(register, 5);
        }


        assertTrue(SelHelpers.isElementPresent(
                By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td/i"), register));
        assertEquals("No tags exist.", register.findElement(By.xpath("//div[@id='selectionPane']/div/table[2]/tbody/tr[2]/td/i")).getText());

    }

    /**
     * Delays next test by 5 seconds.
     *
     */
    @After
    public void tearDown() {
        SelHelpers.Delay(register, 5);
    }

    /**
     * Kills the browser.
     */
    @AfterClass
    public static void tearDownOnce() {
        register.quit();
    }

    /*
     * TODO: In 1.0.1 add the following functionality to dropDown() for the
     * select menus: assert for each item, that the text of each selection will
     * match that from a known source (text file maybe?). Thus a parameter will
     * have to be added for this helper function.
     *
     */
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

    @Ignore
    private static void SMTP(Boolean on) {
        try {
            WebDriver smtp = ComplianceVault.login();
            WebElement element = smtp.findElement(By.xpath(configTab));
            element.click();
            SelHelpers.Delay(smtp, 5);

            //Move to SMTP config.
            String smtpLink = "//div[@id='menu']/ul/div[4]/li[3]/a/span";
            smtp.findElement(By.xpath(smtpLink)).click();

            //Turn on SMTP if it's off
            if (smtp.findElement(By.xpath("//input[@class='button1']")).getAttribute("value").equals("Start Now") && on == true) {
                smtp.findElement(By.xpath("//input[@class='button1']")).click();
            }

            //Turn off SMTP if it's on
            if (smtp.findElement(By.xpath("//input[@class='button1']")).getAttribute("value").equals("Stop Now") && on == false) {
                smtp.findElement(By.xpath("//input[@class='button1']")).click();
            }
            //Nuke the browser.
            smtp.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }
}
