package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("number of i frames:" +  count);
		
		
		//switch to I-frame 
		
		
//		1) by name or id
//        2) by web element
//         3) by index
		
		
		driver.switchTo().frame("frm1");
		driver.findElement(By.xpath("//select[@id='selectnav1']")).click();
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("opencart");
		
	driver.close();
	
	
	}

}
