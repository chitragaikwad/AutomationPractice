package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParellelTest1 {
	WebDriver driver;

	

	@Test(priority = 1)
	public void login()throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver",
				"\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rohit");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sharma");

		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("RohitSharma@gmailcom");
         Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void pagetitle()throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver",
				"\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize(); 

		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "DEMOQA", " title is not matched");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
