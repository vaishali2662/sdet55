package DataDrivenTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultipleDataIntoEmptySheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, AWTException {
//		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.createSheet("patient");
		WebDriver d = new ChromeDriver();
		d.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
		d.findElement(By.xpath("//input[@name='user']")).sendKeys("unguardable");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		d.findElement(By.name("btnlogin")).click();
		//List<WebElement> fName = d.findElements(By.xpath("//td[@class='sorting_1']"));
		//ArrayList al = new ArrayList();
		d.switchTo().alert().accept();
		
		
	}

}
