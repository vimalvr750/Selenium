package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Flipkart_Launch_Page;
import utils.ExcelUtils;

public class Flipkart_Launch_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void SetUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void Flipkart_Login() {
		
		Flipkart_Launch_Page Flipkart = new Flipkart_Launch_Page(driver);
		
		driver.get("https://www.flipkart.com");
		
		Flipkart.Login_button();
		
		
		String ProjectPath = System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(ProjectPath + "/Excel/data.xlsx", "Sheet1");
		
		String Search_item = excel.getCellData(0,0);
		
		Flipkart.Search(Search_item);
		
		System.out.println("Search item is" + Search_item);
	}
	
	@AfterTest
	public void tearDownTest() {
		//driver.close();
		System.out.println("Testing is completed");
	}
}
