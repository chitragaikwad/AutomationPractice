package practiceautomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args)throws  InterruptedException {
		// TODO Auto-generated method stub
		
		//==============================#Aproche1==============================================
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe" );
		
		//ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.opencart.com/");
		//driver.get("https://nopcommerce.com");
		//driver.close();
		
		//=========================Aproche2 - USING WEBDRIVERMANAGER======================================================
		
		WebDriverManager.chromedriver().setup();/*NEED TO ADD DEPENDENCIES IN POM CLASS OF WebDrivermanager from MVN repositorY SO THAT YOU CAN RUN ANY BROWSER ONCE FILES ARE EXTACTED AND NO NEED TO GIVE PATH LOCATION AS LIKE APROACH1*/
		ChromeDriver driver= new ChromeDriver();//YOU CAN RUN ANY BROWSER ONCE FILES ARE EXTACTED AND NO NEED TO GIVE PATH LOCATION AS LIKE APROACH1*/
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.quit();//======================================================to go out of the URL
		
		
 
		
		
		
		
		
		
		
		
		
		
		
		  
	}

}
