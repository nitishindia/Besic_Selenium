package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); // cross browser testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.makemytrip.com/");
//		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
//		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
//		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='13']")).click();
				break;
			}
				catch(Exception e) {
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}	
		
	}

}
