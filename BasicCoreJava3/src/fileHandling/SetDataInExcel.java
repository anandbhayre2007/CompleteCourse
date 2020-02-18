package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetDataInExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("D:\\12012019Automation\\BasicCoreJava3\\src\\fileHandling\\TestData.xlsx");

		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(15);
		if(row==null)
			row=sheet.createRow(15);		
		
		XSSFCell cell=row.getCell(0);
		if(cell==null)
			cell=row.createCell(0);
		
		cell.setCellValue("Anand");
		
		FileOutputStream file2= new FileOutputStream("D:\\12012019Automation\\BasicCoreJava3\\src\\fileHandling\\TestData.xlsx");
		wb.write(file2);
		
		
		
	}

}
