package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		Point Location = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		System.out.println(Location);
		System.out.println(Location.x);
		System.out.println(Location.y);
	}

}
