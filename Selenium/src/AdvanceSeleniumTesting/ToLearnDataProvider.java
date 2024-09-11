package AdvanceSeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	@DataProvider(name="cred")
	public String [][] toSendData(){
		
		String[][] sarr = {
				{"Bhabani@gmail.com","Bhabani@123"},
				{"Karan@gmail.com","Karan@123"},
				{"Kiran@gmail.com","Kiran@123"}
				};
		return sarr;
	}
	
	@Test(dataProvider="cred")
	
	public void toLogin(String email,String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
				
}			
		

	


