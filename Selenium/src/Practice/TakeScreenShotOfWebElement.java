package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		File ts = driver.findElement(By.xpath("//img[@alt='Home Furniture Online']")).getScreenshotAs(OutputType.FILE);
		File Permanent = new File("./ScreenShot/woodenstreet.png");
		FileHandler.copy(ts, Permanent);
		
	}

}
