package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "/Files/TestData.xls";
		FileInputStream fis =  new FileInputStream(new File(path));
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Record");
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(sheet.getRow(1).getCell(3));
		System.out.println(value);
		String val2 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(val2);
		
		
		
	}

}
