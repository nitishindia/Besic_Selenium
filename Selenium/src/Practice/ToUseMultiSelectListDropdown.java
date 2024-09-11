package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseMultiSelectListDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multidropdown = driver.findElement(By.id("cars"));
		
		Select dropdown = new Select(multidropdown);
		
		//dropdown.selectByValue("Free ( 90 )");
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		Thread.sleep(2000);
		dropdown.deselectByIndex(1);
	

	}

}
