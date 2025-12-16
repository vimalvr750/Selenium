package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Launch_Page {
	
	WebDriver driver;
	
	By Login = By.xpath("//span[text()='Login']");
	By Search_Bar = By.className("Vy9RSP");
	
	public Flipkart_Launch_Page(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	public void Login_button() {
		driver.findElement(Login).click();
	}
	
	public void Search(String Search_item) {
		WebElement Search_Product = driver.findElement(Search_Bar);
		
		Search_Product.sendKeys(Search_item);
	}

}
