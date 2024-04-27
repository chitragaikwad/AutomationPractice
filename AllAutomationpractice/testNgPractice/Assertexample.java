package testNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertexample {

	
	WebDriver driver;
	
	@BeforeMethod
	public void  setup() {
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority=1)
	public void verifytitle() {
		String ActualTitle= driver.getTitle();
		String ExpectedTitle="Automation Demo Site";
		Assert.assertNotEquals(ActualTitle,ExpectedTitle);
	}
	
	
	
	
	@Test(priority=2,groups="logo")
	public void logo() {
		WebElement logo=driver.findElement(By.xpath("//img[@alt='image not displaying']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test(priority=1,groups="homepage")
	public void HomepageTitle() {
		String title=driver.getTitle();
		System.out.println("title of page:"+title);
		Assert.assertEquals(title,"Register","title is not matched");
	}
	
	@Test(priority=3,groups="link")
	public void register() {
		WebElement fname= driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));
		Assert.assertTrue(fname .isDisplayed(),"not displayed");
	}

	
	@Test(priority=4,groups="test",enabled=false)// make this test case disable
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
