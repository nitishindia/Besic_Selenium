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

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//step-1 Create an obj of FIS
		FileInputStream fis = new FileInputStream("./testData/Selenium.xlsx");
		
		// step-2 Create obj of workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		// call method
		String url = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String password = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
