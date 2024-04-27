package testNgPractice;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





@Listeners({ListenersPractice.class})
public class SimpleListener {

	

	@Test
	public void Animal() {
		System.out.println("animal so kind");
	}
	
	
	
	
	@Test(timeOut=1000)
	public void car() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("car is lixurious");//failed
	}
	
		@Test
	public void music() {
		
		System.out.println("music makes human happy");// make failed
		Assert.assertTrue(false);
	}
	
	
	
	
	@Test(dependsOnMethods="music")
	public void food() {
		System.out.println("food makes mood");//skipped
	}
	
	
	
	@Test
	public void home() {
		System.out.println("home is sweet home");
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
