package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetAttribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		String find = driver.findElement(By.linkText("Try Free")).getAttribute("class");
		System.out.println(find);
		String findAV = driver.findElement(By.linkText("Try Free")).getAttribute("href");
		System.out.println(findAV);
	}

}
