package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchSkyScanner_BookFightAfter8Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.skyscanner.co.in/?locale=en-GB");
//		WebElement destination = driver.findElement(By.id("destinationInput-input"));
//		destination.sendKeys("Kolkata");
		driver.findElement(By.xpath("//span[text()='Depart']")).click();
		for(;;) {
			try {
		driver.findElement(By.xpath("//h2[@class='BpkText_bpk-text__ZmFmY BpkText_bpk-text--heading-4__MTNhO CustomCalendar_monthName__MmVhY']/../..//button[@aria-label='Thursday, 5 September 2024. Select as departure date']")).click();
			break;
			}
		catch(Exception e) {
			driver.findElement(By.xpath("//button[@aria-label='Next month, October']")).click();
		}
			
			
			
		}
	}

}
