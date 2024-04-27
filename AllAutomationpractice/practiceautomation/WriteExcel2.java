package practiceautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WriteExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    
	    
	    
		File xcelFile = new File("C:\\Users\\hp\\Desktop\\details.xlsx");
		System.out.println(xcelFile.exists());
		
		FileInputStream fis = new FileInputStream(xcelFile);
		
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		
		XSSFSheet sheet= wb.getSheetAt(0);
		
		
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		
			FileOutputStream fos = new FileOutputStream(xcelFile);
			
			wb.write(fos);
			
     		wb.close();
			
			System.out.println("Data is valid");
		}
	}


