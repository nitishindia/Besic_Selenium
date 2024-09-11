package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass {
	
	
	String expecteddata = "Electronics";
	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Electronics page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate Electronics page",true);
		}
		Reporter.log("Testcase 003 executed successfully",true);
	}

}
