package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AmazonHome2;


public class ExtentReport_Basic {
	
	   static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Amazon Home", "Amazon Search");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		AmazonHome2 searchProduct = new AmazonHome2(driver);
		
		test1.log(Status.INFO, "launch the Amazon url");
		driver.get("https://www.amazon.com/");
		test1.pass("Launched Amazon page");
		
		//searchProduct.Continue_Shopping();
		//test1.pass("Able to click on Continue Shopping button and launch Amazon Home page");
		
		searchProduct.Product_Search("mobile phones");		
		test1.pass("Able to Search Products in Search bar");
		
		//searchProduct.EnterProductSearch();	
		//test1.pass("List of Products are displayed");
		
		test1.info("Test is completed");
		
		extent.flush();
		
	}

}
