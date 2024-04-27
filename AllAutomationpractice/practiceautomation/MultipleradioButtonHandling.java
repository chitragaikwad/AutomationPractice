package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleradioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		// ========================= to handle the multiple radio buttons==================
		
		 List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type='radio']"));
			
			
			
		 // traverse through the list and select all radio button if they are enabled and displayed.
		  		for(int i=0; i<radiobutton.size(); i++)
		  		{
		  			if(radiobutton.get(i).isDisplayed() && radiobutton.get(i).isEnabled())
		  			{
		                     System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
		                          radiobutton.get(i).click();
		  			}
		  		}
		  		
		  		
		  		
		  		
//		  	deSelect the radio button on index 1 from the list of radio button selected above
			
//				radiobutton.get(1).click();
				if(radiobutton.get(0).isSelected())
				{
					System.out.println("Radio button is still selected");
				}
				else
				{
					System.out.println("Radio button is deSelected successfully");
			
			     }

}
}
