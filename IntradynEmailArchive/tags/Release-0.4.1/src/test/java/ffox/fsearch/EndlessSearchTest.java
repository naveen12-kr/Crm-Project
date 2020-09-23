package ffox.fsearch;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.time.StopWatch;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Class LoginPreTest
 *
 * @author bkett
 * @version 1.0.0
 * @since 1/23/2012
 *
 */
public class EndlessSearchTest extends org.junit.Assert {// extends TestCase{

    private static WebDriver search;
    private static final File settings = new File("endless-search-settings.ini");

    @BeforeClass
    public static void setUpOnce() {
        try {
            ComplianceVault.setConfig(settings);
            search = ComplianceVault.login();
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    @Test
    public void testEndlessSearch() {
        By searchlink = By.xpath("//div/li[2]/a/span");
        By deleteTerm = By.xpath("//tbody[@id='search_menu']/tr/td[6]/button");

        assertTrue(SelHelpers.isElementPresent(searchlink, search));
        assertEquals("Search", search.findElement(searchlink).getText());
        search.findElement(searchlink).click();

        //Declare the needed files.
        File dictionary = new File("Unified English Dictionary.txt");
        File results = new File("EndlessSearch.txt");
        assertTrue(dictionary.canRead());
        //assertTrue(results.canWrite());
        FileInputStream dictStream;


        try {
            //Declare all of the Stream/Writer variables
            dictStream = new FileInputStream(dictionary);
            BufferedReader dictRead = new BufferedReader(new InputStreamReader(dictStream));
            FileWriter resultsWriter = null;
            PrintWriter resultsOut =null;

            String value;
            String term = SearchTerm.EMAIL_TEXT.toString();
            String constraint = SearchConstraint.CONTAINS_ONE_OR_MORE.toString();
            value = "filler";
            Select searchTermsMenu = new Select(search.findElement(By.id("additions")));

            //Define the necessary counters
            int uuid = 1;
            double searchCount = 0, successCount = 0, successRatio = 0;

            //Start the stopwatch
            StopWatch root = new StopWatch();
            root.start();
            while (true) {
                while (value != null) {
                    resultsWriter = new FileWriter(results, true);
                    resultsOut = new PrintWriter(resultsWriter);
                    if(!results.canWrite()){
                        fail();
                    }
                    value = dictRead.readLine();
                    if (value == null) {
                        break;
                    }
                    while (SelHelpers.isElementPresent(deleteTerm, search)) {
                        while (!search.findElement(By.id("search_form")).isDisplayed()) {
                            search.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                fail();
                            }
                        }
                        ++uuid;
                        search.findElement(deleteTerm).click();
                    }
                    addTerm(searchTermsMenu, term, constraint, value, uuid);
                    StopWatch searchTimer = new StopWatch();
                    searchTimer.start();
                    search.findElement(By.id("submit_search")).click();
                    searchCount++;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    while (search.findElement(By.id("loading")).isDisplayed()) {
                        continue;
                    }
                    searchTimer.stop();
                    String searchDelta = searchTimer.toString();
                    root.split();
                    String rootDelta = root.toSplitString();
                    root.unsplit();

                    int numResults = Integer.parseInt(search.findElement(By.id("total_count")).getText());
                    if (numResults > 0) {
                        successCount++;
                    }
                    successRatio = (successCount / searchCount);
                    String actualResult = MessageFormat.format("{0,number,#.##%}", successRatio);

                    Date date = Calendar.getInstance().getTime();
                    SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String nou = simple.format(date);

                    resultsOut.println("Index: " + Double.toString(searchCount)
                            + "\tSearch Term: " + value + "\tReults: " + numResults
                            + "\tCurrent Success Rate: " + actualResult + "\tTime: "
                            + nou + "\tSearch Delta: " + searchDelta + "\tTotal Delta: "
                            + rootDelta);
                    resultsOut.flush();

                    while (!search.findElement(By.id("search_form")).isDisplayed()) {
                        search.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            fail();
                        }
                    }
                }
                dictStream.close();
                dictRead.close();
                //resultsOut.close();
                resultsWriter.flush();
                dictStream = new FileInputStream(dictionary);
                dictRead = new BufferedReader(new InputStreamReader(dictStream));
                value = "";
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EndlessSearchTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EndlessSearchTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @AfterClass
    public static void tearDownOnce() {
        search.close();
    }

    @Ignore
    private void addTerm(Select menu, String term, String constraint, String value, Integer id) {
        term = term.replace(" ", "_");
        term = term.replace("/", "").toUpperCase();
        String constraintMenu;
        switch (SearchTerm.valueOf(term)) {
            case EMAIL_DATE_SENT:
                constraintMenu = "email_date";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_FROM:
                constraintMenu = "email_from";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_TO:
                constraintMenu = "email_to";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_FROM_TO:
                constraintMenu = "email_address";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_SUBJECT:
                constraintMenu = "email_subject";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_BODY:
                constraintMenu = "email_body";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case EMAIL_TEXT:
                constraintMenu = "email_text";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case ATTACHMENT_NAME:
                constraintMenu = "attachment_name";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case ATTACHMENT_TYPE:
                constraintMenu = "attachment_type";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case ATTACHMENT_CONTENTS:
                constraintMenu = "attachment_text";
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case RANDOM_SAMPLE:
                constraintMenu = ("random_sample");
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case TAG_NAME:
                constraintMenu = ("tag_name");
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case COMMENT_AUTHOR:
                constraintMenu = ("comment_author");
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case COMMENT_TAG:
                constraintMenu = ("coment_tag");
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            case COMMENT_CONTENT:
                constraintMenu = ("comment_text");
                menu.selectByValue(constraintMenu);
                addConstraint(constraint, value, constraintMenu, id);
                break;
            //case EXPECTED:
            default:
                fail("Failed to add the Search Term. "
                        + "Most liekly bad input:\n" + term);
        }
    }

    @Ignore
    private void addConstraint(String constraint, String value, String menu, Integer id) {
        constraint = constraint.replace(" ", "_").toUpperCase();
        value = value.replace("{", "'");
        value = value.replace("}", "\"");
        if (constraint.equals("N/A") || constraint.equals("")) {
            constraint = "BLANK";
        }
        if (!SelHelpers.isElementPresent(By.id(menu), search)) {
            fail("input does not exist");
        }
        Select parameter;
        switch (SearchConstraint.valueOf(constraint)) {
            case ON:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("on");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case BEFORE:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("before");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case BETWEEN:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("between");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case AFTER:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("after");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case RELATIVE:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("relative");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case CONTAINS_ONE_OR_MORE:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("any");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case CONTAINS_ALL_OF:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("all");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case CONTAINS_EXACT_PHRASE:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("match");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case CONTAINS_NONE_OF:
                parameter = new Select(search.findElement(By.name("op_" + menu + "uuid_" + id.toString())));
                parameter.selectByValue("none");
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;
            case BLANK:
                search.findElement(By.id(menu)).clear();
                search.findElement(By.id(menu)).sendKeys(value);
                break;

            default:
                fail("Failed to add the Search constraint. "
                        + "Most likely bad input:\n" + constraint);
        }
    }

    @Ignore
    private static enum SearchTerm {

        EMAIL_DATE_SENT,
        EMAIL_FROM,
        EMAIL_TO,
        EMAIL_FROM_TO,
        EMAIL_SUBJECT,
        EMAIL_BODY,
        EMAIL_TEXT,
        ATTACHMENT_NAME,
        ATTACHMENT_TYPE,
        ATTACHMENT_CONTENTS,
        RANDOM_SAMPLE,
        TAG_NAME,
        COMMENT_AUTHOR,
        COMMENT_TAG,
        COMMENT_CONTENT,
        EXPECTED,}

    @Ignore
    private static enum SearchConstraint {

        ON,
        BEFORE,
        BETWEEN,
        AFTER,
        RELATIVE,
        CONTAINS_ONE_OR_MORE,
        CONTAINS_ALL_OF,
        CONTAINS_EXACT_PHRASE,
        CONTAINS_NONE_OF,
        BLANK,
    }
}
