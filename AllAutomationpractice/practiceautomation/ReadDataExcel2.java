package practiceautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
 		
        File xcelFile = new File("C:\\Users\\hp\\Desktop\\practce1.xlsx");
        
        System.out.println(xcelFile.exists());
        
		FileInputStream fis =new FileInputStream(xcelFile);
		
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		
	    XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row =sheet.getRow(2);
		XSSFCell col=row.getCell(0); 
		String Firstname=col.getStringCellValue();
		System.out.println(Firstname);
		
		
		
		XSSFRow row1 =sheet.getRow(2);
		XSSFCell col1=row1.getCell(1);
	    String Lastname=col1.getStringCellValue();
		System.out.println(Lastname);
	    
		
		
		
	}

}
