package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver",
				"\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();

//	    driver.get("https://www.amazon.in/");
	driver.get("https://www.globalsqa.com/demo-site/auto-complete/");
//    driver.get("https://www.globalsqa.com/demo-site/auto-complete/#ComboBox");
		driver.manage().window().maximize();

		// =========================AUTOCOMPLETE FOR www.globalsqa.com===========================================

		WebElement frame = driver.findElement(By.xpath("//iframe[@width=\"700\"]"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("An");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

		System.out.println("Auto Suggest List ::" + list.size());

		for (WebElement suggest : list) {
			String option = suggest.getText();
			System.out.println(option);
			if (option.contains("ders"));
				
			{
				suggest.click();
			}

		}

		driver.findElement(By.xpath("//*[@id=\"combobox\"]")).sendKeys("clojure");

//============================for combox================================================
//	  driver.findElement(By.xpath("/html/body/div[1]/span/")).click();
//		Thread.sleep(2000);
//		
//	      List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]"));
//			
//			System.out.println("Auto Suggest List ::" + list.size());
//			
//			for(WebElement suggest:list)
//				{
//					String option=suggest.getText(); 
//					System.out.println(option);
//					if(option.contains("ics"));
//					{
//					suggest.click();
//				}
//				
//		
//		
//			}
//	================================for amazon================================	    

//	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mixer");
//		Thread.sleep(2000);
//	List<WebElement> Allsuggestions=driver.findElements(By.id("nav-flyout-searchAjax"));	
//	System.out.println(Allsuggestions.size());
//		for(WebElement suggest:Allsuggestions)
//		{
//			String option=suggest.getText();
//			System.out.println(option);
//			if(option.contains("mixer"));
//			{
//			suggest.click();
//		}
//		
//
//
//	}
	}
	}
				
				
	

