package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass {
	
	String expecteddata = "Jewelry";
	@Test
	public void toCheckApparelandShoes() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Jewelry page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate Electronics page",true);
		}
		Reporter.log("Testcase 006 executed successfully",true);
	}

}
