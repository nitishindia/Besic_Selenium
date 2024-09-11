package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseBoolean {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before entering the data");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		System.out.println("==========================================");
		System.out.println("After entering the data");
		driver.findElement(By.name("username")).sendKeys("987654321");
		driver.findElement(By.name("password")).sendKeys("123456");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
	}

}
