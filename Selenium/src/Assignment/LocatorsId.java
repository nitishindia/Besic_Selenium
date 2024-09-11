package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Nitish");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("nks@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("Company")).sendKeys("Selenium");
		
	}

}
