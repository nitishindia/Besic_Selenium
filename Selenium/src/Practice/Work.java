package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://identity.worldatwork.org/Auth/Login");
		driver.findElement(By.id("username")).sendKeys("Nitish");
		driver.findElement(By.id("password")).sendKeys("Nitish@111");
//		driver.findElement(By.id("rememberMe")).click();
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
