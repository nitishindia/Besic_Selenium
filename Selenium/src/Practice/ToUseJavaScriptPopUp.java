package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame(0);
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Thread.sleep(2000);
//		//Alert PopUp
//		Alert popup = driver.switchTo().alert();
//		System.out.println(popup.getText());
//		//popup.accept();
//		popup.dismiss();
		
		
//		driver.get("https://licindia.in/");
//		driver.findElement(By.xpath("//button[text()='Close']")).click();
//		driver.findElement(By.xpath("//a[@title='Login']")).click();
//		Alert confPopUp = driver.switchTo().alert();
//		//confPopUp.accept();
//		//confPopUp.dismiss();
//		System.out.println(confPopUp.getText());
//		
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert PromptPop = driver.switchTo().alert();
//		PromptPop.sendKeys("Nitish");
//		PromptPop.accept();
		PromptPop.dismiss();
		driver.quit();
		
		

	}

}
