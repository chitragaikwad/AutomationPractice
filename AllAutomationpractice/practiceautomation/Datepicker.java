package practiceautomation;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;





public class Datepicker {
static int targetDay=0,targetMonth=0,targetYear=0;
static int currentDay=0,currentMonth=0,currentYear=0;
static int jumpToMonth=0;
static boolean increament =true;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		
	    String datetoset="26/06/2023";
	    getCurrentDayMonthAndYear();
	    System.out.println(currentDay+" "+currentMonth+" "+currentYear);
	    getTargetDayMonthAndYear( datetoset);
	    System.out.println(targetDay+" "+targetMonth+" "+targetYear);
	    calculateHowManyMonthToJump();
	    System.out.println(jumpToMonth);
	    
	    
	    System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://jqueryui.com/datepicker/");
	    
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
    
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
	for(int i =0;i<jumpToMonth;i++)
	{
		if(increament) {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))	.click();
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"))	.click();
		
		}
		Thread.sleep(1000);
	}
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
		
		
	}
	
	
	
	public static void  calculateHowManyMonthToJump() 
	{
		if((targetMonth-currentMonth)>0) {
			jumpToMonth=targetMonth-currentMonth;
		}
		
		else{
			jumpToMonth=currentMonth-targetMonth;
			increament=false;
		}
	}
	
	public static void  getTargetDayMonthAndYear(String datetoset ) {
		{
		int firstIndex= datetoset.indexOf("/");
		int lastIndex= datetoset.lastIndexOf("/");
		String day= datetoset. substring(0,firstIndex);
		String month=datetoset.substring(firstIndex+1,lastIndex);
		String year= datetoset.substring(lastIndex+1,datetoset.length());
		targetDay= Integer.parseInt(day);
		targetMonth=Integer.parseInt(month);
		targetYear=Integer.parseInt(year);
	}	
		
	}
	    
		public static void  getCurrentDayMonthAndYear() 
		{
	    	Calendar cal = Calendar. getInstance();
	    	currentDay=cal.get(Calendar.DAY_OF_MONTH);
	    	currentMonth= cal.get(Calendar.MONTH)+1;
	    	currentYear=cal.get(Calendar.YEAR) ;
	    
	    }
	   
}

