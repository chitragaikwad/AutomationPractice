package practiceautomation;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Selectable.html");
	    driver.manage().window().maximize();
	    
		
		
		
	
		Actions a = new Actions(driver);
		
		
		

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[1]"));

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[2]"));

		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[3]"));

		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[4]"));
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[5]"));
		
		WebElement element6= driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[6]"));
		
		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"Default\"]/ul/li[7]"));

		a.keyDown(Keys.CONTROL).click(element1).click(element3).click(element2).click(element4). click(element5).click(element6).click(element7).build().perform();

		Thread.sleep(2000);
		

			
		

	
			
		
		
		
		
		
		
		
		
	}

}
