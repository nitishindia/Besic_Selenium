package Practice;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// String code = driver.getPageSource();
		// System.out.println(code);
		// driver.close();
		// driver.quit();
		// driver.manage().window().minimize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		// driver.manage().window().setSize(new Dimension(500, 500));
		Point possition = driver.manage().window().getPosition();
		System.out.println(possition);
		// driver.manage().window().setPosition(new Point(100, 100));
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);
		driver.navigate().to("https://www.flipkart.com/");

		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.refresh();
		nav.forward();
		driver.navigate().to("https://www.youtube.com/");
		
		
		
	}

}
