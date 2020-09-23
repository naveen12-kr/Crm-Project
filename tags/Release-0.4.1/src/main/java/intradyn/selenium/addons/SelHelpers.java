/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.selenium.addons;

import com.google.common.base.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class SelHelpers
 *
 * The SelHelpers class are a collection of methods I have written or found
 * which are useful extensions of functionality from Selenium 2.0 * The
 * shortDelay method is written as such just to reduce the amount of typing in
 * the test cases. verifyTextPresent is a method which searches the entire page
 * displayed and returns true if ANY part of the page contains ALL of the text
 * specified. Note this means the entire query must occur in a single element /
 * div on the page. isElementPresent determines whether or not a specific
 * WebElement (div, h, etc.) exists on the page.
 *
 * @author bkett
 * @version 1.0.0
 * @since 1/23/2012
 *
 *
 */
public class SelHelpers {

    /**
     * Verifies if the given text is given on a page represented by a WebDriver.
     * @param text
     * @param driver
     * @return True if the text is found.
     */
    public static boolean verifyTextPresent(String text, WebDriver driver) {
        return driver.findElements(By.xpath("//*[contains(text(),\"" + text + "\")]")).size() > 0;
    }

    /**
     * Sets the implicit timeout to be t seconds.
     * @param Driver
     * @param t
     */
    public static void Delay(WebDriver Driver, int t) {
        try {
            Driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("Failed to wait. Something really bad happened! See:" + e.getMessage());
        }
    }

    /**
     * Sets the implicit timeout to be t time. t is an integer, time is the unit (seconds, minutes, etc.)
     * for all actions taken by a WebDriver.
     * @param Driver
     * @param t
     * @param time
     */
    public static void Delay(WebDriver Driver, int t, TimeUnit time) {
        try {
            Driver.manage().timeouts().implicitlyWait(t, time);
        } catch (Exception e) {
            System.out.println("Failed to wait. Something really bad happened! See:" + e.getMessage());
        }
    }

    /**
     * Boolean function for determining if a WebElement is present on a page represented by a WebDriver.
     * @param by
     * @param driver
     * @return True if the specified WebElement is present.
     */
    public static boolean isElementPresent(By by, WebDriver driver) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Boolean function for determining if every WebElement in a list is present on the given page represented by a WebDriver.
     * @param by
     * @param driver
     * @return True if every element in the given list is present.
     */
    public static boolean areElementsPresent(By by, WebDriver driver) {
        List<WebElement> elements = driver.findElements(by);
        if (elements.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Function for determining if a desired element is present on a given page.
     * @param locator
     * @return A WebElement given by locator, if found. Otherwise throws a NoSuchElement exception.
     */
    public static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
        return new Function<WebDriver, WebElement>() {

            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        };
    }
}