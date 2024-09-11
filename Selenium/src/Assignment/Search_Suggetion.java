package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_Suggetion {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		WebElement drop = driver.findElement(By.id("APjFqb"));
		drop.sendKeys("Nitish");
		//driver.findElement(By.xpath("(//ul[@jsname='bw4e9b']//li)[2]")).click();    // first way
		 List<WebElement> sugge = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b']//li)"));
		int count = sugge.size();
		System.out.println(count);
		//sugge.get(1).click();    // second way
		sugge.get(count=1).click();  // third way
	}

}
