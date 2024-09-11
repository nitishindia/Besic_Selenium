package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();
		

	}

}
