package WebDriver_methds;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreMiniManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		//To Maximize
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// To Minimize
		
		//driver.manage().window().minimize();
		
		//FullScreen
		
		//driver.manage().window().fullscreen();
		
		//To Getsize
		
//		Dimension sizeOfBrowser = driver.manage().window().getSize();		
//		System.out.println(sizeOfBrowser);		
//		System.out.println(sizeOfBrowser.getWidth());
//		System.out.println(sizeOfBrowser.getHeight());
		
		//To SetSize
		
//	driver.manage().window().setSize(new Dimension(700, 700));
		
		//To getposition
		
//		Point pos = driver.manage().window().getPosition();
//		System.out.println(pos);
//		System.out.println(pos.getX());
//		System.out.println(pos.getY());
		
		//To Setposition
		
//		driver.manage().window().setPosition(new Point(100, 100));
		
		
	}

}
