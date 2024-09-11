package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKtm {
	
	@Test(groups = "integration")
	public void ktm() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("KTM get successfully launch",true);
		driver.quit();
	}

}
