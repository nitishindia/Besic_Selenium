package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchPageAndPintTittle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://baskinrobbinsindia.com/");
		String titleOfWebpage = driver.getTitle();
		System.out.println(titleOfWebpage);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
	}

	
}
