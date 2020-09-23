/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intradyn.cv.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.io.FileUtils;
import org.ini4j.Ini;

/**
 * Class of methods for mounting, unmounting, and deletion of content on remote shares used for
 * remote backup.
 * @author bkett
 * @since 0.3.0
 */
public class FileSystems {

    /**
     * Mounts a remote share of the specified type in remote-backup-settings.ini. Windows only.
     * Requires Net.exe to be installed on the machine. NFS shares can only be mounted if the NFS
     * tools are installed on the machine. This requires Windows 7 Enterprise or Better.
     * @param fileSystem
     * @return True if the share is successfully mounted.
     */
    public static Boolean windowsMount(Ini.Section fileSystem) {
        //Read the config file. Grab the host IP and the share path
        try {
            String ip = fileSystem.get("IP");
            String path = fileSystem.get("Path");
            String drive = fileSystem.get("WindowsDrive");
            String user = fileSystem.get("User");
            String pass = fileSystem.get("Password");
            //Generate complete path
            String mountPoint = ip + path;
            //Add UNC prefix and replace forward slashes
            String winMount = " \\\\" + mountPoint.replace("/", "\\");


            //Now attempt to mount the share
            String command = "";
            if (fileSystem.getName().equalsIgnoreCase("NFS")) {
                command = "C:\\Windows\\system32\\net.exe use " + drive + winMount;
                        //+ " /user:" + user + " " + pass;
            }
            if (fileSystem.getName().equalsIgnoreCase("SMB")) {
                String domain = fileSystem.get("Domain");
                command = "C:\\Windows\\system32\\net.exe use " + drive + winMount
                        + " /user:" + domain + "\\" + user + " " + pass;
            }
            Process p = Runtime.getRuntime().exec(command);

            BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String errLine = error.readLine();

            //Print any error messages from the command to STD ERR.
            if (errLine != null) {
                while (errLine != null) {
                    System.err.println(errLine);
                    errLine = error.readLine();
                }
                return false;
            }
            error.close();
            System.out.println(p.waitFor());
            p.destroy();

        } catch (IOException ex) {
            System.err.println("Command failed. Check syntax and ErrorStream.");
            return false;
        } catch (Exception e) {
            System.err.println("Failed to mount, or read the ini most likely, check the error message: \n" + e);
            return false;
        }
        return true;
    }

    /**
     * Unmounts a remote share of the specified type in remote-backup-settings.ini. Windows only.
     * Requires Net.exe to be installed on the machine.
     * @param fileSystem
     * @return True if the share is successfully unmounted.
     */
    public static Boolean windowsUMount(Ini.Section fileSystem) {
        try {

            //Unmount the share.
            String command = "";
            String drive = fileSystem.get("WindowsDrive");
            if (fileSystem.getName().equalsIgnoreCase("NFS")) {
                command = "C:\\Windows\\system32\\net.exe use " + drive + " /delete";
            } else if (fileSystem.getName().equalsIgnoreCase("SMB")) {
                command = "C:\\Windows\\system32\\net.exe use " + drive + " /delete";
            }
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String errLine = error.readLine();

            //Print any error messages from the command to STD ERR.
            while (errLine != null) {
                System.err.println(errLine);
                errLine = error.readLine();
            }
            error.close();
            System.out.println(p.waitFor());
            p.destroy();
        } catch (IOException ex) {
            System.err.println("Command failed. Check syntax and ErrorStream");
            return false;
        } catch (Exception e) {
            System.err.println("Failed to unmount, or read .ini. Check err message: \n" + e);
            return false;
        }

        return true;
    }

    /**
     * Deletes all files on the remote share of the specified type in remote-backup-settings.ini.
     * @param fileSystem
     * @return True if all files and folders were successfully deleted.
     */
    public static Boolean clean(Ini.Section fileSystem) {
        try {
            String ip = fileSystem.get("IP");
            String path = fileSystem.get("Path");
            File test = new File("\\\\" + ip + "\\" + path.replace("/", "\\")); //for(File f: )
            if (test.exists() && (test.listFiles().length > 0)) {
                for (File f : test.listFiles()) {
                    if (f.isDirectory()) {
                        FileUtils.deleteDirectory(f);
                    } else {
                        f.delete();
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error deleting the files in the share.\n" + e.getMessage());
            return false;
        }
        return true;
    }
}
