package Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodStreet_profileMouseOvr_MyProfile_ClickLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement profile = driver.findElement(By.linkText("Profile"));
		Actions action = new Actions(driver);
		action.moveToElement(profile).perform();
		driver.findElement(By.id("login_popup_btn")).click();
		driver.findElement(By.id("login_submit_btn")).click();
		WebElement error = driver.findElement(By.xpath("//p[contains(text(),'valid email')]"));
		System.out.println(error.getText());
		//WebElement value = driver.findElement(By.xpath("//p[contains(text(),'valid email')]"));
		System.out.println(error.getCssValue("color"));
		driver.quit();
		

	}

}
