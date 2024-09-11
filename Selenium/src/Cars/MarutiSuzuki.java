package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MarutiSuzuki {
	
	@Test
	public void marutiSuzuki() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marutisuzuki.com/");
		Reporter.log("MarutiSuZuki page seccessfully loaded",true);
		driver.quit();
	}

}
