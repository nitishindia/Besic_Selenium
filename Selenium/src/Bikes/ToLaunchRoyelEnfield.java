package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyelEnfield {
	
	@Test(groups = "integration")
	public void Royel() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://store.royalenfield.com/");
		Reporter.log("ROYEL ENFIELD get successfully launch",true);
		driver.quit();
	}

}
