package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AmazonHome2;

public class TestNG_AmazonSearch2 {
	
	private static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	@Test
	public static void AmazonSearchtest()  {
				
		AmazonHome2 searchProduct = new AmazonHome2(driver);
		
		driver.get("https://www.amazon.com/");
		
		searchProduct.Continue_Shopping();
		
		searchProduct.Product_Search("mobile phones");		
			
		searchProduct.EnterProductSearch();			
		
	}
	
	@AfterTest
	public void tearDownTest() {
		//driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
