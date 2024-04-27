package practiceautomation;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.manage().window().maximize();
	    
	   
		
//	    new browser window or a new tab
		
//		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
//		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
//		System.out.println(driver.getTitle());
//		
//		Set<String>s=driver.getWindowHandles();
//		
//		
//		for(String i:s) {
//		String j=	driver.switchTo().window(i).getTitle();
//		System.out.println(j);

//		
//		    if( j. contains("Frames & windows")) {
//			driver.close();
//		}
//
//		}
	    
	    
//		new window handle
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
//	    driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		Thread.sleep(1000);
//	    
	    
//		 Multiple windows handles
		driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s1=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s1.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		
		
		
		
	
	
	
	
	}
	
}
	
	



