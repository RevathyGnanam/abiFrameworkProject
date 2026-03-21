package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="gfghfh")
	public String[][] getData() throws Exception{
		String path = System.getProperty("user.dir")+ "\\testData\\LoginData.xlsx";
		ExcelUtility utility = new ExcelUtility(path);
		int totalRows = utility.getRowCount("Sheet1");
		int totalColumn = utility.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[totalRows][totalColumn];
		for (int i = 1; i <=totalRows; i++) { //outer //row
			for (int j = 0; j < totalColumn; j++) { //column 0 1 
				loginData[i-1][j] = utility.getCellData("Sheet1", i, j); //01
				
			}
			
		}
 		return loginData;
	}
	
	
	@DataProvider(name="dataLogin")
	public String[][] getData1() throws Exception{
		String path = System.getProperty("user.dir")+ "\\testData\\LoginData.xlsx";
		ExcelUtility utility = new ExcelUtility(path);
		int totalRows = utility.getRowCount("Sheet1");
		int totalColumn = utility.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[totalRows][totalColumn];
		for (int i = 1; i <=totalRows; i++) { //outer //row
			for (int j = 0; j < totalColumn; j++) { //column 0 1 
				loginData[i-1][j] = utility.getCellData("Sheet1", i, j); //01
				
			}
			
		}
 		return loginData;
	}

}
