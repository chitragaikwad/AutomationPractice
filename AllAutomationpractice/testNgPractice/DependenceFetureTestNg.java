package testNgPractice;



import static org.testng.Assert.fail;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class DependenceFetureTestNg {

	WebDriver driver;
	
	//dependsOnMethods 
	//alwaysRun=true
	
	@Test(dependsOnMethods={"regPage","search"})
	public void loginpage() {
		System.out.println(" switched to login  page");//skipped because these methods are depends on regPage method which already fail\\  
		}
	
	@Test(dependsOnMethods={"regPage"},alwaysRun=true)//===forcefully run
	public void homePage() {
		System.out.println("home page is displayed");//skipped because these methods are depends on regPage method which already fail\\  
		}
	
	@Test
	public void regPage() {
		System.out.println("Account is created");
		fail();////////////////////fail test case
	}
	
	@Test
	public void search() {
		System.out.println("serach the items");
	}
	@Test
	public void Enter() {
		System.out.println("enter the items");
	}
	
	
	
	
	
	
	
}
