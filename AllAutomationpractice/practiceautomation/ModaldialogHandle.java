package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModaldialogHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.lambdatest.com/selenium-playground/bootstrap-modal-demo");
	    driver.manage().window().maximize();
	    
		
	    WebElement smallmodal=driver.findElement(By.xpath("//button[@data-target='#myModal']"));
	     JavascriptExecutor js1 = (JavascriptExecutor) driver;	
	    js1.executeScript("arguments[0].click();",smallmodal ); 		
		    	Thread.sleep(1000);	
	    driver.findElement(By.xpath("//div[@id='myModal']//button[@type='button'][normalize-space()='Save Changes']")).click();
		    
	    Thread.sleep(3000);
		
		
	    WebElement largemodal=driver.findElement(By.xpath("//button[@data-target='#myMultiModal']"));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;	
	   js2.executeScript("arguments[0].click();",largemodal ); 		
		    	Thread.sleep(1000);	
	   driver.findElement(By.xpath("//button[@class='btn btn-dark selenium_btn hover:bg-lambda-900 hover:border-lambda-900'][normalize-space()='Launch Modal']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@id='mySecondModal']//button[@type='button'][normalize-space()='Close']")).click();
	   Thread.sleep(1000);
	WebElement svechanges=   driver.findElement(By.xpath("//*[@id=\"myMultiModal\"]/div/div/div[3]/button[1]"));
	JavascriptExecutor js3 = (JavascriptExecutor) driver;	
	   js3.executeScript("arguments[0].click();",svechanges ); 
		
	}

}
