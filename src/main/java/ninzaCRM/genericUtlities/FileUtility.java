package ninzaCRM.genericUtlities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic methods related to
 * File operations like property file , excel File
 * @author Antara Pal
 */

public class FileUtility {
	/**
	 * This method will read data from property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	
	/**
	 * This method will read data from excel file and return the value to caller
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws Throwable
	 */
	
	public String readDataFromExcelFile(String sheetName, int rowNo, int cellNo) throws Throwable {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String value = wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		wb.close();
		return value;
	}
	 

}
