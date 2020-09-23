/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.selenium.addons;

import java.io.File;
import java.io.IOException;
import org.ini4j.Ini;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class ComplianceVault
 *
 * @author bkett
 * @since 0.1.0
 *
 */
/*
 * Parameters: server, serverUser, serverPass, bType Methods: login(),
 * loginWindow()
 *
 *
 */
public class ComplianceVault {

    /**
     * HTTP address for the Razorsafe server.
     */
    private static final File settings = new File("compliance-vault-settings.ini");
    private static Ini config = setConfig(settings);
    private static BrowserStartup.BrowserType bType =
            BrowserStartup.BrowserType.FIREFOX;
    private static final String server = getServer();

    /**
     * Script which logs into a Test machine (virtual or physical) based on the
     * IPv4 address specified in the server string. Username and Password are
     * also stored here.
     *
     *
     * @return WebDriver
     * @throws IOException
     */
    public static WebDriver login() throws IOException {
        return loginWindow();
    }

    private static WebDriver loginWindow() throws IOException {
        WebDriver loginDriver = BrowserStartup.instantiateBrowser(bType);
        try {
            loginDriver.get(server);
        } catch (org.openqa.selenium.WebDriverException d) {
            System.err.println("WebDriverException: " + d.getMessage());
        }
        try {
            WebElement username = loginDriver.findElement(By.id("user_login"));
            username.sendKeys(config.get("Compliance Vault", "User"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.err.println("NoSuchElementException: " + e.getMessage());
        }
        try {
            WebElement passWord = loginDriver.findElement(By.id("user_pass"));
            passWord.sendKeys(config.get("Compliance Vault", "Password"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.err.println("NoSuchElementException: " + e.getMessage());
        }
        try {
            WebElement loginButton = loginDriver.findElement(By.id("submit"));
            loginButton.click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.err.println("NoSuchElementException: " + e.getMessage());
        }
        return loginDriver;
    }

    /**
     * Getter for the address of the Compliance Vault.
     * @return Returns the IP address of the Compliance Vault
     */
    public static String getServer() {
        return "http://"+config.get("Compliance Vault","Server");
    }

    private static Ini setConfig(File f) {
        try {
            config = new Ini(f);
        } catch (IOException ex) {
            System.err.println("Could not open Ini file.\n" + ex.getMessage());
        } finally {
            return config;
        }
    }
}
