package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementReferenceException {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement usernameTextfield = driver.findElement(By.id("email"));
//		//Referesh
//		
//		driver.navigate().refresh();
//		
//		usernameTextfield.sendKeys("Nitish@gmail.com");
		
		
		driver.get("https://demowebshop.tricentis.com/books?orderby=5&pagesize=12");		
		WebElement sortby = driver.findElement(By.id("products-orderby"));
	//	driver.navigate().refresh();
		Select s = new Select(sortby);
		s.selectByIndex(2);
		WebElement display = driver.findElement(By.id("products-pagesize"));
		driver.navigate().refresh();
		Select s1 = new Select(display);
		s1.selectByVisibleText("8");
		s1.selectByVisibleText("8");
	}

}
