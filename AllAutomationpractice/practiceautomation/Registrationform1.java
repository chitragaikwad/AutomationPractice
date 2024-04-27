package practiceautomation;



import java.io.File;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registrationform1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	    driver.manage().window().maximize();
	    
	  
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Rohit");
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Sharma");
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("12345678");
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Pune");
        	driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("RohitSharma2@gmail.com");
        	
        	
          WebElement radioMale=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
          radioMale.click();
          WebElement radioFemale=driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_1']"));
           radioFemale.click();
 
      	radioMale.click();
        	
      	
        	
				Select dropdown= new Select(driver.findElement(By.xpath("")));
				
				List<WebElement>allitems=dropdown.getOptions();
				
				System.out.println("Dropdown size is:"+ allitems.size());
        	
				for(int i=0;i<allitems.size();i++) {
					
					System.out.println("list of all items:"+allitems.get(i).getText());
			
				}
				
				
				dropdown.selectByValue("Radio-0");
				Thread.sleep(1000);
				dropdown.deselectByValue("Radio-0");
				Thread.sleep(10000);
				dropdown.selectByValue("Radio-1");
				dropdown.deselectByValue("Radio-1");
				Thread.sleep(10000);
				dropdown.selectByValue("Radio-2");
				dropdown.deselectByValue("Radio-1");
				
			 File uploadFile = new File("C:\\Users\\hp\\Documents\\Selenium\\src\\locators");//FETCH THE FILE FROM LOCATION
				    WebElement fileInput = driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
				    
				    fileInput.sendKeys(uploadFile.getAbsolutePath());//UPLOD THE FILE
				
				WebElement SubmitButton=driver.findElement(By.xpath("//input[@id='FSsubmit']"));
			SubmitButton.click();
			driver.close();
        	
        	
        	
        	
        	
        	
        	
        }
	}
        
        
	




