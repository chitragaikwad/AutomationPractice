package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Image%20Based");
		driver.manage().window().maximize();
		
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@width=\"700\"]"));
	    driver.switchTo().frame(frame);
	    
		
		//Instantiate Action Class
		Actions actions = new Actions(driver);

		//Retrieve WebElement
		WebElement image = driver.findElement(By.xpath("/html/body/div[1]/div/h3/a"));

		// Using the action class to mimic mouse hover
		actions.moveToElement(image).perform();
		WebElement toolTip = driver.findElement(By.xpath("/html/body/div[1]/div/h3/a"));

		// To get the tool tip text and assert
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText);

		
		
		
		
		
	}

}
