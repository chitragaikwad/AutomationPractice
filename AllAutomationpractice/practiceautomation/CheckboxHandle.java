package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandle {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/checkbox");
	    driver.manage().window().maximize();
		//============to  handle the static check boxes=========================================== 
		driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']")).click();
		
		
		driver.findElement(By.xpath("//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']")).click();
	}

}
