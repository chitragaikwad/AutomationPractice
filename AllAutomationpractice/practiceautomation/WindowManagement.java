package practiceautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		//======================TO SET THE DIMENSION OF WINDOW=================================
	Dimension d= new Dimension(200,300);
	driver.manage().window().setSize(d);
	driver.manage().window().getSize();	
    System.out.println(driver.manage().window().getSize());
		

	
	//===========================TO MANAGE THE SCREEN MAX TO MIN===================================
	driver.manage().window().maximize();
	Thread.sleep(1500);
	driver.manage().window().minimize();
	Thread.sleep(100);

    
    //=============================TO SET THE POSITION OF WINDOW============================================

	Point p=new Point(-220,300);
	driver.manage().window().setPosition(p);
	driver.manage().window().getPosition();
	System.out.println(driver.manage().window().getPosition());	
	
//	driver.close();
	
	}

	
}
