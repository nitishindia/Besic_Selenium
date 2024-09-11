package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.dream11.com/");
//		//driver.switchTo().frame(0); // by index
//		driver.switchTo().frame("send-sms-iframe"); // by id/Name
//		driver.findElement(By.id("regEmail")).sendKeys("987654321");
//		
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("hamburger")).click();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.close();

	}

}
