package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip_launch_Page {
	
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	By closelogin = By.xpath("//span[@data-cy='closeModal']");
	By minimizeAi = By.xpath("//img[@alt='minimize']");
	By Search_button = By.xpath("//a[text()='Search']");
	
	
	public Makemytrip_launch_Page(WebDriver driver) {
		this.driver = driver;
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void close_login() {
		
		WebElement Close_button = wait.until(ExpectedConditions.visibilityOfElementLocated(closelogin));
		Close_button.click();	
		
	}
	
	public void minimize_ai() {
		driver.findElement(minimizeAi).click();
	}
	
	public void Search() {
		driver.findElement(Search_button).click();
	}

	
	
}
