package intradyn.selenium.addons;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import intradyn.cv.config.DateAndTime;
import intradyn.cv.config.FileSystems;
import java.io.FileReader;
import java.io.IOException;
import org.ini4j.Ini;
import org.ini4j.Profile.Section;

/**
 *
 * @author bkett
 */
public class SandBox {

    private static String ipaddr = "http://10.100.1.143";
   // private static WebDriver playbox_driver;
    //private static String temp2;

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // The Firefox driver supports javascript

        DateAndTime.set();
        try {
            Ini config;
            String configName = "remote-backup-settings.ini";
            config = new Ini(new FileReader(configName));
            Section get = config.get("NFS");
            //RemoteBackup.configureShare(get);
            FileSystems.windowsMount(config.get("NFS"));
            FileSystems.clean(config.get("NFS"));
        } catch (IOException e) {
            System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
        }



    }
}
