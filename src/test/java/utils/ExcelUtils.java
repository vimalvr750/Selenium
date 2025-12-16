package utils;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelpath, String sheetName){

		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
		}

		catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//getRowCount();

		//getCellDataString(1,0);
	}

	public static int getRowCount() {
		
		int rowCount = 0;

		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows:" + rowCount);
		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
			
			int colCount = 0;
		
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of Column:" + colCount);
		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return colCount;
	}

	public static String getCellDataString(int rownum, int colnum) {
		
		String CellData = null;
		
		

		try {

			CellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println(CellData);
		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();

		}
		return CellData;
	}

	public static void getCellDataNumber(int rownum, int colnum) {
		
		try {
			double CellData = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			
			//System.out.println(CellData);
		}
		
		catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
}
