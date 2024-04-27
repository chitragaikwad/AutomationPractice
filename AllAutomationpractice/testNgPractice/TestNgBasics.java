package testNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	@BeforeSuite
	public void setup() {
		System.out.println("set up the browser");
	}

	@BeforeTest

	public void loginPAage() {
		System.out.println("login method");
	}

	@BeforeClass
	public void launchbrowser() {
		System.out.println("launch browser");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("https://www.google.com");
	}

	@Test
	public void getTitle() {
		System.out.println("title of page");
	}

	@Test

	public void searchbar() {
		System.out.println("click on search bar");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}

	@AfterTest
	public void deletecookies() {
		System.out.println("all cookies are deleted");
	}

	@AfterSuite
	public void quit() {
		System.out.println("quite the page");
	}

}
