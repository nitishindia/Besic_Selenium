package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg {
	
	@Test(priority = 3,invocationCount = 3,threadPoolSize = 3)
	public void amazon() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
		Reporter.log("Amazon successfully open",true);
	}
		
		@Test(priority = 1,invocationCount = 1)
		public void insta() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Reporter.log("Instagram seccessfully open",true);
		}
		
		@Test(priority = 2,invocationCount = 2,threadPoolSize = 2,enabled = false)
		public void flipKart() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Reporter.log("Flipkart sucessfully open",true);
		}
	

}
