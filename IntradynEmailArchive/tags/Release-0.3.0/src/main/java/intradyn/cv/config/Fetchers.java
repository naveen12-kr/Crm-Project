/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.cv.config;

import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.IOException;
import java.util.List;
import org.ini4j.Ini;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Class of methods for adding, activating, testing, and deleting Compliance Vault fetchers.
 * @author bkett
 * @since 0.3.0
 */
public class Fetchers {

    /**
     * Adds a fetcher using hardcoded parameters. 
     * @param p
     * @param user
     * @param password
     * @param server
     */
    public static void add(Protocol p, String user, String password, String server) {
        try {
            WebDriver fetch = ComplianceVault.login();
            //move to new fetcher url
            fetch.get(ComplianceVault.getServer() + "/fetch/config/new/?name=" + p.toString());
            //Clear everything out, just in case. (omit the config name)
            fetch.findElement(By.id("id_saddr")).clear();
            fetch.findElement(By.id("id_desc")).clear();
            fetch.findElement(By.id("id_uname")).clear();
            fetch.findElement(By.id("id_pword")).clear();
            fetch.findElement(By.id("id_mailbox")).clear();
            fetch.findElement(By.id("id_timelimit")).clear();
            //Fill it in with defaults
            Select select = new Select(fetch.findElement(By.id("id_proto")));
            List<WebElement> clearProt = select.getOptions();
            switch (p) {
                case IMAP4:
                    clearProt.get(0).click();
                    break;
                case POP3:
                    clearProt.get(1).click();
                    break;
                case sIMAP4:
                    clearProt.get(2).click();
                    break;
                case sPOP3:
                    clearProt.get(3).click();
                    break;
                default:
                    clearProt.get(0).click();
                    break;
            }
            //Ports are set by default
            //Set mailbox to "inbox" (default) if possible
            if (fetch.findElement(By.id("id_mailbox")).isEnabled()) {
                fetch.findElement(By.id("id_mailbox")).clear();
                fetch.findElement(By.id("id_mailbox")).sendKeys("inbox");
            }

            //Set email deletion to on back up (default)
            List<WebElement> radio = fetch.findElements(By.name("delete"));
            radio.get(0).click();
            //set timeout to 15 (default)
            fetch.findElement(By.id("id_timelimit")).sendKeys("15");

            //Set the rest to be bullocks.
            fetch.findElement(By.id("id_saddr")).sendKeys(server);
            fetch.findElement(By.id("id_desc")).sendKeys(p.toString());
            fetch.findElement(By.id("id_uname")).sendKeys(user);
            fetch.findElement(By.id("id_pword")).sendKeys(password);

            //Now create the fetcher
            fetch.findElement(By.id("submit")).click();

            if (!SelHelpers.isElementPresent(By.className("success"), fetch)) {
                throw new org.openqa.selenium.NoSuchElementException(
                        "Boo Fetcher Already Exists or some other extraneous error occurred.");


            }
            fetch.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    /**
     * Adds a fetcher using the specified section of an INI file.
     * @param fetcher
     */
    public static void add(Ini.Section fetcher) {
        try {
            WebDriver fetch = ComplianceVault.login();
            //move to new fetcher url
            fetch.get(ComplianceVault.getServer() + "/fetch/config/new/?name=" + fetcher.getName());//fetcher.get("Protocol"));
            //Clear everything out, just in case. (omit the config name)
            fetch.findElement(By.id("id_saddr")).clear();
            fetch.findElement(By.id("id_desc")).clear();
            fetch.findElement(By.id("id_uname")).clear();
            fetch.findElement(By.id("id_pword")).clear();
            fetch.findElement(By.id("id_mailbox")).clear();
            fetch.findElement(By.id("id_timelimit")).clear();
            //Fill it in with defaults
            Select select = new Select(fetch.findElement(By.id("id_proto")));
            List<WebElement> clearProt = select.getOptions();
            switch (Protocol.valueOf(fetcher.get("Protocol"))) {
                case IMAP4:
                    clearProt.get(0).click();
                    break;
                case POP3:
                    clearProt.get(1).click();
                    break;
                case sIMAP4:
                    clearProt.get(2).click();
                    break;
                case sPOP3:
                    clearProt.get(3).click();
                    break;
                default:
                    clearProt.get(0).click();
                    break;
            }
            //Ports are set by default
            //Set mailbox to "inbox" (default) if possible
            if (fetch.findElement(By.id("id_mailbox")).isEnabled()) {
                fetch.findElement(By.id("id_mailbox")).clear();
                fetch.findElement(By.id("id_mailbox")).sendKeys("inbox");
            }

            //Set email deletion to on back up (default)
            List<WebElement> radio = fetch.findElements(By.name("delete"));
            radio.get(0).click();
            //set timeout to 15 (default)
            fetch.findElement(By.id("id_timelimit")).sendKeys("15");

            //Set the rest to be bullocks.
            fetch.findElement(By.id("id_saddr")).sendKeys(fetcher.get("Address"));
            fetch.findElement(By.id("id_desc")).sendKeys(fetcher.get("ServDesc"));
            fetch.findElement(By.id("id_uname")).sendKeys(fetcher.get("User"));
            fetch.findElement(By.id("id_pword")).sendKeys(fetcher.get("Password"));

            //Now create the fetcher
            fetch.findElement(By.id("submit")).click();

            if (!SelHelpers.isElementPresent(By.className("success"), fetch)) {
                throw new org.openqa.selenium.NoSuchElementException(
                        "Boo Fetcher Already Exists or some other extraneous error occurred.");


            }
            fetch.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Failed to save the Fetcher configuration. Check your Ini\n" + e.getMessage());
        }

    }

    /**
     * Activates all fetchers.
     */
    public static void activateAll() {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/fetch/");
            while (SelHelpers.isElementPresent(
                    By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td[5]/form/a/img"), driver)) {
                driver.findElement(
                        By.xpath("//div[@id='main']/div[2]/table[2]/tbody/tr[2]/td[5]/form/a/img")).click();
            }
            driver.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Failed to activate the fetchers\n" + e.getMessage());
        }
    }

    /**
     * Tests a fetcher specified in fetchers.ini. Must be added using add first.
     * @param fetcher
     */
    public static void runGuiTest(Ini.Section fetcher) {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/fetch/test/?name=" + fetcher.getName());
            driver.findElement(By.id("startTest")).click();
            Thread.sleep(5000);
            driver.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: \n" + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Failed to test the fetchers\n" + e.getMessage());
        }
    }

    /**
     * Opens a new window and deletes any and all fetchers.
     */
    public static void nuke() {
        //Nuclear Launch Detected...
        try {
            WebDriver areFetchers = ComplianceVault.login();
            areFetchers.get(ComplianceVault.getServer() + "/fetch/config");
            //Ahh, nothing like Ice Cold Fusion!
            while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), areFetchers)) {
                areFetchers.findElement(By.xpath("//input[@type='image']")).click();
                //Boom!
                areFetchers.switchTo().alert().accept();
            }
            areFetchers.close();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    /**
     * Deletes all fetchers using the given WebDriver.
     * @param driver
     */
    public static void nuke(WebDriver driver) {
        try {
            driver.get(ComplianceVault.getServer() + "/fetch/config");
            //Boom!
            while (SelHelpers.isElementPresent(By.xpath("//input[@type='image']"), driver)) {
                driver.findElement(By.xpath("//input[@type='image']")).click();
                driver.switchTo().alert().accept();
            }
        } catch (NoSuchElementException ex) {
            System.err.println("Failed to find the fetcher config menu or the delete button.");
        }
    }

    /**
     * Enumerator which defines available email protocols.
     */
    public enum Protocol {
        IMAP4,
        POP3,
        sIMAP4,
        sPOP3
    }
}
