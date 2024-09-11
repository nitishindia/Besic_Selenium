package WebDriver_methds;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.zomato.com/india");
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);
	}

}
