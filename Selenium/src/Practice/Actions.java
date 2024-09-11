package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement fullframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(fullframe);
		
		WebElement trashArea = driver.findElement(By.id("trash"));
		WebElement galleryArea = driver.findElement(By.id("gallery"));
		
//		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
//		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	
		
		Actions action = new Actions(driver);
	
	
		
		

	}

}
