package practiceautomation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "C:\\Users\\hp\\Downloads\\sample");

		options.setExperimentalOption("prefs", prefs);
		
		ChromeDriver driver= new ChromeDriver();
		
	    driver.get("https://demoqa.com/upload-download");
	    
	    driver.manage().window().maximize();
	    
	    String filepath="C:\\Users\\hp\\Documents\\downloadautomation";
	    
	    driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
	    
	    
	    
	    
	    
	

}
}
