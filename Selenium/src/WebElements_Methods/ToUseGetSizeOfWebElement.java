package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSizeOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		Dimension size = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		System.out.println(size);
		System.out.println(size.height);
		System.out.println(size.width);

	}

}
