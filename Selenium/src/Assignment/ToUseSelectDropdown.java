package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement SortbyDropdown = driver.findElement(By.id("products-orderby"));
		
		Select sortby = new Select(SortbyDropdown);
		
		//sortby.selectByValue("Price: High to Low");
		sortby.selectByIndex(4);
		//sortby.selectByVisibleText("Price: High to Low");
		
		//WebElement selectdropdown = driver.findElement(By.id("products-pagesize"));
		//Select dropdown = new Select(selectdropdown);
		//dropdown.selectByIndex(4);
	}

}
