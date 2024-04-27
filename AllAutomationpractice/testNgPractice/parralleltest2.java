package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parralleltest2 {

	WebDriver driver;
	
	
	@Test(priority = 1)
	public void logo()throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		
      WebElement logo=  driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
        Assert.assertTrue(logo.isDisplayed());
         Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
