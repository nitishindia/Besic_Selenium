package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleparticularchildwindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String parantWd = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).click();
		Set<String> allWindowID = driver.getWindowHandles();
		
		allWindowID.remove(parantWd);
		
		for(String controlChild : allWindowID) {
			driver.switchTo().window(controlChild);
		}
		
		driver.findElement(By.linkText("Visit the Apple Store")).click();
	}

}
