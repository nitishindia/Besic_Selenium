package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photomanage = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		// switch to frame
		driver.switchTo().frame(photomanage);
		
		//image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		WebElement trashbox = driver.findElement(By.id("trash")); //trash path
		WebElement galleryPath = driver.findElement(By.id("gallery")); // gallery path
		
		//To use action class
		Actions action = new Actions(driver);
		
		//To drag image to trashbox
		action.dragAndDrop(image1, trashbox).perform();
		Thread.sleep(2000);
		//action.dragAndDrop(image2, trashbox).perform();
		//Thread.sleep(2000);
		action.dragAndDropBy(image2, 770, 0).perform();
		Thread.sleep(2000);
		//action.dragAndDrop(image3, trashbox).perform();
		//Thread.sleep(2000);
		action.clickAndHold(image3).moveToElement(trashbox, 770, 230).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashbox).perform();
		Thread.sleep(3000);
		
		action.dragAndDrop(image1, galleryPath).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, galleryPath).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, galleryPath).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, galleryPath).perform();
		
		
		
		
	}

}
