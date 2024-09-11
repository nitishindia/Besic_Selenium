package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
//		WebElement dropdown = driver.findElement(By.id("select1"));
//		Select select = new Select(dropdown);
//		select.selectByIndex(3);
//		
//		WebElement dropdown1 = driver.findElement(By.id("select2"));
//		Select selct = new Select(dropdown1);
//		selct.selectByVisibleText("Female");
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multi = driver.findElement(By.id("cars"));
		Select dropdown = new Select(multi);
		System.out.println(dropdown.isMultiple());
		dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		dropdown.selectByIndex(2);
		dropdown.deselectByIndex(0);
		//dropdown.deselectAll();
		System.out.println(dropdown.getFirstSelectedOption());

	}

}
