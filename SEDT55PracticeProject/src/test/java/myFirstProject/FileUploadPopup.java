package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws AWTException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.id("fileInput")).sendKeys("/Users/surajvantagode/Downloads/data.pdf");
		String text = d.findElement(By.xpath("//section[@class='flex my-4']")).getText();
		System.out.println(text);
		
		
		//d.findElement(By.linkText("Custom Button")).click();

		//File f = new File("./data.pdf");
		//String abspath = f.getAbsolutePath();
		//WebElement ele = d.findElement(By.xpath("//div[text()='Upload File']"));
		

	
	}

}
