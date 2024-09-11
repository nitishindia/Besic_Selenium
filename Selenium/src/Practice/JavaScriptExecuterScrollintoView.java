package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterScrollintoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.get("https://www.amazon.in/");
//		WebElement scroll = driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
//		js.executeScript("arguments[0],scrollIntoView(true)",scroll);
		
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		WebElement scroll = driver.findElement(By.xpath("//td[text()='Brazil']"));
	//	js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		js.executeScript("arguments[0].scrollIntoView(false)",scroll);
		
		
		
	}

}
