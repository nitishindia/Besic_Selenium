package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//driver.manage().window().fullscreen();
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		System.out.println(size.width);
//		System.out.println(size.height);
//		//driver.manage().window().setSize(new Dimension(500, 500));
		//Point position = driver.manage().window().getPosition();
		//System.out.println(position);
		//driver.manage().window().setPosition(new Point(100, 100));
		
//		driver.findElement(By.id("name")).sendKeys("Nitish");
//		driver.findElement(By.xpath("//button[text()='Register']")).submit();
//		WebElement error = driver.findElement(By.xpath("//p[contains(text(),'required')]"));
//		System.out.println(error.getText());
//		WebElement emailfield = driver.findElement(By.id("email"));
//		System.out.println(emailfield.getAttribute("id"));
//		System.out.println(emailfield.getTagName());
//		System.out.println(emailfield.getSize());
//		System.out.println(emailfield.getLocation());
		//Rectangle regbutton = driver.findElement(By.xpath("//button[text()='Register']")).getRect();
		//System.out.println(regbutton.height);
		//System.out.println(regbutton.width);
		//System.out.println(regbutton.x);
		//System.out.println(regbutton.y);
		//Point location = driver.findElement(By.xpath("//button[text()='Register']")).getLocation();
		//System.out.println(location.x);
		//System.out.println(location.y);
		boolean reg = driver.findElement(By.xpath("//button[text()='Register']")).isDisplayed();
		System.out.println(reg);
		boolean enable = driver.findElement(By.xpath("//button[text()='Register']")).isEnabled();
		System.out.println(enable);
		boolean select = driver.findElement(By.xpath("//button[text()='Register']")).isSelected();
		System.out.println(select);
		WebElement css = driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println(css.getCssValue("color"));
		System.out.println(css.getCssValue("background-color"));
		
		
		

	}

}
