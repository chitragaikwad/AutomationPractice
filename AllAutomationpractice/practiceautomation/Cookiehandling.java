package practiceautomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiehandling {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
	 Set<Cookie>cookies=(driver.manage().getCookies());//CAPTURE ALL THE COOKIES FROM THE BROWSER
//	  System.out.println("count of cookies:"+cookies.size());//PRINT SIZE OF COOKIES
// for(Cookie cookie:cookies) //read and print the all the cookies
// { 
//	 System.out.println(cookie.getName()+":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getDomain()+":"+cookie.isSecure()+":"+cookie.getPath());
//	 }

     Cookie ckobj= new Cookie("My cookie","123456789");
	  driver.manage().addCookie(ckobj);
	   cookies=(driver.manage().getCookies()); 
	
         for(Cookie cookie:cookies) 
         {	 
		 
		System.out.println(cookie.getName()+":"+cookie.getValue()+":"+cookie.getDomain()+":"+cookie.getExpiry()+":"+cookie.isSecure()+":"+cookie.getPath()) ;   		 
         }
         
	System.out.println("count of all cookies:"+cookies.size());
	
	System.out.println(driver.manage().getCookieNamed("session-id"));//print Specific Cookie
	
	driver.manage().deleteCookieNamed("csm-hit");
	
	//driver.manage().deleteAllCookies();
	
	driver.quit();
	
	
	
	
	
	
}
}
 