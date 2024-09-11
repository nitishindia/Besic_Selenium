package Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WoodenStreet {
	
	@Test (groups="Integartion")
	public void wooden() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		Reporter.log("WoodenSteet page opened",true);
	}

}
