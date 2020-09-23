/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.cv.config;

import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.IOException;
import org.ini4j.Ini;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class of functions for manipulating data of the Compliance vault.
 * @author bkett
 * @since 0.3.0
 */
public class Data {

    /**
     * Performs a factory reset of the Vault. Requires a timeout specified in an INI file.
     * @param config
     * @throws Exception
     */
    public static void factoryReset(Ini.Section config) throws Exception {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/sdw/securedatawipe/");
            driver.findElement(By.id("id_delete_0")).click();
            driver.findElement(By.id("id_archive_1")).click();
            String factoryResetCode = "SRM-FC-FAC-RST";
            driver.findElement(By.id("id_sdwcode")).clear();
            driver.findElement(By.id("id_sdwcode")).sendKeys(factoryResetCode);
            driver.findElement(By.id("submit")).click();
            driver.switchTo().alert().accept();
            try {
                Thread.sleep(30000);
            } catch (InterruptedException ex) {
                System.err.println("Couldn't sleep\n" + ex.getLocalizedMessage());
            }
            driver.get(ComplianceVault.getServer() + "/down/");
            try {
                while (!(SelHelpers.isElementPresent(By.xpath("//img[@alt='Alert']"), driver))) {
                    Thread.sleep(10000);
                }
            } catch (InterruptedException ex) {
                System.err.println("Couldn't sleep\n" + ex.getLocalizedMessage());
            }
            driver.findElement(By.xpath("//img[@alt='Alert']")).click();
            driver.findElement(By.xpath("//input[@name='CMD']")).click();

            //special login
            try {
                int hour = 0;
                while (!SelHelpers.isElementPresent(By.id("user_login"), driver)) {
                    Thread.sleep(10000);
                    driver.get(ComplianceVault.getServer() + "/auth/login");
                    hour++;
                    if (hour / 360 >= Integer.parseInt(config.get("timeout"))) {
                        throw new Exception("Timed out");
                    }
                }
            } catch (InterruptedException ex) {
                System.err.println("Couldn't sleep\n  " + ex.getLocalizedMessage());
            }
            driver.close();
            driver = ComplianceVault.login();

            //Ok so the EULA pops up here. Gonna just deal with it.
            driver.findElement(By.id("accept")).click();
            driver.close();
        } catch (IOException ex) {
            System.err.println("Failed to login\n" + ex.getLocalizedMessage());
        }
    }

    /**
     * Performs a restore of data from a specified share detailed in the filesystem INI file.
     * @param filesystem
     */
    public static void Restore(Ini.Section filesystem) {
        try {
            WebDriver driver = ComplianceVault.login();
            RemoteBackup.configureShare(filesystem);
            driver.get(ComplianceVault.getServer() + "/rembackup/restore/");

            driver.findElement(By.id("submit")).click();
            while (driver.getCurrentUrl().equals(ComplianceVault.getServer()+"/status/jobs/details/RemoteBackup/")) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    System.err.println("Failed to Sleep.");
                }
            }
            while (driver.getCurrentUrl().equals(ComplianceVault.getServer()+"/down/")) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    System.err.println("Failed to Sleep.");
                }
            }
            driver.close();
        } catch (IOException ex) {
            System.err.println("Failed to login\n" + ex.getLocalizedMessage());
        }


    }
}
