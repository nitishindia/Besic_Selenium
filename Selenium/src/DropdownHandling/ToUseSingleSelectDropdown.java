package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select (monthDropdown);
		Select yearSelect = new Select (yearDropdown);
		
		daySelect.selectByIndex(29);
		monthSelect.selectByValue("4");
		yearSelect.selectByVisibleText("1995");
		
		//Print all option day
		List<WebElement> allmonth = monthSelect.getOptions();
		for(WebElement month : allmonth) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(1000);
			
			//To check it is multiselect or not
			
			System.out.println(monthSelect.isMultiple());
		}

	}

}
