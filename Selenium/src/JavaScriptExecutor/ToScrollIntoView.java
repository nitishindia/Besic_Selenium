package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		WebElement indianflag = driver.findElement(By.xpath("//td[text()='India']"));  
		js.executeScript("arguments[0].scrollIntoView(true)",indianflag);

	}
}
