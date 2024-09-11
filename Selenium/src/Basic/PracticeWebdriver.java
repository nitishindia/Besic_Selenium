package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		String TitleOfWebpage = driver.getTitle();
		System.out.println(TitleOfWebpage);
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);
		//String SourceCode = driver.getPageSource();
		//System.out.println(SourceCode);
		//driver.close();
		//driver.quit();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		Dimension SizeOfPage = driver.manage().window().getSize();
		System.out.println(SizeOfPage);
		//driver.manage().window().setSize(new Dimension(700, 700));
		Point WebpagePosition = driver.manage().window().getPosition();
		System.out.println(WebpagePosition);
		driver.manage().window().setPosition(new Point(50, 50));
		
		System.out.println("----NOW Navigation Process-----");
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		nav.refresh();
		
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		

	}

	
	

}
