package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicProperties {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
//WebElement buttontimes=	driver.findElement(By.xpath("//button[@id='enableAfter']"));//====button enables after 5seconds
//		Actions action1=new Actions(driver);
//		action1.moveToElement(buttontimes).click().perform();
//		Thread.sleep(2000);
//		
//		WebElement buttoncolorchannge=driver.findElement(By.xpath("//button[@id='colorChange']"));
//	
//		Actions action2 = new Actions(driver);
//		action2.moveToElement(buttoncolorchannge).click().perform();
//		Thread.sleep(2000);
		
		WebElement visiblwbutton=driver.findElement(By.xpath("//button[@id='colorChange']"));
		
		Actions action3 = new Actions(driver);
		action3.moveToElement( visiblwbutton).click().perform();
		
		
	}

}
