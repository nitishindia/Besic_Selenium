package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		
		
		// Step -1 Create obj of Fileinputstream
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		// step- 2 Create an obj of properties file
		Properties prop = new Properties();
		
		// step - 3 call method
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation script Start
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	
	}

}
