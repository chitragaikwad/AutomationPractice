package practiceautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");//============get the urL
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.paytm.com");//====to navigate to urL
		Thread.sleep(100);
		
		
		driver.navigate().back();//================to navigate to backward tab to the web page
		Thread.sleep(1000);
		
		driver.navigate(). forward();//=============to navigate to forward tab of web page
		Thread.sleep(2000);
		
		driver.navigate().refresh();//========to refresh the web page
		Thread.sleep(2000);
		
		driver.quit();//  to close all the open tabs
		
		
		driver.close();// =============to close the current tab
	}
}



