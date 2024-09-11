package AdvanceSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnThreadpoolSize {
	
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void cricbuzz() { // Testcase1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed successfully", true); // TestStep
		driver.quit();
	}

	@Test (invocationCount = 0,threadPoolSize = 2)
	public void baskinRobbins() { // Testcase2
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed successfully", true); // TestStep
		driver.quit();
	}

	@Test(invocationCount = 1,threadPoolSize = 2)
	public void amazon() { // Testcase3
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed successfully", true); // TestStep
		driver.quit();
	}

}


