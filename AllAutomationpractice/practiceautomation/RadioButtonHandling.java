package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
//	WebElement radioButtonyes = driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
//	radioButtonyes.click();
//		
//		System.out.println( radioButtonyes.isEnabled());
//		System.out.println( radioButtonyes.isDisplayed());
//		System.out.println( radioButtonyes.isSelected());
		
		
		WebElement radioButton2 = driver.findElement(By.xpath("//*[@id=\"impressiveRadio\"]"));
		radioButton2.click();
			
			System.out.println( radioButton2.isEnabled());
			System.out.println( radioButton2.isDisplayed());
			System.out.println( radioButton2.isSelected());
			

}
}
