package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkHandle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		
		
		
//=========to get the list of all the links present on web page=======================================
		
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println( allLinks.size());
		
		 //Traversing through the list and printing its text along with link address
		 for(WebElement link:allLinks){
			
		 System.out.println(link.getText() );
		 }
		
		 
		 WebElement linkhome=driver.findElement(By.xpath("//a[@id='simpleLink']"));
		 linkhome.click();                             //================ home link moves to next page after click
		 
		 
		 
	  
		  WebElement dynamichome=driver.findElement(By.xpath("//a[@id='dynamicLink']"));
			 dynamichome.click();                      //==================home dynamic link also moves to next page after click
		  
		 
			 
		 WebElement linkcreate=driver.findElement(By.xpath("//a[@id='created']"));
     	 System.out.println("Link has responded with staus 201 and status text Created");
		 linkcreate.click();                     //======================create link
			
		 
		 WebElement nocontent =driver.findElement(By.xpath("//a[@id='no-content']"));
		 System.out.println("Link has responded with staus 204 and status text No Content");
		 nocontent.click();                    // 	No content link
		 
		
		

					  
		 
		 
		 
		 


	
	}
			
	}
	
