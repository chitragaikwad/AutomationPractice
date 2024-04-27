package practiceautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SliderHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
  driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
	    
	    driver.manage().window().maximize();
	  
	    
	    
	    
	    
	    WebElement frame=driver.findElement(By.xpath("//iframe[@width=\"700\"]"));
	    driver.switchTo().frame(frame);
	    
	     WebElement sliderRed = driver.findElement(By.xpath("//div[@id=\"red\"]/span"));
         Actions move1 = new Actions(driver);
          move1.dragAndDropBy(sliderRed, 50, 100).perform();
          System.out.println("Slide red Action performed.");
   
          Thread.sleep(3000);
    
    
    WebElement slidergreen = driver.findElement(By.xpath("//div[@id='green']/span"));
    Actions move2 = new Actions(driver);
    move2.dragAndDropBy(slidergreen, -50, 100).perform();
    System.out.println("Slide  green Action performed.");
    
    Thread.sleep(3000);
    
   WebElement sliderblue = driver.findElement(By.xpath("//div[@id='blue']/span"));
   Actions move3 = new Actions(driver);
   move3.dragAndDropBy(sliderblue, 100, 100).perform();
   System.out.println("Slide  blue Action performed.");
   
   Thread.sleep(3000);
   
   
   
   
   
    
	    
	}

}
