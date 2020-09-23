package pages;

import java.io.FileInputStream;
import java.util.Properties;

public class Environment {
	
	public static Properties getConfig() {
		String configPath = System.getProperty("user.dir") + "/drivers/config.properties";
		Properties config = null;
		try {
			config = new Properties();
			FileInputStream fi = new FileInputStream(configPath);
			config.load(fi);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return config;
	}

}
