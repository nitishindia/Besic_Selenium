package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
		public LogInPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		@FindBy(id = "Email")
		private WebElement Emailfield;
		
		@FindBy (id = "Password")
		private WebElement passwordfield;
		
		@FindBy (xpath = "//input[@value='Log in']")
		private WebElement loginbutton;
		
		
		public WebElement getEmail() {
			return Emailfield;
		}
		
		public WebElement getpass() {
			return passwordfield;
		}
		
		public WebElement getloginbutton() {
			return loginbutton;
		}

}
