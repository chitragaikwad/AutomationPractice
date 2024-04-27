package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSliderHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://omayo.blogspot.com/p/page3.html");
	    driver.manage().window().maximize();
	  
//====================To HANDLE MIMIMUM RANGE OG PRICE================================================
	   
	    
	    WebElement MinRange = driver.findElement(By.xpath("//*[@id=\"post-body-6103478144908648662\"]/div[1]/div[2]/form/div/div/div[2]/a[1]"));
	   System.out.println("Initial location"+MinRange.getLocation());
	   System.out.println(" Initial Size location"+MinRange.getSize());
	    
        Actions action1 = new Actions(driver);
         action1.dragAndDropBy(MinRange , -50,0).perform();
         System.out.println("Slide minimum range price :"+ MinRange.getSize());
         System.out.println("after location"+MinRange.getLocation());
         
         
         
         Thread.sleep(3000);
       //=======================TO HANDLE MAX RANGE======================================  
	    
	    WebElement MaxRange = driver.findElement(By.xpath("//*[@id=\"post-body-6103478144908648662\"]/div[1]/div[2]/form/div/div/div[2]/a[2]"));
  	   System.out.println("Initial location"+MaxRange.getLocation());
  	   System.out.println(" Initial Size location"+MaxRange.getSize());
  	    
          Actions action2 = new Actions(driver);
           action2.dragAndDropBy(MaxRange , 50,0).perform();
           System.out.println("Slide minimum range price :"+ MaxRange.getSize());
           System.out.println("after location"+MaxRange.getLocation());
           Thread.sleep(3000);
  	    
	    
	    
        driver.quit();
	    
	    
	    
	    
	}

}
