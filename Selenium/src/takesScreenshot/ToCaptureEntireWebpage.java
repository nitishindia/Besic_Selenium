package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver(); //cross browser casting
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;  //typecasting
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/youTube1.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);
		
		
		
		
	}

}
