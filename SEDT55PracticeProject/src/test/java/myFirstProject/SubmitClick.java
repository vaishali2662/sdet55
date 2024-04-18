package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitClick {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("sat1")).click();
		d.findElement(By.id("btn40")).click();
		d.findElement(By.id("prob2")).click();
		d.findElement(By.id("btn41")).click();
		d.findElement(By.xpath("//input[@id='r1']")).click();
		d.findElement(By.id("btn42")).click();
	}

}
