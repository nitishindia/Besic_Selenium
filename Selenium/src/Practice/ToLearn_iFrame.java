package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn_iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		WebElement iframe = driver.findElement(By.xpath("//div[@class='frame-root']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("username")).sendKeys("nitish@123");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.close();
		
//		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
//		WebElement nofield = driver.findElement(By.id("regEmail"));
//		driver.switchTo().frame(nofield);
//		driver.findElement(By.id("regEmail")).sendKeys("987654321");
		//driver.close();

	}

}
