package Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UseAssertion {
	
	 public String Expected = "https://demowebshop.tricentis.com/";
	
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		//Assert.assertEquals(Expected, url);
		SoftAssert s = new SoftAssert();
		s.assertEquals(Expected, url);
		s.assertAll();
		Reporter.log("both url same",true);
	}
	

}
