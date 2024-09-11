package Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShopperStack {
	
	@Test (groups="Regrasion")
	public void Shopper() {
		WebDriver driver = new ChromeDriver();
			driver.get("https://shoppersstack.com/");
			Reporter.log("ShopperStack page opened",true);
		
	}

}
