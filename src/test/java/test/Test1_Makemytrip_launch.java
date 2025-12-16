package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.Properties_File;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Makemytrip_launch_Page;

public class Test1_Makemytrip_launch{

	WebDriver driver;
	WebDriverWait wait;

	public static String BrowserName;

	@BeforeTest
	public void SetupBrowser() {

		Properties_File.getProperties();

		if(BrowserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if(BrowserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}


		driver.manage().window().maximize();


	}

	@Test
	public void test_Makemytriplaunch() {

		Makemytrip_launch_Page Launch = new Makemytrip_launch_Page(driver);

		driver.get("https://makemytrip.com");

		Launch.close_login();
		Launch.minimize_ai();
		Launch.Search();

	}

	@AfterTest
	public void teardownBrowser() {

		Properties_File.setProperties();
		//driver.close();

	}

}
