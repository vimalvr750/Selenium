 package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import test.Test1_Makemytrip_launch;

public class Properties_File {

	static Properties prop = new Properties();

	static String ProjectPath = System.getProperty("user.dir");

	public static void main (String[] args ) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {


		try {				

			FileInputStream input = new FileInputStream(ProjectPath + "/src/test/java/config/config.properties");

			prop.load(input);

			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			Test1_Makemytrip_launch.BrowserName = browser;

		} 
		catch (Exception exp) {
			// TODO Auto-generated catch block

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties() {

		try {
			FileOutputStream output = new FileOutputStream(ProjectPath + "/src/test/java/config/config.properties");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
			
			System.out.println();

		}catch (Exception exp) {
			// TODO Auto-generated catch block

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}


}
