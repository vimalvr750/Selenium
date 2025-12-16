package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGmultiBrowserDemo {
	
	WebDriver driver;
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setUp(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}

	@Test
	public void test1() {
		driver.get("https://www.flipkart.com/");
	
	}
	
     @AfterTest
     public void tearDown() {
    	 System.out.println("Test completed Successfully");
     }
}
