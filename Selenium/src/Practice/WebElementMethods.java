package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://demo.vtiger.com/vtigercrm/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("9876543210");
//		//String attr = driver.findElement(By.linkText("Sign in")).getAttribute("type");
//		//System.out.println(attr);
//		String tag = driver.findElement(By.linkText("Sign in")).getTagName();
//		System.out.println(tag);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//String tagname = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getTagName();
		//System.out.println(tagname);
		String searchbox = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("type");
		System.out.println(searchbox);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		System.out.println(search.getCssValue("cursor"));
		System.out.println(search.getCssValue("color"));
		
	}

}
