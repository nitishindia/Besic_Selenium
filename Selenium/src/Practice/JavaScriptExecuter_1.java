package Practice;


import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecuter_1 {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		WebElement Submit=driver.findElement(By.name("websubmit"));
		System.out.println(Submit.isEnabled());
		
		
		WebElement custom=driver.findElement(By.xpath("//input[@name='custom_gender']"));
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='java';", custom);
		
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
	}

}
