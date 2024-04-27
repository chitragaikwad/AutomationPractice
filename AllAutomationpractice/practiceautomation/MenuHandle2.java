package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/menu/#icons");
		driver.manage().window().maximize();
		
		
		
		WebElement frame=   driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
		
		WebElement playback= driver.findElement(By.xpath("//*[@id=\"menu\"]/li[5]"));
		Actions action = new Actions(driver);
		 action.moveToElement(playback).build().perform();
		
		Thread.sleep(1000);
		
		WebElement sublist= driver.findElement(By.xpath("//*[@id=\"menu\"]/li[5]/ul/li[3]"));
		Actions action1 = new Actions(driver);
		 action.moveToElement(sublist).build().perform();
		
		
		
	}

}
