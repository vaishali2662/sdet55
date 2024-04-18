package myFirstProject;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/download?sublist=0");
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
		d.findElement(By.id("writeArea")).sendKeys("Hi");
		d.findElement(By.id("downloadButton")).click();
		
		
		
		
		
	}

}
