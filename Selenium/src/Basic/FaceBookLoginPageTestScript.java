package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginPageTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Expected Data
		String expectedloginPageTitle = "Facebookn - log in or sing up";
		String expectedUsername = "Kiran@gmail.com";
		String expectedPassword = "Kiran@123";
		
		//step 1 :- Open the browser
		WebDriver driver = new ChromeDriver(); // cross browser testing
		System.out.println("Browser got launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//step 2 :- Enter vail url
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedloginPageTitle)) {
			System.out.println("Successfully navigate to facebook loginpage");
		}
		else {
			System.out.println("Failed to navigate to facebook loginpage");
			
		}
		
		// Step 3 :- Enter the username
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUsername = usernameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUsername))
		{
			System.out.println("UsernameTextfield successfully accepted data");
			
		}
		else {
			System.out.println("UsernameTextfield failed to accept the data");
		}
		
		// Step 4 :- Enter the password
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");
		if(actualPassword.equals(expectedPassword))
		{
			System.out.println("passwordTextfield successfully accepted data");
		}
		else
		{
			System.out.println("passwordTextfield faild successfully accepted data");
		}
		
		// Step 5 :- To click on loginButton
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		// Step 6 :- To close browser
		System.out.println("Browser got close successfully");
		driver.close();	
		
	}

}
