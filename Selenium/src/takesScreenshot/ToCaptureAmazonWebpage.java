package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureAmazonWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temprory = ts.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./errorShots/Amazon.jpeg");
		FileHandler.copy(temprory, permanent);
		

	}

}
