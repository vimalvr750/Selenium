package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AmazonHome2;

public class Test1_AmazonSearch2 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		AmazonSearchtest();
		
	}

	
	public static void AmazonSearchtest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		AmazonHome2 searchProduct = new AmazonHome2(driver);
		
		driver.get("https://www.amazon.com/");
		
		searchProduct.Continue_Shopping();
		
		searchProduct.Product_Search("mobile phones");		
			
		searchProduct.EnterProductSearch();
		
		Thread.sleep(2000);
		searchProduct.DismissPopup();
		
		
	}
}
