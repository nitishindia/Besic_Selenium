package WebElements_Methods;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumSelectCopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement User = driver.findElement(By.name("username"));
		User.sendKeys("987654321",Keys.CONTROL+"a");
		User.sendKeys(Keys.CONTROL+"c");
		WebElement user1 = driver.findElement(By.name("password"));
		user1.sendKeys(Keys.CONTROL+"v");
		
	}

}
