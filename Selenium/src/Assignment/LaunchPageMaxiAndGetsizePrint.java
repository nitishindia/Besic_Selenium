package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPageMaxiAndGetsizePrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://online.kfc.co.in/");
		
		Thread.sleep(2000);
		
		// To maximize
		
		driver.manage().window().maximize();
		
		// To getsize
		
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		
		System.out.println(sizeOfBrowser);
		System.out.println(sizeOfBrowser.height);
		System.out.println(sizeOfBrowser.width);
		
		//System.out.println (driver.manage().window().getSize());

	}

}
