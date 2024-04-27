package practiceautomation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TabsHandling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://jqueryui.com/tabs/#collapsible");
	    driver.manage().window().maximize();
		
		
		
		WebElement frame=   driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
	    
//	    
//	    driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[2]")).click();
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[3]")).click();
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[1]")).click();
//	    Thread.sleep(1000);
	    
	    
	    WebElement tab1=driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[2]"));
	    
	   Actions act1 = new Actions(driver);
	   act1.doubleClick(tab1).perform();
	   tab1.click();
	   Thread.sleep(2000);
	    
	   
	    WebElement tab2=driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[3]"));
	    
	   Actions act2 = new Actions(driver);
	   act2.doubleClick(tab2).perform();
	  tab2.click();
	   Thread.sleep(2000);
	    
	    
	   WebElement tab3=driver.findElement(By.xpath("//*[@id=\"tabs\"]/ul/li[1]"));
	    
	   Actions act3 = new Actions(driver);
	   act3.doubleClick(tab3).perform();
	   tab3.click();
	    
	   Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
