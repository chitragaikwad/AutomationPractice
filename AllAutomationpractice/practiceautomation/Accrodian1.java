package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accrodian1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver",
				"\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/accordian");
		driver.manage().window().maximize();

		WebElement section1 = driver.findElement(By.xpath("//*[@id=\"section1Heading\"]"));
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", section1);
		Thread.sleep(3000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", section1);
        Thread.sleep(3000);

		WebElement section2 = driver.findElement(By.xpath("//*[@id=\"section2Heading\"]"));
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", section2);
		Thread.sleep(2000);
		
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", section2);

		WebElement section3 = driver.findElement(By.xpath("//*[@id=\"section3Heading\"]"));
		
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", section3);
		Thread.sleep(2000);
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", section3);

	}

}
