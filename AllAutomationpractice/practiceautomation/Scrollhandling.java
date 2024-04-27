package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollhandling {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.manage().window().maximize();
	    
	    
	    
	   //==================== scroll down on a web page in Selenium by defining the number of pixels========================================
		
	
	     JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0,500)", "");
//		
		
		
//=================================scroll down to an element in Selenium until it is visible==========================
		
		
//	    WebElement currentAdress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
	 // Scrolling down the page till the element is found		
//        js.executeScript("arguments[0].scrollIntoView();",currentAdress );
		
		
//===================== scroll down to the bottom of the webpage using Selenium===============================
		
		
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
// ======================== scroll horizontally on a web page to a specific web element using Selenium==================
        
        
        
        
        WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submit']")) ;
        js.executeScript("arguments[0].scrollIntoView();",submitbutton);
		
		
		
	}

}
