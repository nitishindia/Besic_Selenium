package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// create the obj of fileinputstream
		FileInputStream fis = new FileInputStream("./testData/Selenium.xlsx");
		
		// create obj of workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// call method
		String url = wb.getSheet("sheet2").getRow(0).getCell(0).toString();
		String Firstname = wb.getSheet("Sheet2").getRow(1).getCell(0).toString();
		String Lastname = wb.getSheet("Sheet2").getRow(2).getCell(0).toString();
		String Email = wb.getSheet("Sheet2").getRow(3).getCell(0).toString();
		String Password = wb.getSheet("Sheet2").getRow(4).getCell(0).toString();
		String Confirmpassword = wb.getSheet("Sheet2").getRow(5).getCell(0).toString();
		
		// automation test script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get(url);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
		driver.quit();
		
		
		
		

	}

}
