package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);
	}

}
