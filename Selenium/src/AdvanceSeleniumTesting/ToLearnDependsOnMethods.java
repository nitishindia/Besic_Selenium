package AdvanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMethods {
	
	@Test
	public void createAccount() {
		Reporter.log("Account created successfully",true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Account edited Successfully",true);
	}

//	@Test(dependsOnMethods = "editAccount" )
//	public void deleteAccount() {
//		Reporter.log("Account delete Successfully",true);
//	}
	
	
	@Test(dependsOnMethods = {"editAccount","createAccount"}) 
	public void deleteAccount() {
		Reporter.log("Account delete Successfully",true);
	}

}
