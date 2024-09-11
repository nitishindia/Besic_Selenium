package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShortFlipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temporary = ts.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./errorShots/Flipkart.jpeg");
		FileHandler.copy(temporary, permanent);
		

	}

}
