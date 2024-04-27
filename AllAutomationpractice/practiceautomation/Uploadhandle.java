package practiceautomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/upload-download");
	    driver.manage().window().maximize();
	    
	  
	    File uploadFile = new File("C:\\Users\\hp\\Documents\\Selenium\\src\\locators");//FETCH THE FILE FROM LOCATION

	    WebElement fileInput = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	    
	    fileInput.sendKeys(uploadFile.getAbsolutePath());//UPLOD THE FILE

	    
	}

}
