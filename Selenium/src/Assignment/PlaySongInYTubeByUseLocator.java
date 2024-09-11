package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySongInYTubeByUseLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		//driver.findElement(By.name("search_query")).sendKeys("juda hoke bhi");
		driver.findElement(By.name("search_query")).sendKeys("kal ho na ho");
		Thread.sleep(3000);
		//driver.findElement(By.id("search-icon-legacy")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@style='background-color: transparent;' and @src='https://i.ytimg.com/vi/GtQlQUFyDtk/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLATM8AEEUrMENfQ8JoipOfH9mrgAA']")).click();
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@style='background-color: transparent;' and @src='https://i.ytimg.com/vi/IVG5Rxxpj_E/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBmhrquxbN2IYrM2-5ge873ZUTCAw']")).click();
		
		// //a[@href='/watch?v=GtQlQUFyDtk&pp=ygUNanVkYSBob2tlIGJoaQ%3D%3D' and @rel='null']
		
		driver.findElement(By.xpath("//img[@style='background-color: transparent;' and @src='https://i.ytimg.com/vi/g0eO74UmRBs/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLACQW6joW2Ps76xL4dBSWRsszjQRg']")).click();
	}

}
