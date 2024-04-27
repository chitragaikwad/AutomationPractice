package practiceautomation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerHandle {
	static int currentDay = 0, currentMonth = 0, currentYear = 0;
	static int targetDay = 0, targetMonth = 0, targetYear = 0;
	static int jumpToMonth = 0;
	static boolean increment = true;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver",
				"\"webdriver.chrome.driver\",\"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe\" )");
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver= new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().window().maximize();

		String dateToset = "26/10/2024";
		gatecurrentMonthDayAndYear();
		System.out.println(currentDay + " " + currentMonth + " " + currentYear);
		gateTargetMonthDayAndYear(dateToset);
		System.out.println(targetDay + " " + targetMonth + " " + targetYear);
		calculateHowMuchMonthTojump();
		System.out.println(jumpToMonth);

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		for (int i = 0; i < jumpToMonth; i++) {
			if (increment) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}

			Thread.sleep(1000);
		}
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
	}

	static public void calculateHowMuchMonthTojump() {
		if ((targetMonth - currentMonth) > 0) {
			jumpToMonth = targetMonth - currentMonth;
		} else {
			jumpToMonth = currentMonth - targetMonth;
			increment = false;
		}

	}

	static public void gateTargetMonthDayAndYear(String dateToset) {
		int firstIndex = dateToset.indexOf("/");
		int lastIndex = dateToset.lastIndexOf("/");
		String Day = dateToset.substring(0, firstIndex);
		String Month = dateToset.substring(firstIndex + 1, lastIndex);
		String Year = dateToset.substring(lastIndex + 1, dateToset.length());

		targetDay = Integer.parseInt(Day);
		targetMonth = Integer.parseInt(Month);
		targetYear = Integer.parseInt(Year);
	}

	static public void gatecurrentMonthDayAndYear() {
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH) + 1;
		currentYear = cal.get(Calendar.YEAR);

	}
}
