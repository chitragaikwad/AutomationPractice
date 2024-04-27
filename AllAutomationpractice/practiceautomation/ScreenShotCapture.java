package practiceautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.get("https://www.opencart.com/");
		driver.manage().window().fullscreen();
		
		//==============================CAPTURE FULL SCREEN ==================================
         //TakesScreenshot ts = ((TakesScreenshot)driver);
		
		//File source = ts.getScreenshotAs(OutputType.FILE);
		
	//	File destination=new File("C:\\Users\\hp\\Documents\\Screenshot.png");
		
		//FileHandler.copy(source,destination);
		
	//	driver.close();
	//===================================CAPTURE SOME PORTION======================================	
		
		
WebElement section=driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"))	;	
File source = section.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\hp\\Documents\\Screens.png");
		
		FileHandler.copy(source,destination);
		
		driver.close();
	//================================	Capture element screenshot on webPage==========================
//		WebElement ELEMENT=driver.findElement(By.xpath("//a[normalize-space()='Best Sellers']"))	;	
//		File source = ELEMENT.getScreenshotAs(OutputType.FILE);
//				
//				File destination=new File("C:\\Users\\hp\\Documents\\ELEMENT.png");
//				
//				FileHandler.copy(source,destination);
//				
				driver.close();
	}

}
