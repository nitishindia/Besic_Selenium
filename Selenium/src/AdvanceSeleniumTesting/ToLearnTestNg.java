package AdvanceSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg { // TestNG Class

	@Test(priority = 1)
	public void cricbuzz() { // Testcase1
		WebDriver driver = new ChromeDriver();	// TestStep
		driver.get("https://www.cricbuzz.com/");	// TestStep
		Reporter.log("Cricbuzz got executed successfully", true); // TestStep
		driver.quit();	// TestStep
	}

	@Test // defauit-0
	public void baskinRobbins() { // Testcase2
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed successfully", true); 
		driver.quit();
	}

	@Test(priority = 2)
	public void amazon() { // Testcase3
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed successfully", true); 
		driver.quit();
	}

}
