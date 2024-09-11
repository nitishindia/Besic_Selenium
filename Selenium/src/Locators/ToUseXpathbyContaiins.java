package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathbyContaiins {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String errormsg = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getText();
		System.out.println(errormsg);
		String error = driver.findElement(By.xpath("//li[contains(text(),'customer')]")).getText();
		System.out.println(error);
	}

}
