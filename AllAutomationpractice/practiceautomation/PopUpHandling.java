package practiceautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUpHandling {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		
         ChromeDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		/*=================To HANDLE SIMPLE ALERT==============================================*/
		driver.findElement(By.id("alertButton")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
		/*=================To HANDLE CONFERMATION ALERT==============================================*/
	    WebElement element1 = driver.findElement(By.id("confirmButton"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
	    Alert confirmationAlert = driver.switchTo().alert();
	    String alertText1 = confirmationAlert.getText();
	    System.out.println("Alert text is " + alertText1);
	    confirmationAlert.accept();
	
		/*=================To HANDLE PROMPT ALERT==============================================*/
		WebElement element2 = driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element2);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText2 = promptAlert.getText();
		   System.out.println("Alert text is " + alertText2);
		   
		   promptAlert.sendKeys("Test User");
		   promptAlert.accept();
	}

}
