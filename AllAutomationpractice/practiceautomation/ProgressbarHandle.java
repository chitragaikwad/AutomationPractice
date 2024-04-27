package practiceautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgressbarHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
//        driver.get("https://www.globalsqa.com/demo-site/progress-bar/#Download%20Manager");
        driver.get("https://demoqa.com/progress-bar");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

//		WebElement frame=driver.findElement(By.xpath("//iframe[@width=\"700\"]"));
//	    driver.switchTo().frame(frame);
//	    
		
		
//	    WebElement downloadbutton=driver.findElement(By.xpath("//button[contains(@id,'downloadButton')]"));
//	    		downloadbutton.click();
//		Thread.sleep(3000);
//		
//	    		driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
//		
		
		         WebElement start=driver.findElement(By.xpath("//button[contains(@id,'startStopButton')]"));
		         
		         Actions action = new Actions(driver);
		         action.click();
		         Thread.sleep(3000);
		
		         WebElement stop =	driver.findElement(By.xpath("//button[contains(@id,'startStopButton')]"));
		         stop.click();
		
		
	    		
		
	}

}
