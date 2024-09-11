package Handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//switch to using int index
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		//switch to by using id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		
		//Switch to by using webelement
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
//		driver.switchTo().frame(iframe);
//		
//		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		//To switch back to using parentFrame
		//driver.switchTo().parentFrame();
		
		//To switch back by defaultcontent
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("About Us")).click();

	}

}
