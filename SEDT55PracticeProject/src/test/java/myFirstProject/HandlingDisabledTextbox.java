package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledTextbox {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui?scenario=6");	
		d.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("document.getElementById('name').value='abc'");
		js.executeScript("document.getElementById('email').value='abc@gmail.com'");
		js.executeScript("document.getElementById('password').value='abc@1234'");
	}

}
