package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // cross browser testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult"); // switch to frame
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Prompt handle popup
		Alert PromptPopUp = driver.switchTo().alert();
		PromptPopUp.sendKeys("chetan");
		PromptPopUp.accept(); // ok button

	}

}
