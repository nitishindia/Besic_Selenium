package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		Single select listbox
		
	//		driver.get("https://www.facebook.com/signup");
	//		WebElement daydropdown = driver.findElement(By.id("day"));
	//		Select dropdown = new Select(daydropdown);
	//		dropdown.selectByIndex(4);
	//		Thread.sleep(1000);
	//		WebElement monthdropdown = driver.findElement(By.id("month"));
	//		Select dropdown1 = new Select(monthdropdown);
	//		dropdown1.selectByVisibleText("Oct");
	//		Thread.sleep(1000);
	//		WebElement yeardropdown = driver.findElement(By.id("year"));
	//		Select dropdown2 = new Select(yeardropdown);
	//		dropdown2.selectByVisibleText("2000");
		
		
//		Multi select listbox
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiselect = driver.findElement(By.id("cars"));
		Select multi = new Select(multiselect);
		System.out.println(multi.isMultiple());
		multi.selectByIndex(0);
		multi.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(1000);
		//multi.deselectByIndex(0);
		multi.deselectAll();

	}

}
