package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_PopUPs {

	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
	//	c.addArguments("--incognito");
	//	c.addArguments("--notifications");
		c.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.get("https://www.google.com/");
		driver.get("https://www.yatra.com/");
		

	}

}
