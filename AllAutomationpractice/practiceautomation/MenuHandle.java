package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/menu/#default");
		driver.manage().window().maximize();
		
		WebElement frame=   driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
	    
		 WebElement electronics =driver.findElement(By.xpath("//div[@id='ui-id-4']"));
		 electronics .click();
		 Thread.sleep(1000);
		 WebElement utility=   driver.findElement(By.xpath("//div[@id='ui-id-7']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(  utility).build().perform();
		
		
		
		
		
		
		
		
	}

}
