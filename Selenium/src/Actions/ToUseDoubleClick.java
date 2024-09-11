package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement addButton = driver.findElement(By.id("add"));
		
		//To use action class
		Actions action = new Actions(driver);
		// call the method
		action.doubleClick(addButton).perform();
		Thread.sleep(2000);
		action.doubleClick(addButton).perform();
		Thread.sleep(2000);
		action.doubleClick(addButton).perform();
		Thread.sleep(2000);
	
	}

}
