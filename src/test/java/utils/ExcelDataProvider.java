package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void SetUpBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test(dataProvider="test1data")
	public void test1(String Search, String Rate) throws InterruptedException {
		System.out.println(Search + " | " + Rate);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys(Search);
		
		Thread.sleep(2000);
		
		
		
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		
		String ProjectPath = System.getProperty("user.dir");
		Object data [][] = testdata(ProjectPath + "/Excel/data.xlsx","Sheet1");
		return data;
	}
	
	
	public Object[][] testdata(String excelpath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelpath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data [] [] = new Object [rowCount-1] [colCount];
		
		for(int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				
				String CellData = excel.getCellDataString(i, j);
				//System.out.print(CellData + " | ");
				
				data[i-1][j] = CellData;
			
			}
			
			//System.out.println(); 
		}
		
		return data;
		
	}

}
