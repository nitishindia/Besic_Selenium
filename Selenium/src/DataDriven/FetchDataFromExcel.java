package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream ("./testData/Book.xlsx");
		
		Workbook w = WorkbookFactory.create(f);
		
		String url = w.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String email = w.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String pass = w.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		

	}

}
