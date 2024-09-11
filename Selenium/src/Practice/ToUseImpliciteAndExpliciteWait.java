package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseImpliciteAndExpliciteWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 //		Thread.sleep(3000);
		driver.get("https://shoppersstack.com/user-signin");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Email")));
		
		
		driver.findElement(By.id("Email")).sendKeys("nitish@123");
		//Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("12345");
		
		

	}

}
