package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass {

	String expecteddata = "Apparel & Shoes";
	@Test
	public void toCheckApparelandShoes() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Apparel & Shoes page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate Electronics page",true);
		}
		Reporter.log("Testcase 004 executed successfully",true);
	}
}
