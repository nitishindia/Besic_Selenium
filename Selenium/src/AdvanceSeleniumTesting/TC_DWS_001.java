package AdvanceSeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
	
	String expecteddata="Books";
	@Test
	public void toCheckBooksPage() throws InterruptedException {
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		 String actualdata = driver.findElement(By.xpath("//h1[text()='Books']")).getText(); 
//		if(actualdata.equals(expecteddata)) {
//			Reporter.log("Navigated to Books page successfully",true);
//		}
//		else
//		{
//			Reporter.log("Fail to Navigated to Books page",true);
//		}
		 
		 Assert.assertEquals(actualdata, expecteddata, "Failed to navigate to book page");
		 
		Reporter.log("TestCase 001 Executed Successfully",true);
	}

}
