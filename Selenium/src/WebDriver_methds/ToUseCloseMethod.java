package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
