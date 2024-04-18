package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSelectFileUpload {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
	    WebElement ele = d.findElement(By.xpath("//input[@id='fileInput']"));
	    ele.sendKeys(System.getProperty("user.dir")+"/src/main/resources/data.pdf");
	    ele.sendKeys(System.getProperty("user.dir")+"/src/main/resources/data.docx.pdf");


	}

}
