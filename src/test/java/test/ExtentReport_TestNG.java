package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport_TestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	WebDriver driver;
	
	
	
	@BeforeSuite
	public void SetUp() {
		
		htmlReporter = new ExtentHtmlReporter ("extent_report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
					
	}
	
	@BeforeTest
	
	public void SetUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() {
		
		ExtentTest test = extent.createTest("AmazonHome","AmazonSearch");
		
		driver.get("https://www.amazon.com/");
		
		test.pass("Navigated to the Amazon Homepage");
		test.log(Status.INFO, "Launch to the Amazon page");
		test.info("Amazon HomePage");
		
		
	}
	
	@AfterTest
	
	public void tearDownBrowser() {
		driver.close();
		driver.quit();
		System.out.println("Test is completed Successfully");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}

}
