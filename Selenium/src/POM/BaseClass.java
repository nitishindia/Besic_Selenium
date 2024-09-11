package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void Server() {
		Reporter.log("Connected to server",true);
	}
	
	@BeforeTest
	public void DbServer() {
		Reporter.log("Connected to DataBase",true);
	}
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Browser open successfully",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login successfull",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("LogOut Successfull",true);
	}
		
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Browser close successfully",true);
	}
	
	@AfterTest
	public void disConnectDbServer() {
		Reporter.log("disonnected to DataBase",true);
	}
	
	@AfterSuite
	public void disConnectServer() {
		Reporter.log("DisConnected to server",true);
	}

}

