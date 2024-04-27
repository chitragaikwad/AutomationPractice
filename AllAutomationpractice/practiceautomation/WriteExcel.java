package practiceautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
	
	// TODO Auto-generated method stub

		
		
		File xcelFile = new File("C:\\Users\\hp\\Desktop\\practce1.xlsx");
		System.out.println(xcelFile.exists());
		FileInputStream fis = new FileInputStream(xcelFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		sheet.createRow(6).createCell(2).setCellValue("valid Username &Password");
		
		sheet.createRow(7).createCell(2).setCellValue("Valid Username but Invalid Password");
		
		sheet.createRow(8).createCell(2).setCellValue("InValid Username & Password");

		FileOutputStream fos = new FileOutputStream(xcelFile);

		wb.write(fos);
		
		wb.close();
		
		System.out.println("Data Entered Successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
