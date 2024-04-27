package practiceautomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32");
		WebDriver driver = new ChromeDriver();
	 
		 
	         driver.get("https://demoqa.com/text-box");
	
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Anantika Thakur");
	
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("AnanatikaThaku@gmail.com");
		
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("plot no.1,Shriramnagar,Garkheda,Mumbai-100021");
		
		

		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("flat no 101,Dattaniwas society,Dttanagar,pune-300032");
		
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
