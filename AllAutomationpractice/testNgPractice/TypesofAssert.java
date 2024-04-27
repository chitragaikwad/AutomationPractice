package testNgPractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TypesofAssert {

	
	

	WebDriver driver;
	
	@BeforeMethod
	public void  setup() {
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\")");
		driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	
	@Test(priority=1)//making assertion fail
	public void testsoftAssertFunctions() {
		SoftAssert softassert=new SoftAssert();
	   String ActualTitle=driver.getTitle() ;
	   String ExpectedTitle="https://demo.nopcommerce.com/login";
	  softassert. assertEquals(ActualTitle,ExpectedTitle);
	  softassert.assertNotEquals(ActualTitle,ExpectedTitle);
	  String verifyassertNull="10";
	  String verifyassertnotNull=null;
	  softassert.assertNull(verifyassertNull);
	  softassert.assertNotNull(verifyassertnotNull);
	  softassert.assertFalse(true);
	  softassert.assertTrue(false);
	  softassert.assertAll();
	  System.out.println("soft assertion");
	  
		
	}
	
	
	
	
	@Test(priority=2)//making assertion fail
	public void testHardAssertFunctions() {
		String ActualTitle=driver.getTitle() ;
		   String ExpectedTitle="https://demo.nopcommerce.com/login";
		       assertEquals(ActualTitle,ExpectedTitle);
			   assertNotEquals(ActualTitle,ExpectedTitle);
			  String verifyassertNull="10";
			  String verifyassertnotNull=null;
			  assertNull(verifyassertNull);
			  assertNotNull(verifyassertnotNull);
			  assertFalse(true);
		      assertTrue(false);
			  System.out.println("hard assertion");
			  
	}
	
	
	@Test(priority=3)//making assertion pass
	public void testAssertFunctions() {
		String ActualTitle=driver.getTitle() ;
		   String ExpectedTitle="nopCommerce demo store";
		       assertEquals(ActualTitle,ExpectedTitle);//actual and expected should be same
		       String ActualTitle1=driver.getTitle() ;
			   String ExpectedTitle1="https://demo.nopcommerce.com/login";
			   assertNotEquals(ActualTitle1,ExpectedTitle1);//actual and expected should not be same
			  String verifyassertNull=null;
			  String verifyassertnotNull="10";
			  assertNull(verifyassertNull);// should be null
			  assertNotNull(verifyassertnotNull);// should not null
			  assertFalse(false);// condition should be return false
		      assertTrue(true);// condition should return true
			  System.out.println(" all assertions are pass");
			  
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
