package practiceautomation;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://jqueryui.com/selectmenu/#default");
	    driver.manage().window().maximize();
	  
	    WebElement frame=   driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
	    
//	    WebElement speed = driver.findElement(By.xpath("//*[@id=\"speed-button\"]"));
//	    
//	    speed.click();
//	    
//	    driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
//	    
//	    Thread.sleep(1000);
	    
       WebElement file  = driver.findElement(By.xpath("//span[contains(@id,'files-button')]"));
    
	    file.click();
	    
      driver.findElement(By.xpath(" //div[@id='ui-id-2']")).click();
	    
	    
	    
//	     Thread.sleep(1000);    
//         WebElement selectnumber = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
//	   
//       selectnumber.click();
//       driver.findElement(By.xpath("//ul[@id=\"number-menu\"]/li[4]")).click();
//	    
//      
//	    
//	    
//       WebElement pickone= driver.findElement(By.xpath(" //span[contains(text(),'Please pick one')]"));
//	    pickone.click();
//	    
//       driver.findElement(By.xpath("//*[@id=\"salutation-menu\"]/li[3]")).click();
     
	}

}
