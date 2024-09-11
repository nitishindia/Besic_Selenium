package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Use_SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Samsung']/../../..//i[@class='a-icon a-icon-checkbox']")).click();
		
//		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Pink']")).click();
//		Thread.sleep(2000);
//		Set<String> allsessionId = driver.getWindowHandles();
//		System.out.println(allsessionId);
//		allsessionId.remove(parentId);
//
//		for (String windowId : allsessionId) {
//			System.out.println(windowId);
//			driver.switchTo().window(windowId);
//		}
//
//		// driver.findElement(By.id("bylineInfo")).click();
//		String text = driver.findElement(By.id("productTitle")).getText();
//		System.out.println(text);
	}

}
