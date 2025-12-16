import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		//String ProjectPath = System.getProperty("user.dir");
		//System.out.println("Project Path : "+ ProjectPath);
	
		//System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", ProjectPath+"\\drivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement launchamazon = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		launchamazon.click();
		
		WebElement SearchAmazon = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
		SearchAmazon.sendKeys("mobile phone");
		
		/*List<WebElement> ListOfInputElements = driver.findElements(By.xpath("//input"));
		int count = ListOfInputElements.size();
		System.out.println(count);*/
		
		WebElement DismissPopup = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		DismissPopup.click();
		
		//driver.close();
		//driver.quit();
	}

}
