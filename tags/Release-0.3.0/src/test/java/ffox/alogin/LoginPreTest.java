package ffox.alogin;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class LoginPreTest
 *
 * @author bkett
 * @version 1.0.0
 * @since 1/23/2012
 *
 */
public class LoginPreTest extends org.junit.Assert {// extends TestCase{

    private static WebDriver driver;

    @BeforeClass
    public static void setUpOnce() {
        try {
            driver = ComplianceVault.login();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    /**
     * Checks to see that one successfully logged in (searches for a tab in
     * welcome screen)
     *
     */
    @Test
    public void testLogin() {
        By test = By.xpath("//div[@id='tabs']");
        SelHelpers.Delay(driver, 5);
        assertTrue(SelHelpers.isElementPresent(test, driver));
    }

    @Test
    public void testTabs() {
        assertTrue(SelHelpers.isElementPresent(By.cssSelector("img[alt=\"Home page\"]"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[2]/a/span"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[3]/a/span"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[4]/a/span"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[5]/a/span"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[6]/a/span"), driver));
        assertTrue(SelHelpers.isElementPresent(By.xpath("//div[@id='tabs']/ul/li[7]/a/span"), driver));
    }

    @AfterClass
    public static void tearDownOnce() {
        driver.close();
    }
}
