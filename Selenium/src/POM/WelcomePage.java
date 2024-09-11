package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

		public WelcomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
		
		@FindBy (linkText = "Register")
		private WebElement registerlink;
		
		@FindBy (linkText = "Log in")
		private WebElement loglink;
		
		public WebElement getReg() {
			return registerlink;
		}
		
		public WebElement getLogin() {
			return loglink; 
		}

}
