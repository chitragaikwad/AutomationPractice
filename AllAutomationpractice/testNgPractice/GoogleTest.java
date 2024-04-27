package testNgPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;

@BeforeMethod
public void setUp() {
	System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
	driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
}


@Test(priority=2,groups="titile")
public void googleTitle() {
	System.out.println("google Title");
}






@AfterMethod 
public void tearDown() {
	driver.quit();
}













}
