package WebElements_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseAutosuggetion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
		Thread.sleep(3000);
		List<WebElement> Autosuggetion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
		for (WebElement Sugg : Autosuggetion) {
			System.out.println(Sugg.getText());
		}
	}

}
