package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDependentIndependentXpath {

	public static void main(String[] args) throws InterruptedException {
		// //span[text()='Get It in 2 Days']/../../..//input[@type='checkbox']
		// //span[text()='Get It by Tomorrow']/../../..//input[@type='checkbox']

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Samsung']/../../..//input[@type='checkbox']")).click();
	}

}
