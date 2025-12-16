package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_AmazonSearch {
	
	public static void main(String[] args) throws InterruptedException {
		AmazonSearch();
		
	}
	
	public static void AmazonSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch amazon url		
		driver.get("https://www.amazon.com");
		
		//click on continue shopping
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		//search mobile phones in search bar
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("mobile phones");
		
		Thread.sleep(2000);
		
		//click on Dismiss popup
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		
		//click the search button to search the item
		//driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.RETURN);
		
	}

}
