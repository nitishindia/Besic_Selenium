package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseWoodenStreetAddtoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sofas")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sofa Sets")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Wooden Sofa Sets']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-cart-buy-now")).click();
	}

}
