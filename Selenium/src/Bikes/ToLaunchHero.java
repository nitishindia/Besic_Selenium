package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHero {
	@Test(groups = "smoke")
	public void hero() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
		Reporter.log("HERO get successfully launch",true);
		driver.quit();
	}

}
