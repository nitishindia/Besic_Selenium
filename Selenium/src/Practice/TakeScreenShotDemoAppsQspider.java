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

public class TakeScreenShotDemoAppsQspider {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
//		Thread.sleep(2000);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File tem = ts.getScreenshotAs(OutputType.FILE);
//		File per = new File("./ScreenShot/DAQ.Png");
//		FileHandler.copy(tem, per);
		
		
		File temp = driver.findElement(By.xpath("//img[@src='/assets/qspiderlogo-alLgFauW.png']")).getScreenshotAs(OutputType.FILE);
		File perm = new File("./ScreenShot/Qspider.png");
		FileHandler.copy(temp, perm);
		
	}

}
