package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
		
	  //	Properties file
		
		FileInputStream fis = new FileInputStream("./testData/practice.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String page = prop.getProperty("url");
		String name = prop.getProperty("username");
		String pass = prop.getProperty("password");
	
		WebDriver driver = new ChromeDriver();
		driver.get(page);
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);

		
		
		// Excel file
		
		//FileInputStream fis = new FileInputStream(null)
		
		
	}

}
