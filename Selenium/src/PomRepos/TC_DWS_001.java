package PomRepos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LogInPage lp = new LogInPage(driver);
		lp.getEmailTextField().sendKeys("Selenium10to12@gmail.com");
		lp.getPasswordTextField().sendKeys("Selenium@123");
		lp.getLoginButton().click();

	}

}
