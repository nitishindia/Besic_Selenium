package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotOfDemoappSkillrary {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File src = new File("./ScreenShot/DASR.png");
//		FileHandler.copy(temp, src);
		
		File temp = driver.findElement(By.xpath("(//div[@class='box-body'])[3]")).getScreenshotAs(OutputType.FILE);
		File perm = new File("./ScreenShot/rary1.png");
		FileHandler.copy(temp, perm);
		
		
		
	}

}
