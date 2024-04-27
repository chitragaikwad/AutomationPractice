package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Resizable.html");
	    driver.manage().window().maximize();
	    
	    
	  
	    
	
	    WebElement resizable=   driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	    
    System.out.println("Initial position of quardinates:"+resizable.getLocation());
	
	     Actions act=new Actions(driver);
	     
	     
	     
	     
    act.dragAndDropBy(resizable, 330,10).build().perform();
//	     act.clickAndHold( resizable).moveByOffset(150, 100).perform();  
	    
	    System.out.println("after position of quardinates:"+resizable.getLocation());
	    

	}

}
