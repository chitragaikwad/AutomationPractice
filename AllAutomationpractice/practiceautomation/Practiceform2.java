package practiceautomation;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Practiceform2 {
 
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.manage().window().maximize();
    
      

	    
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rohit");
    	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sharma");
    	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rohitsharma@example.com");
	    
        WebElement radioMale=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	    radioMale.click();
	
    System.out.println( radioMale.isEnabled());
	System.out.println(radioMale.isDisplayed());
	System.out.println( radioMale.isSelected());
		
		WebElement radioFemale=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
	    radioFemale.click();
	    
	        System.out.println(radioFemale .isEnabled());
		       System.out.println(radioFemale.isDisplayed());
		       System.out.println( radioFemale.isSelected());
	    
	    
	    WebElement other=driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
	     other.click();
		    
		  System.out.println(  other.isEnabled());
			System.out.println(  other.isDisplayed()); 
			System.out.println(   other.isSelected());
		    
			 radioMale.click();
			 
			 Thread.sleep(1000);
			 
				driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567899"); 
				
				
				    
				    
				    WebElement datepicker= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
				    JavascriptExecutor js = (JavascriptExecutor) driver;	
                    js.executeScript("arguments[0].click();", datepicker);
		        

		
                Select selmonth = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
                selmonth .selectByVisibleText("March");
                
                
                
                
                Select selyear = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
                selyear .selectByVisibleText("1992");
                
                
      WebElement date=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]"));
				 date.click();
				 
      
				  WebElement subject=driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
                  
                  JavascriptExecutor js1 = (JavascriptExecutor) driver;
                  js1.executeScript("arguments[0].scrollIntoView();",subject);
                  js1.executeScript("arguments[0].click();",subject);
                  Actions action = new Actions(driver);
                  action.sendKeys(subject, "Maths","English").build().perform();
      
                  
                  WebElement hobbiesports=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
                  hobbiesports .click();
          	
              System.out.println( hobbiesports.isEnabled());
          	System.out.println(hobbiesports.isDisplayed());
          	System.out.println( hobbiesports.isSelected());
                  
                  
                  
          	 WebElement hobbieReading=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
          	 hobbieReading .click();
     	
         System.out.println( hobbieReading.isEnabled());
     	System.out.println( hobbieReading.isDisplayed());
     	System.out.println(  hobbieReading.isSelected());
                  
                  
                  
     	WebElement hobbieMusic=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
     	hobbieMusic .click();
	
    System.out.println( hobbieMusic.isEnabled());
	System.out.println( hobbieMusic.isDisplayed());
	System.out.println(  hobbieMusic.isSelected());
             
          Thread.sleep(1000) ;       
          hobbieMusic .click();
          
          File uploadFile = new File("C:\\Users\\hp\\Documents\\Selenium\\src\\locators");//FETCH THE FILE FROM LOCATION

  	    WebElement fileInput = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
  	    
  	    fileInput.sendKeys(uploadFile.getAbsolutePath());//UPLOD THE FILE
	 
  
	 

  	    WebElement CurrentAdd= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	 
  	  CurrentAdd.sendKeys(" Flat no 101,Dattaniwas Society,Dattanagar,JambhulwadiRoad,Pune-00031");
	 
             
              
 WebElement state=   driver.findElement(By.xpath("//div[@id=\"stateCity-wrapper\"]/div[2]")) ;
 state.click();
            
 WebElement s= driver.findElement(By.xpath("//*[contains(@class,' css-yt9ioa-option')][1]"));
 s.click();
  Thread.sleep(1000);
            
 WebElement city=   driver.findElement(By.xpath("//div[@id='city']//div")) ;
 city.click();
 WebElement c= driver.findElement(By.xpath("//*[contains(@class,' css-yt9ioa-option')][1]"));
 c.click();
 
             WebElement submitbutton=driver.findElement(By.xpath("//button[@id='submit']")) ;
             submitbutton.click();
              
                
      
}
}






    	
    	
    	
	



