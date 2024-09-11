package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {
	
	@Test
	public void honda() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hondacarindia.com/");
		Reporter.log("Honda page seccessfull loaded",true);
		driver.quit();
	}

}
