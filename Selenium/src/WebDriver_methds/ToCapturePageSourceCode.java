package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://meghanafoods.co.in/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}

}
