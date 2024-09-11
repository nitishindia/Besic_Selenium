package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/");
//		WebElement electr = driver.findElement(By.partialLinkText("Electronics"));
//		Actions action = new Actions(driver);
//		action.contextClick(electr).perform();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photomanage = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photomanage);
		WebElement galleryBox = driver.findElement(By.id("gallery"));
		WebElement trashbox = driver.findElement(By.id("trash"));
		
		WebElement image1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trashbox).perform();
		Thread.sleep(2000);
	//	action.dragAndDropBy(image2, 770, 0).perform();
		action.clickAndHold(image2).moveToElement(trashbox).release().perform();
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("123456789");
		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Thread.sleep(2000);
		//action.moveByOffset(1183,308).clickAndHold().perform();
		action.clickAndHold(eye).perform();
		action.contextClick(eye).perform();
		
		
		
	}

}
