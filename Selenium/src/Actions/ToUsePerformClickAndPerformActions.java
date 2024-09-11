package Actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUsePerformClickAndPerformActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("987654321");
	WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	// To use action class
	
	Actions action = new Actions(driver);
	
	// call the method
	action.clickAndHold(eyeIcon).perform();
	Thread.sleep(2000);
	action.release(eyeIcon).perform();
	
	
	
	
	
	
	
	}

}
