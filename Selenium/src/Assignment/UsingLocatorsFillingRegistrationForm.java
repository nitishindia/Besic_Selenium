package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorsFillingRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Nitish");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sharma");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("nitishs942@gmai.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Kolkata@2india");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Kolkata@2india");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
