/*
 *TODO: Implement Chrome settings. Target: 2.0.0
 */
package intradyn.selenium.addons;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Class BrowserStartup contains the configuration settings for the Selenium
 * testing project. Currently settings are defined for the FireFox and Internet
 * Explorer browsers. FireFox has firebug launched and a few additional
 * preferences made in a special profile created for testing in Selenium. This
 * is to assure consistency. IE is configured to ignore security domains. This
 * may or may not result in issues to be resolved at a later date.
 *
 * @author bkett
 * @since 0.1.0
 */
public class BrowserStartup {

    private static WebDriver driver;

    private static WebDriver getWebDriver(BrowserType browserType) throws IOException {
        switch (browserType) {
            case FIREFOX:
                final String firebugPath = "C:\\FFox Selenium Profile\\firebug-1.9.0-fx.xpi";
                FirefoxProfile profile = new FirefoxProfile();

                //add firebug to the created profile
                profile.addExtension(new File(firebugPath));
                profile.setPreference("extensions.firebug.showFirstRunPage", false);
                profile.setPreference("app.update.enabled", false);
                profile.setPreference("browser.tabs.autoHide", false);
                profile.setEnableNativeEvents(false);
                DesiredCapabilities ffoxCapabilities = DesiredCapabilities.firefox();
                ffoxCapabilities.setCapability(FirefoxDriver.PROFILE, profile);
                return new FirefoxDriver(profile);

            case IE:
                DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
                ieCapabilities.setCapability(
                        InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                return new InternetExplorerDriver(ieCapabilities);
            case CHROME:
                // Need to implement
                return null;
            case HTMLUNIT:
                // Need to implement
                return null;
            default:
                throw new RuntimeException("Browser type unsupported");
        }
    }

    /**
     * Instantiates a WebDriver.
     * @param browserType
     * @return A WebDriver of the specified Browser.
     * @throws IOException
     */
    protected static WebDriver instantiateBrowser(BrowserType browserType) throws IOException {
        driver = getWebDriver(browserType);
        return driver;
    }

    /**
     * The enumerator BrowserType contains the various browsers supported by
     * Selenium.
     */
    public enum BrowserType {

        FIREFOX,
        IE,
        CHROME,
        HTMLUNIT
    }
}
