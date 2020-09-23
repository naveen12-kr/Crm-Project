/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.cv.config;

import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Class of functions for setting the Date and Time of the Compliance Vault.
 * @author bkett
 * @since 0.3.0
 */
public class DateAndTime {

    /**
     * Opens a new window and sets the time using NTP using a specified zone.
     * @param zone
     */
    public static void set(NTP zone) {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/clock/set/");
            SelHelpers.Delay(driver, 10, TimeUnit.SECONDS);
            driver.findElement(By.id("id_method_1")).click();
            Select select = new Select(driver.findElement(By.id("id_ntppreselects")));
            List<WebElement> eleList = select.getOptions();
            switch (zone) {
                case NORTHAMERICA:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("North America (pool.north-america.ntp.org)")) {
                            e.click();
                        }
                    }
                case SOUTHAMERICA:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("South America (pool.south-america.ntp.org)")) {
                            e.click();
                        }
                    }
                case OCEANIA:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("Oceania (pool.oceania.ntp.org)")) {
                            e.click();
                        }
                    }
                case EUROPE:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("Europe (pool.europe.ntp.org)")) {
                            e.click();
                        }
                    }
                case ASIA:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("Asia (pool.asia.ntp.org)")) {
                            e.click();
                        }
                    }
                case AFRICA:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("Africa (pool.africa.ntp.org)")) {
                            e.click();
                        }
                    }
                case WORLDWIDE:
                    for (WebElement e : eleList) {
                        if (e.getText().equals("Worldwide (pool.ntp.org)")) {
                            e.click();
                        }
                    }
            }
            driver.findElement(By.id("submit")).click();
            driver.manage().wait(60000);
        } catch (Exception ex) {
            System.err.println("Could not set the timezone.\n" + ex.getLocalizedMessage());
        }

    }

    /**
     * Opens a new window and manually sets the time to be current with the Java VM's clock.
     */
    public static void set() {
        try {
            WebDriver driver = ComplianceVault.login();
            driver.get(ComplianceVault.getServer() + "/clock/set/");
            SelHelpers.Delay(driver, 10, TimeUnit.SECONDS);
            driver.findElement(By.id("id_method_0")).click();
            driver.findElement(By.id("id_datetime")).clear();
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nou = simple.format(date);
            driver.findElement(By.id("id_datetime")).sendKeys(nou);
            driver.findElement(By.id("submit")).click();
            driver.close();
        } catch (Exception ex) {
            System.err.println("Could not set the timezone.\n" + ex.getLocalizedMessage());
        }
    }

    /**
     * Enumerator specifying all the possible regions for NTP
     */
    public static enum NTP {
        NORTHAMERICA,
        WORLDWIDE,
        OCEANIA,
        EUROPE,
        AFRICA,
        ASIA,
        SOUTHAMERICA
    }
}
