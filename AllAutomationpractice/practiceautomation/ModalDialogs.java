package practiceautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import dev.failsafe.internal.util.Assert;

public class ModalDialogs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/modal-dialogs");
	    driver.manage().window().maximize();
	    
	    
	WebElement smallmodal=driver.findElement(By.xpath("//button[@id='showSmallModal']"));
     JavascriptExecutor js1 = (JavascriptExecutor) driver;	
    js1.executeScript("arguments[0].click();",smallmodal ); 		
	    	Thread.sleep(1000);	
    driver.findElement(By.xpath("//button[@id='closeSmallModal']")).click();
	    
	    Thread.sleep(3000);
   
    WebElement largemodal=driver.findElement(By.xpath("//button[@id='showLargeModal']"));
    JavascriptExecutor js2 = (JavascriptExecutor) driver;	
   js2.executeScript("arguments[0].click();",largemodal ); 		
	    	Thread.sleep(1000);	
   driver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();
  		
	    	}
	    
	    
	}


