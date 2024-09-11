package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		String parentID = driver.getWindowHandle();
		System.out.println(parentID); // F3668A1341F337059E2411BD09DDD948
									  // 1ED7E9CDF5DAEE49E603133E25B644AE

	}

}
