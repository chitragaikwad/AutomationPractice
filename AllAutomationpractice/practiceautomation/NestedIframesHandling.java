package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframesHandling {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		int count = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("number of i frames:" +  count);
		
		
	driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	Thread.sleep(2000);
	
	
	//This element is inside 2 nested frames.
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(frame1);//////PARENT FRAME
	
	Thread.sleep(2000);
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
	driver.switchTo().frame(frame2);////////CHILD FRAME
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Radhika");//ENTERING THE NAME IN THE TEXT FIELD ELEMENT PREDENT ON CHIDFRAME
		driver.switchTo().defaultContent();
		
	driver.close();
		
		

	}

}
