package practiceautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" );");
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/webtables");
	    driver.manage().window().maximize();

	List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
	int rowscount=rows.size();
	System.out.println(" number of rows in table:"+ rowscount);//=======TO GET THE COUNT OF NUMBER OF ROWS PRESENT IN WEBTABLE

	List<WebElement>columns=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div"));
	int columnscount=columns.size();
	System.out.println(" number of columns in table:"+ columnscount);//==TO GET COUNT OF NUMBER OF COLUMNS PRESENT IN WEB TABLE
	
	//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]  
	  //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]

	      for(int i=0;i<=rowscount;i++) 
	                     {
                            System.out.println("Elements of rowsrows:"+ rows.get(i).getText());
             
                             }
	
	
	///================TO GET ELEMENTS PRESENT IN ALL ROWS IN WEBTABLE======================
	
	
//		           for(int j=0;j<=columnscount;j++) 
//	                        {
//			                    System.out.println("Elements of columns:"+ columns.get(j).getText());	
//		                         }
	
	
	//=====================TO GET ALL HEADERS OF THE WEBTABLE================================
	
	         List<WebElement> allheadres=driver.findElements(By.xpath("//div[@class='rt-tr']"));
	
		      int headers=allheadres.size();
		
		                for(WebElement h:allheadres)
		                {
			           System.out.println(h.getText());
	                     }
		
		
	           driver.close();
	
	}
	
	}

