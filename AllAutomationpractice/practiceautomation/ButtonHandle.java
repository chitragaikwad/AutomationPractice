package practiceautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ButtonHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    driver.manage().window().maximize();
	    
	    
     WebElement Doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
     Actions act = new Actions(driver);
     act.doubleClick(Doubleclick).perform();//===================== TO DOUBLE CLICK ON BUTTON==================
     
	 WebElement RightClick=  driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
	  Actions action= new Actions(driver);
	  action.contextClick(RightClick).perform();//=======================TO RIGHT CKICK ON BUTTON================
	     
	    
	    WebElement DynamicClick=driver.findElement(By.xpath("//button[@id='kisu1']"));
	    JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()",DynamicClick);//================TO DYNAMIC LICK ON BUTTON=============
	    

	}

	
	}


