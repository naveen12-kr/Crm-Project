/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suites;

import ffox.alogin.LoginPreTest;
import ffox.bconfiguration.ConfigurationTest;
import ffox.cmaintenance.MaintenanceTest;
import ffox.dbackup.BackupTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author bkett
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({LoginPreTest.class, ConfigurationTest.class, MaintenanceTest.class, BackupTest.class})
public class ComprehensiveTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
