package demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT_demo {
	
	public static void main(String[] args) throws IOException {
		test();
	}
	
	public static void test() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tiiny.host/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				
		driver.findElement(By.xpath("//*[@id=\"content-selector-tabpane-documents\"]/div/div/div[2]/button")).click();
		
		Runtime.getRuntime().exec("D:\\Automation\\FileUpload_Autofit_Scrip.exe");
	}

}
