package WebDriver_methds;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// to (String url)
		
		// driver.navigate().to("https://www.flipkart.com/");
		
		// to (URL url)
		
		//driver.navigate().to(new URL("https://www.flipkart.com/"));
		//driver.navigate().to(new URL("https://www.flipkart.com/"));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
		

	}

}
