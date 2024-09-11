package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchYamaha {
	
	@Test(groups = "system")
	public void yamaha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("yamaha get successfully launch",true);
		driver.quit();
	}

}
