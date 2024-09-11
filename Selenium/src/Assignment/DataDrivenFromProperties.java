package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws IOException {
		
		
		// create obj of fileinputstream
		FileInputStream fis = new FileInputStream("./testingData/data.properties");
		
		// create an obj of respective file type
		Properties prop = new Properties();
		
		// call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String name = prop.getProperty("Firstname");
		String last = prop.getProperty("Lastname");
		String email = prop.getProperty("Email");
		String password = prop.getProperty("Password");
		String confmPasssword = prop.getProperty("Confirmpassword");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(name);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confmPasssword);
			

	}

}
