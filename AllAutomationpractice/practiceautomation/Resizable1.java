package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://jqueryui.com/resizable/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement frame=   driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
	    
	 WebElement resizable=   driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	 System.out.println("Initial position of quardinates:"+resizable.getLocation());
	    
	    Actions act=new Actions(driver);
	    act.dragAndDropBy(resizable, 230,10).build().perform();
	    
	    System.out.println("after position of quardinates:"+resizable.getLocation());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
