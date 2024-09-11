package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	//span[text()='Redmi']/../../..//input[@type='checkbox']
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//span[text()='Redmi']/../../..//input[@type='checkbox']")).click();
		//List<WebElement> count = driver.findElements(By.tagName("img"));
	//	System.out.println(count.size());
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		String errortext = driver.findElement(By.xpath("//div[contains(text(),'  Enter')]")).getText();
		System.out.println(errortext);
		driver.findElement(By.id("createAccountSubmit")).click();
		String error = driver.findElement(By.xpath("//div[contains(text(),'verify')]")).getText();
		System.out.println(error);
		
		
		
		
	}

}
