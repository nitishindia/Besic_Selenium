package Practice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfGoogleLogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		File temp = driver.findElement(By.xpath("//img[@src='/logos/doodles/2024/new-years-day-2024-6753651837110174-law.gif']")).getScreenshotAs(OutputType.FILE);
		File perm = new File("./ScreenShot/Google.png");
		org.openqa.selenium.io.FileHandler.copy(temp, perm);
	
		
	}

}
