package ffox.fsearch;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import intradyn.selenium.addons.ComplianceVault;
import intradyn.selenium.addons.SelHelpers;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.Ini;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
public class SearchTest extends org.junit.Assert {// extends TestCase{

    private static WebDriver search;
    private static final File settings = new File("search-settings.ini");
    private static String searchTab = "//div[@id='tabs']/ul/li[2]/a/span";
    private static Ini data;

    @BeforeClass
    public static void setUpOnce() {
        try {
            ComplianceVault.setConfig(settings);
            search = ComplianceVault.login();
            data = new Ini(new FileReader(settings));
        } catch (IOException ex) {
            System.err.println("Failed to login to the RazorSafe! Bad connection maybe? See: " + ex.getMessage());
        }
    }

    @Test
    public void testSearch() {
        By searchlink = By.xpath("//div/li[2]/a/span");
        assertTrue(SelHelpers.isElementPresent(searchlink, search));
        assertEquals("Search", search.findElement(searchlink).getText());
        search.findElement(searchlink).click();

        //Content tests
        By header = By.xpath("//div[@id='main']/h1");
        assertTrue(SelHelpers.isElementPresent(header, search));
        assertEquals("Search", search.findElement(header).getText());

        //Check for the Three baseline Tokens
        try {
            SelHelpers.verifyTextPresent("Email parameter Sent", search);
            SelHelpers.verifyTextPresent("Email From/To", search);
            SelHelpers.verifyTextPresent("Email Text", search);
        } catch (NoSuchElementException ex) {
            fail("Couldn't find the default search tokens.\n" + ex.getLocalizedMessage());
        }

        try {
            SelHelpers.isElementPresent(By.id("submit_search"), search);
            SelHelpers.isElementPresent(By.id("save_seach"), search);
            SelHelpers.isElementPresent(By.id("additions"), search);
        } catch (NoSuchElementException ex) {
            fail("Couldn't find one of the default search buttons.\n" + ex.getLocalizedMessage());
        }
        try {
            SelHelpers.isElementPresent(By.xpath("//h3[@id='selectionBar']/a"), search);
            SelHelpers.isElementPresent(By.xpath("//h3[@id='resultsBar']/a"), search);
            SelHelpers.isElementPresent(By.xpath("//h3[@id='emailDisplayBar']/a"), search);
            assertEquals("Query Terms", search.findElement(By.xpath("//h3[@id='selectionBar']/a")).getText());
            assertEquals("Results", search.findElement(By.xpath("//h3[@id='resultsBar']/a")).getText());
            assertEquals("Email Display", search.findElement(By.xpath("//h3[@id='emailDisplayBar']/a")).getText());
        } catch (NoSuchElementException ex) {
            fail("Couldn't find one of the default search sections.\n" + ex.getLocalizedMessage());
        }

        //Establish the current UUID (Integer)
        //Delete all of the terms
        Integer uuid = 1;
        By deleteTerm = By.xpath("//tbody[@id='search_menu']/tr/td[6]/button");
        while (SelHelpers.isElementPresent(deleteTerm, search)) {
            ++uuid;
            search.findElement(deleteTerm).click();
        }
        BufferedReader csvRead = null;
        InputStream csvStream = null;
        try {
            //Black magic which converts the CSV from a List<String[]> to String[][]

            //Get name of the Data File
            File csv = new File(data.get("Data", "CSV"));
            assertTrue(csv.canRead());
            csvStream = new FileInputStream(csv);
            csvRead = new BufferedReader(new InputStreamReader(csvStream, "UTF-16"));
            String[][] realTempMatrix = null;

            //First line which gives the number of columns in the Query file.
            String line = csvRead.readLine();
            List<String[]> tempMatrix = new ArrayList();
            //Add the first line to the list of String arrays
            tempMatrix.add(line.split("\t"));
            if (line != null) {
                //int lengthDiff;
                int count = 1;
                while (line != null) {
                    line = csvRead.readLine();
                    if (line == null) {
                        break;
                    }
                    //If the length of the rows aren't equal, keep adding delimiters.
                    //lengthDiff = tempMatrix.get(0).length- line.split("\t").length;
                    tempMatrix.add(line.split("\t"));
                    count++;
                }
                realTempMatrix = new String[tempMatrix.size()][tempMatrix.get(0).length];
                for (int i = 0; i < realTempMatrix.length; i++) {
                    int j;
                    for (j = 0; j < tempMatrix.get(i).length; j++) {
                        if (!tempMatrix.get(i)[j].isEmpty()) {
                            realTempMatrix[i][j] = tempMatrix.get(i)[j];
                            continue;
                        }
                        //realTempMatrix[i][j]="\t";
                    }
                    for (int k = j; k < tempMatrix.get(0).length; k++) {
                        realTempMatrix[i][k] = "";
                    }
                }

            }
            //Shove it all into the defined array.
            String[][] queries = realTempMatrix;


            //Get the number of header columns
            Integer numHeaders = Integer.parseInt(data.get("Data", "Header Columns")) - 1;
            Integer passedSearches = 0;
            Integer failedSearches = 0;
            List<String> failedQueries = new ArrayList();
            Select searchTermsMenu;
            String[] fields = new String[queries.length];
            String[] constraints = new String[queries.length];

            for (Integer currentQuery = 0; currentQuery < queries.length; currentQuery++) {
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

                if (currentQuery == 0) {
                    for (Integer fieldIndex = 0; fieldIndex < queries.length; fieldIndex++) {
                        fields[fieldIndex] = queries[fieldIndex][currentQuery];
                    }
                    continue;
                }
                if (currentQuery == 1) {
                    for (Integer contraintsIndex = 0; contraintsIndex < queries.length; contraintsIndex++) {
                        constraints[contraintsIndex] = queries[contraintsIndex][currentQuery];
                    }
                    continue;
                }
                if (currentQuery <= numHeaders) {
                    continue;
                }

                //Now that all the headers have been accounted for...
                String[] query = new String[queries.length];
                for (Integer queryField = 0; queryField < queries.length; queryField++) {
                    query[queryField] = queries[queryField][currentQuery];
                }
                for (Integer field = 1; field < query.length - 1; field++) {
                    if (query[field].isEmpty()) {
                        continue;
                    }
                    String term = fields[field];
                    String constraint = constraints[field];
                     searchTermsMenu = new Select(search.findElement(By.id("additions")));
                    addTerm(searchTermsMenu, term, constraint, query[field], uuid);

                }
                //Submit the search
                search.findElement(By.id("submit_search")).click();
                try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                while (search.findElement(By.id("loading")).isDisplayed()) {
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(SearchTest.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    continue;

                }
                if (search.findElement(By.id("total_count")).getText().equals(query[query.length - 1])) {
                    passedSearches++;

                    while (!search.findElement(By.id("search_form")).isDisplayed()) {
                        search.findElement(By.xpath("//h3[@id='selectionBar']/a")).click(); 
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            fail();
                        }
                    }
                    search.get(ComplianceVault.getServer() + "/search/search");
                    uuid=1;
                    continue;
                } else if (search.findElement(By.id("total_count")).getText().equals("0")
                        && query[query.length - 1].equalsIgnoreCase("-1")) {
                    assertTrue(SelHelpers.isElementPresent(By.className("error"), search));
                    passedSearches++;
                    search.findElement(By.id("status_div")).click();
                } else {
                    failedSearches++;
                    System.out.println("!!!FAILED!!!\tExpected Results: " + query[query.length - 1] + " But Was: "
                            + search.findElement(By.id("total_count")).getText());
                    //Sooo Excel doesn't match up. That's a 2 DKP minus!
                    Integer excelMatch = currentQuery - 1;
                    failedQueries.add(excelMatch.toString());
                    if (SelHelpers.isElementPresent(By.id("status_div"), search) && search.findElement(By.id("status_div")).isDisplayed()) {
                        search.findElement(By.id("status_div")).click();
                    }
                }
                while (!search.findElement(By.id("search_form")).isDisplayed()) {
                    search.findElement(By.xpath("//h3[@id='selectionBar']/a")).click();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        fail();
                    }
                }
                search.get(ComplianceVault.getServer() + "/search/search");
                uuid=1;
            }
            if (failedSearches > 0) {
                fail("The following Queries failed: " + failedQueries.toString());
            }
        } catch (IOException ex) {
            fail("Failed to open the data file.\n" + ex.getLocalizedMessage());
        } finally {
            try {
                csvRead.close();
                csvStream.close();
            } catch (IOException ex) {
                fail("Failed to close the data file.\n" + ex.getLocalizedMessage());
            }
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
        EXPECTED,
    }

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
        BLANK,}
}
