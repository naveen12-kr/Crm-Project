/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.cv.config;

import intradyn.selenium.addons.ComplianceVault;
import java.io.IOException;
import org.ini4j.Ini;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Class of methods for configuring and performing a remote backup on a Compliance Vault.
 * @author bkett
 * @since 0.3.0
 */
public class RemoteBackup {

    /**
     * Configures a remote share of specified type in a new browser window using the given INI section.
     * Closes the window upon saving the configuration
     * @param type
     */
    public static void configureShare(Ini.Section type) {
        try {
            WebDriver share = ComplianceVault.login();
            share.get(ComplianceVault.getServer() + "/rembackup/location/");

            share.findElement(By.id("id_hostpath")).clear();
            share.findElement(By.id("id_hostname")).clear();
            share.findElement(By.id("id_encryptionkey")).clear();
            //Assume it's NFS
            share.findElement(By.id("id_fstype_0")).click();
            //But Could be SMB
            if (type.getName().equalsIgnoreCase("SMB")) {
                share.findElement(By.id("id_fstype_1")).click();
                share.findElement(By.id("id_hostuser")).clear();
                share.findElement(By.id("id_hostdomain")).clear();
                share.findElement(By.id("id_hostpass")).clear();
                String user = type.get("User");
                String pass = type.get("Password");
                String domain = type.get("Domain");
                share.findElement(By.id("id_hostdomain")).sendKeys(domain);
                share.findElement(By.id("id_hostuser")).sendKeys(user);
                share.findElement(By.id("id_hostpass")).sendKeys(pass);
            }

            String ip = type.get("IP");
            String path = type.get("Path");
            String toArchive = type.get("ToArchive");
            String key = type.get("EncryptionKey");


            share.findElement(By.id("id_encryptionkey")).sendKeys(key);

            share.findElement(By.id("id_hostname")).sendKeys(ip);
            share.findElement(By.id("id_hostpath")).sendKeys(path);

            //Check the archive depending line = config.readLine();
            if (toArchive.equalsIgnoreCase("false")) {
                if (share.findElement(By.id("id_usetape")).isSelected()) {
                    share.findElement(By.id("id_usetape")).click();
                }
            } else if (toArchive.equalsIgnoreCase("True")
                    && !share.findElement(By.id("id_usetape")).isSelected()) {
                share.findElement(By.id("id_usetape")).click();
            }

            share.findElement(By.id("submit")).click();
            share.close();


        } catch (IOException ex) {
            System.err.println("Failed to launch a new browser.\n" + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Failed to configure the share.\n" + e.getMessage());
        }

    }

    /**
     * Configures a remote share of specified type using the given INI section
     * within a given WebDriver.
     * @param type
     * @param driver
     */
    public static void configureShare(Ini.Section type, WebDriver driver) {
        try {
            driver.findElement(By.id("id_hostpath")).clear();
            driver.findElement(By.id("id_hostname")).clear();
            driver.findElement(By.id("id_encryptionkey")).clear();

            //Assume it's NFS
            driver.findElement(By.id("id_fstype_0")).click();
            //But Could be SMB
            if (type.getName().equalsIgnoreCase("SMB")) {
                driver.findElement(By.id("id_fstype_1")).click();
                driver.findElement(By.id("id_hostuser")).clear();
                driver.findElement(By.id("id_hostpass")).clear();
                String user = type.get("User");
                String pass = type.get("Password");
                driver.findElement(By.id("id_hostuser")).sendKeys(user);
                driver.findElement(By.id("id_hostpass")).sendKeys(pass);
            }
            String ip = type.get("IP");
            String path = type.get("Path");
            String toArchive = type.get("ToArchive");
            String key = type.get("EncryptionKey");


            driver.findElement(By.id("id_encryptionkey")).sendKeys(key);

            driver.findElement(By.id("id_hostname")).sendKeys(ip);
            driver.findElement(By.id("id_hostpath")).sendKeys(path);

            //Check the archive depending line = config.readLine();
            if (toArchive.equalsIgnoreCase("false")) {
                if (driver.findElement(By.id("id_usetape")).isSelected()) {
                    driver.findElement(By.id("id_usetape")).click();
                }
            } else if (toArchive.equalsIgnoreCase("True")
                    && !driver.findElement(By.id("id_usetape")).isSelected()) {
                driver.findElement(By.id("id_usetape")).click();
            }

            driver.findElement(By.id("submit")).click();


        } catch (Exception e) {
            System.err.println("Failed to configure the share.\n" + e.getMessage());
        }
    }

    /**
     * Performs a backup using the given WebDriver. '
     * Navigates to the backup page and kicks off a backup.
     * @param driver
     */
    public static void backup(WebDriver driver) {
        try {
            driver.get(ComplianceVault.getServer() + "/rembackup/backup/");
            driver.findElement(By.id("submit")).click();
        } catch (NoSuchElementException e) {
            System.err.println("Failed to find the backup button.\n");
        }

    }

    /**
     * Performs a backup by opening a new browser and kicking it off directly.
     * The window closes upon successfully launching the backup.
     */
    public static void backup() {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/rembackup/backup/");
            driver.findElement(By.id("submit")).click();

        } catch (IOException ex) {
            System.err.println("Failed to log into the vault.\n" + ex.getLocalizedMessage());
            //Logger.getLogger(RemoteBackup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchElementException e) {
            System.err.println("Failed to find the backup button.\n");
        }

    }
}
