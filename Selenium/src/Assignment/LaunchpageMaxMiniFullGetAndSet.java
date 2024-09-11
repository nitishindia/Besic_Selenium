package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchpageMaxMiniFullGetAndSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.tripadvisor.in/Restaurant_Review-g297628-d7925626-Reviews-Olive_Garden-Bengaluru_Bangalore_District_Karnataka.html");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		System.out.println(pos.getX());
		System.out.println(pos.getY());
		
		
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 100));
	}

}
