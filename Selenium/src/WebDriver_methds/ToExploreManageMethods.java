package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		//To Maximize
		
		driver.manage().window().maximize();

	}

}
