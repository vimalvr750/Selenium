package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHome2 {
	
	WebDriver driver = null;
	
	By ContinueShopping = By.xpath("//button[text()='Continue shopping']");
	By ProductSearch = By.xpath("//input[@placeholder='Search Amazon']");
	By Dismiss_Popup = By.xpath("xpath(\"//input[@data-action-type='DISMISS']");
	By Enter_ProductSearch = By.id("nav-search-submit-button");
	
	public AmazonHome2 (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Continue_Shopping() {
		driver.findElement(ContinueShopping).click();
	}
	
	public void Product_Search(String text) {
		driver.findElement(ProductSearch).sendKeys(text);
	}
	
	public void DismissPopup() {
		driver.findElement(Dismiss_Popup).click();
	}
	
	public void EnterProductSearch() {
		driver.findElement(Enter_ProductSearch);
	}

}
