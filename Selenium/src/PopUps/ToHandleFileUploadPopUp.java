package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); // cross browser testing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		//Action class
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform(); // scroll the page down
		//To Avoid
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\dell\\Documents\\NitishResume.docx");
		
	}

}
