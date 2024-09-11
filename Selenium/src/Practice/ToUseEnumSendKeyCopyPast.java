package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumSendKeyCopyPast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	//	driver.findElement(By.id("email")).sendKeys("123456789",Keys.ENTER);
		WebElement send = driver.findElement(By.id("email"));
		send.sendKeys("987654321",Keys.CONTROL+"A");
		send.sendKeys(Keys.CONTROL+"c");
		WebElement sendpass = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		sendpass.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

	}

}
