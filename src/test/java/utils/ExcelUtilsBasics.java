package utils;

public class ExcelUtilsBasics {
	
	public static void main(String[] args) {
		
		String ProjectPath = System.getProperty("user.dir");
		
		ExcelUtils excel = new ExcelUtils(ProjectPath + "/Excel/data.xlsx", "Sheet1");
			
		excel.getRowCount();
		excel.getCellData(1, 0);
		
		
	}

}
