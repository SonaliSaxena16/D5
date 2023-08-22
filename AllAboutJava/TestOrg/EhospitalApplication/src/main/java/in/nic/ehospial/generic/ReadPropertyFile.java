package in.nic.ehospial.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ehospital.GenerateGetterSetter.AccessConfigData;

public class ReadPropertyFile {

	

public static Properties	prop  = new Properties();
	
	
	public static AccessConfigData loadUser() {
		String propertyfilepath = "./resources/config.properties";
		final AccessConfigData user = new AccessConfigData();
		try {
			

			FileInputStream fis1 = new FileInputStream(propertyfilepath);

			try {
				prop.load(fis1);
				String baseurl = prop.getProperty("baseurl");
				String browser = prop.getProperty("browser");
				String OS = prop.getProperty("OS");
				String userId = prop.getProperty("userid");
				String password = prop.getProperty("password");
				
				user.setBaseurl(baseurl);
				user.setBrowser(browser);
				user.setPassword(OS);
				user.setUserId(userId);
				user.setPassword(password);
				
					
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return user;
		

	}

	public static String loadSsoDropDownVal(String param) {
		String propertyfilepath = "./resources/config.properties";
		String ssoDropDownVal = "";
		try {
			FileInputStream fis1 = new FileInputStream(propertyfilepath);
			try {
				prop.load(fis1);
				ssoDropDownVal = prop.getProperty(param);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return ssoDropDownVal;
	}
	
	
}
