package AdvanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseClass {

	public WebDriver driver;
	String expectedWelcomePageTitle = "Demo Web Shop";

	@org.testng.annotations.Parameters("browserName")
	@BeforeClass // Launch Browser
	public void toLaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		Reporter.log("Browser got launch successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod // Login
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualWelcomePageTitl = driver.getTitle();

		if (actualWelcomePageTitl.equals(expectedWelcomePageTitle)) {
			Reporter.log("Navigate to demowebshop successfully", true);
		} else {
			Reporter.log("Failed to Navigated to demoWebshop", true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Selenium10to12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Navigate to Homepage Successfully", true);
	}

	@AfterMethod // LogOut
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Navigated to homepage sucessfully");

	}

	@AfterClass // Close
	public void toCloseBrowser() {
		Reporter.log("Browser got close successfully");
		driver.quit();

	}

}
