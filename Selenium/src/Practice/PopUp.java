package Practice;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	//	Alert Popup
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		Alert ref = driver.switchTo().alert();
		ref.accept();
		
	//	Confirmation Popup
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		Alert ref1 = driver.switchTo().alert();
		ref1.dismiss();
		
	//	Promt popup
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Alert ref2 = driver.switchTo().alert();
		ref2.sendKeys("yes");
		ref2.accept();
		
	// Authantication Popup
		
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		
		
		


	}

}
