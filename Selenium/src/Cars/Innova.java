package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innova {
	
	@Test
	public void innova() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/toyota-cars/innova-crysta/");
		Reporter.log("Innova Page get successfully loaded",true);
		driver.quit();
	}
	
	
}
