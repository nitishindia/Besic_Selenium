package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseThePopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/?gad_source=1&gclid=Cj0KCQiAkKqsBhC3ARIsAEEjuJhiPalLjT5DX_dDMmWyx35XAd5mC3W69qDbcFAiij4MwT5iAJX5aqkaApTYEALw_wcB");
		for(;;) {
			try {
		
		driver.findElement(By.id("loginclose1")).click();
		break;
		}catch (Exception e) {
			Thread.sleep(2000);
		}
	}
	}

}
