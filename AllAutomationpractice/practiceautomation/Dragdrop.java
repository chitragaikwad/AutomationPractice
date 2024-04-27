package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		

		WebElement frame= driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame); //switching from frame

		
WebElement src1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));/* source1*/
WebElement src2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]"));
WebElement src3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
WebElement src4 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]"));


		WebElement dest = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions act =new Actions(driver);
		
		act. dragAndDrop(src1,dest).build().perform();
		act. dragAndDrop(src2,dest).build().perform();
		act. dragAndDrop(src3,dest).build().perform();
		act. dragAndDrop(src4,dest).build().perform();
	}

}
