package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass {
	
	String expecteddata = "Gift Cards";
	@Test
	public void toCheckApparelandShoes() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Gift Cards page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate Electronics page",true);
		}
		Reporter.log("Testcase 007 executed successfully",true);
	}

}
