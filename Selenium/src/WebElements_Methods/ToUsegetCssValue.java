package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetCssValue {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		WebElement tryfree = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryfree.getCssValue("font-size"));
		System.out.println(tryfree.getCssValue("color"));
		System.out.println(tryfree.getCssValue("background-color"));
		System.out.println(tryfree.getCssValue("border-radius"));
	}
}
