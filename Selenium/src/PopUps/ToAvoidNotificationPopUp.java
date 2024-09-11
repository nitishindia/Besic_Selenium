  package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser setting
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--notifications");
	//	settings.addArguments("--disable-notifications");
	//	settings.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(settings); // cross browser testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.yatra.com/");	

	}

}
