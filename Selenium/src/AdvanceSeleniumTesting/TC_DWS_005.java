package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{
	
	String expecteddata = "Digital downloads";
	@Test
	public void toCheckApparelandShoes() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Digital downloads page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate Electronics page",true);
		}
		Reporter.log("Testcase 005 executed successfully",true);
	}
	

}
