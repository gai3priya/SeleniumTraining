package Week3.Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ExcelRead {

	// How to read excel files using Apache POI

	public static void main(String[] args) throws IOException {
		
		 DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
	        
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        
	        options.merge(cap);
	        ChromeDriver driver = new ChromeDriver(options);
	        
	        
		// I have placed an excel file 'Test.xlsx' in my D Driver
		FileInputStream fis = new FileInputStream("C:\\TestLeaf\\DataDrivenFramework\\src\\test\\resources\\Excel\\TestData.xlsx");
		System.out.println("Done");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		System.out.println("Done");
		XSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println("Done");
		// I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
		// Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		// String cellval = cell.getStringCellValue();
		// System.out.println(cellval);

	}
}
