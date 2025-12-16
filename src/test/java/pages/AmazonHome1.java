package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHome1 {
	
	private static WebElement element = null;
	
	public static WebElement ContinueShopping(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		return element;
	}
	
	public static WebElement Product_Search(WebDriver driver) {
						
			element = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
			return element;
			
		}
	
	public static WebElement Dismiss_popup(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		return element;
		
	}
	
	
	public static WebElement Enter_ProductSearch(WebDriver driver) {
		element = driver.findElement(By.id("nav-search-submit-button"));
		return element;
	}
	
}


