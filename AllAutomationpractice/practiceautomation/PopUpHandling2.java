package practiceautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling2 {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		
	    driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		//===============to handle simple pop up============================
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
		
		//==========to handle  confirmation alert pop up===============================
	    WebElement element1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
	    Alert confirmationAlert = driver.switchTo().alert();
	    String alertText1 = confirmationAlert.getText();
	    System.out.println("Alert text is " + alertText1);
	    confirmationAlert.accept();
         confirmationAlert.dismiss();
	    
	    //===================to handle prompt alert pop up====================================
		
	    WebElement element2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element2);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText2 = promptAlert.getText();
		   System.out.println("Alert text is " + alertText2);
		   //=========after handling the pop up enter the data in text field present on that page
		   promptAlert.sendKeys("Test User123");
		  // promptAlert.accept();
		   promptAlert.dismiss();
		
		
		
	}

}
