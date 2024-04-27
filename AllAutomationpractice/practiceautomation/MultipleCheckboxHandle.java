package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckboxHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    driver.manage().window().maximize();
		
	   List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println( "number of ckeckboxex:"+checkboxes.size());
		
		
	 // traverse through the list and select all check boxes if they are  displayed and enabled
	   
	  		for(int i=0; i<checkboxes.size(); i++)
	  		{
	  			if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
	  			{
	                     System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
	                          checkboxes.get(i).click();
	  			}
	  		}
	  		
	  		
	  		
	  		
	  	//d- Select the check box on index 1 from the list of check boxes selected above
	  		
	  		
			System.out.println("de-selecting checkbox with index 1");
			
			checkboxes.get(1).click();
			if(checkboxes.get(1).isSelected())
			{
				System.out.println("Checkbox is still selected");
			}
			else
			{
				System.out.println("Checkbox is deselected successfully");
		
		
		
	}

}
}
