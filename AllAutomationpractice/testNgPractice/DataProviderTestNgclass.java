package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNgclass {

	WebDriver driver;
	
	@DataProvider(name="RgistrationDataprovider")
	public Object[][] getData(){
	Object[][] data= {{"Rohit","Sharma","Rohitsharma@gmail.com"},{"Prachi","DeshMukh","Parchideshmukh@gmal.com"}};
	return data;
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	
	@Test(dataProvider="RgistrationDataprovider")
	public void Registrationpage(String firstName,String lastName,String userEmail) throws InterruptedException  {
		
		
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(userEmail);
		System.out.println(firstName+"  "+lastName+"  "+userEmail);
		
		
		
	}

	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
