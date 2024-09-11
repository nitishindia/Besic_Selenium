package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseWoodenStreetAddToCartLiving {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Living")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Coffee and Center Tables']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Lynet Sheesham Wood Coffee Table with Center Storage (Honey Finish)")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		
	}

}
