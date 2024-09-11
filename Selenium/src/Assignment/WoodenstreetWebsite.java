package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodenstreetWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		  List<WebElement> element = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		//Actions act = new Actions(driver);
		//act.moveToElement(Types).perform();
		//Thread.sleep(3000);
		  for(WebElement ele : element ) {
			  System.out.println(ele.getText());
			  
		  }
		
	}

}
