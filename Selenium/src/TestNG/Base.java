package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.browser.Browser;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {
	static WebDriver driver; 
	
		
		
		@BeforeSuite
		public static void connectToServer() {
			Reporter.log("Connected to Server",true);
		}
		
		@BeforeTest
		public static void connectDB() {
			Reporter.log("Connected to Data Base",true);
		}
		
		@Parameters("Browser")
		@BeforeClass
		public static void openBrowser(String Browser) {
			
			if(Browser.contains("chrome")) {
				driver = new ChromeDriver();
			}
			else if(Browser.contains("IE")){
				driver = new InternetExplorerDriver(); 
			}
			
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("Open Browser");
		}
		
		@BeforeMethod
		public static void login() {
			Reporter.log("Login to App");
		}
		
		@AfterMethod
		public static void logout() {
			Reporter.log("Logout to the App");
		}
		
		@AfterClass
		public static void closeBrowser() {
			Reporter.log("Close Browser");
		}
		
		@AfterTest
		public static void disconnectDB() {
			Reporter.log("DisConnect to DB");
		}
		
		@AfterSuite
		public static void disconnectToServer() {
			Reporter.log("Disconnect to server");
		}
		
	}


