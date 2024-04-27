package practiceautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
	       System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
//			WebDriver driver=new ChromeDriver();
			
			ChromeDriver driver= new ChromeDriver();
	         driver.get("https://demo.automationtesting.in/Register.html");
		     driver.manage().window().maximize();
		    
		File xcelFile = new File("C:\\Users\\hp\\Desktop\\practce1.xlsx");
		System.out.println(xcelFile.exists());
		
		FileInputStream fis =new FileInputStream(xcelFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		String Firstname=wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		System.out.println(Firstname);
		
		
		String Lastname=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(Lastname);

		
		  driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys(Firstname);
			
		   driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys(Lastname);
	}
}


