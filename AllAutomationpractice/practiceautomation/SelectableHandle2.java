package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Selectable.html");
	    
	    driver.manage().window().maximize();
	    
		
	  
	    driver.findElement(By.xpath("//a[normalize-space()='Serialize']")).click();
		Thread.sleep(2000);
		
		
		   Actions a = new Actions(driver);
		
		
		

	    WebElement element1 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[1]"));
		a.moveToElement(element1).click().build().perform();
		Thread.sleep(2000);
		
		
//		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[2]"));
//		a.moveToElement(element2).click().build().perform();
		Thread.sleep(2000);
		
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[3]"));
		a.moveToElement(element3).click().build().perform();
		
		Thread.sleep(2000);
	    WebElement element2 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[2]"));
	    a.moveToElement(element2).click().build().perform();
	    Thread.sleep(2000);
		
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[4]"));
		a.moveToElement(element4).click().build().perform();
		Thread.sleep(2000);
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[5]"));
		a.moveToElement(element5).click().build().perform();
		Thread.sleep(2000);
		
		WebElement element6= driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[6]"));
		a.moveToElement(element6).click().build().perform();
		Thread.sleep(2000);
		
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"Serialize\"]/ul/li[7]"));
		a.moveToElement(element7).click().build().perform();

		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
