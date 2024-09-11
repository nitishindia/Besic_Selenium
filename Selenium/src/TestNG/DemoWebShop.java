package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoWebShop extends Base {

	@Test
	public static void test1() {
	driver.findElement(By.linkText("Register")).click();
		
	}	

	}


