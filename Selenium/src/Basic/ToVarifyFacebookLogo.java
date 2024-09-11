package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVarifyFacebookLogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		System.out.println(logo.isDisplayed());
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo==true) {
			System.out.println("Logo is display");
		}
		else {
			System.out.println("logo is not display");
		}
		
		
		
		driver.quit();
		

	}

}
