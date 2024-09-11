package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement pathOfUser = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		pathOfUser.clear();
		Thread.sleep(3000);
		pathOfUser.sendKeys("Nitish@123");
		Thread.sleep(3000);
	    WebElement PathofPassword = driver.findElement(By.id("password"));
	    PathofPassword.clear();
	    Thread.sleep(3000);
	    PathofPassword.sendKeys("123456789");

	}

}
