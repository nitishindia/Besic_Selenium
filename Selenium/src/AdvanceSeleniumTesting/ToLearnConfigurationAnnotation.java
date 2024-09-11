package AdvanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnotation {
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite got executed",true);
	}
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("After Suite got executed",true);
	}
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("BeforeTest got executed",true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("AfterTest got executed",true);
	}
	
	@BeforeClass
	public void BeforeClass() {
		Reporter.log("BeforeClass got executed",true);
	}
	
	@AfterClass
	public void AfterClass() {
		Reporter.log("AfterClass got executed",true);
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("BeforeMethod got executed",true);
	}
	
	@AfterMethod
	public void AfterMothod() {
		Reporter.log("AfterMothod got executed",true);
	}
	
	@Test
	public void testcase() {
		Reporter.log("Test case got executed",true);
	}
	

}
