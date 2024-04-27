 package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		//drop down
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		List<WebElement>allitems=dropdown.getOptions();
		
		System.out.println("Dropdown size is:"+ allitems.size());
		
//	#approach1:to get print list of all items
		
//		for(WebElement option : allitems) {
//		    System.out.println("list of all items:"+option.getText());
//		}
		
//		#approach2:to get print list of all items
		
		
		for(int i=0;i<allitems.size();i++) {
			
			System.out.println("list of all items:"+allitems.get(i).getText());
	
		}
		           driver.manage().window().maximize();  //maximize the window
		
		//select items in drop down by select method
		    dropdown.deselectAll() ;      
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		dropdown.deselectByIndex(1);
		
		dropdown.selectByValue("AZERBAIJAN");
		Thread.sleep(1000);
		dropdown.deselectByValue("AZERBAIJAN");
		Thread.sleep(10000);
		dropdown.selectByVisibleText("AUSTRIA");
		dropdown.deselectByVisibleText("AUSTRIA");
		
		driver.close();
	}
	
	
	
	
	
	
	
	
}

