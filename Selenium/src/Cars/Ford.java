package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford {
	
	@Test
	public void ford() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/ford-cars/");
		Reporter.log("Ford page seccessfully loaded",true);
		driver.quit();
	}

}
