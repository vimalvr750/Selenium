package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.AmazonHome1;

public class Test1_AmazonSearch1 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		AmazonSearch();
		
	}
	
	public static void AmazonSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch amazon url		
		driver.get("https://www.amazon.com/");
		
		//click on continue shopping		
		AmazonHome1.ContinueShopping(driver).click();
		
		//search mobile phones in search bar				
		AmazonHome1.Product_Search(driver).sendKeys("mobile phones");
		
		Thread.sleep(2000);
		
		//click on Dismiss popup		
		AmazonHome1.Dismiss_popup(driver).click();
		
		//click the search button to search the item		
		AmazonHome1.Enter_ProductSearch(driver).sendKeys(Keys.RETURN);
		
	}

}
