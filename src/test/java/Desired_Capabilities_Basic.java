import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desired_Capabilities_Basic {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com");
		
		//driver.findElement(By.className("commonModal__close")).click();
		
		
		
		WebElement close = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']"))
			);
		
		close.click();
		
		
		
		driver.findElement(By.xpath("//img[@alt='minimize']")).click();
		
		
		
	}
	
	

}
