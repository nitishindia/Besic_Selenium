package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{
	
	String expecteddata="Computers";
	@Test
	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualdata = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		if(actualdata.equals(expecteddata)) {
			Reporter.log("Navigate to Computer page successfully",true);
		}
		else {
			Reporter.log("Failed to navigate computer page",true);
		}
		Reporter.log("TestCase 002 executed Successfully",true);
	}

}
