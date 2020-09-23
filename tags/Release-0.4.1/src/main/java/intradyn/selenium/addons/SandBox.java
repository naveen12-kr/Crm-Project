package intradyn.selenium.addons;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.io.*;

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
        File dictionaryDir = new File("LF Delimited Format");
        File[] dictionaryList = dictionaryDir.listFiles();
        File selDic = new File("Unified English Dictionary.txt");
        FileInputStream wordStream;
        BufferedReader wordRead=null;

        FileWriter dicStream = new FileWriter(selDic);
        BufferedWriter wordOut = new BufferedWriter(dicStream);

        Boolean test = selDic.canWrite();
        System.out.print(test.toString());
        for(File letterFile: dictionaryList ){
            wordStream = new FileInputStream(letterFile);
            wordRead = new BufferedReader(new InputStreamReader(wordStream));
            String wordIn = wordRead.readLine();
            while(wordIn != null){
                //System.out.println(wordIn);
                wordOut.write(wordIn+"\n");
                wordIn = wordRead.readLine();
            }
        }

        // = new BufferedR
        wordRead.close();
        wordOut.close();
    }
}
        // The Firefox driver supports javascript

//        DateAndTime.set();
//        try {
//            Ini config;
//            String configName = "remote-backup-settings.ini";
//            config = new Ini(new FileReader(configName));
//            Section get = config.get("NFS");
//            //RemoteBackup.configureShare(get);
//            FileSystems.windowsMount(config.get("NFS"));
//            FileSystems.clean(config.get("NFS"));
//        } catch (IOException e) {
//            System.err.print("Failed to load the .ini file, see error. \n" + e.getCause());
//        }
//        File csv = new File("Pan Seach Query Input.txt"); //new File("Search Query Input.csv");
//        Reader tempRead = new FileReader(csv);
//
//        InputStream nou = new FileInputStream(csv);
//        BufferedReader testRead = new BufferedReader(new InputStreamReader(nou, "UTF-16"));
//
//        String test2 = testRead.readLine();
//        List<String[]> nana = new ArrayList();
//        nana.add(test2.split("\t"));
//        if (test2 != null) {
//            while (test2 != null) {
//                //System.out.println(test2);
//                test2 = testRead.readLine();
//                if(test2==null){
//                    break;
//                }
//                String[] boohoo = test2.split("\t");
//                nana.add(boohoo);
//            }
//        }
//        System.out.print("nou");
//    }

