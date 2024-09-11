package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases extends BaseClass{
	
//	public static void main(String[] args) {
		
	
	@Test
	public void testcase() {
//	WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
	
	WelcomePage wp = new WelcomePage(driver);
	wp.getLogin().click();
	
	LogInPage lp = new LogInPage(driver);
	lp.getEmail().sendKeys("98765");
	lp.getpass().sendKeys("12345");
	lp.getloginbutton().click();
	
	}

}
