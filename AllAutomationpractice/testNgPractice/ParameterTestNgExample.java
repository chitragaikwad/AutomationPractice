package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNgExample {

	WebDriver driver;

	@Parameters({ "Browser", "url" })
	
	@Test(priority = 1)
	
	public void setup(String Browser, String url) 
	{

		if (Browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
			driver = new ChromeDriver();
			
//		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
		} 
		else if (Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("Webdriver.gecko.driver",
					"\"webdriver.gecko.driver\",\"C:\\Users\\hp\\Downloads\\geckodriver-v0.34.0-win32");
			driver = new FirefoxDriver();
//			driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		driver.get(url);
	}
	

	@Parameters({ "firstName", "lastName", "userEmail" })
	
	@Test(priority = 2)
	public void login(String firstName, String lastName, String userEmail) 
	{

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys(userEmail);

		System.out.println(firstName + "  " + lastName + "  " + userEmail);
	}

}
