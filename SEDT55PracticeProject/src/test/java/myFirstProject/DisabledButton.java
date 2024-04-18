package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DisabledButton {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.id("btn10")).click();
		d.findElement(By.id("btn13")).click();
		d.findElement(By.id("btn18")).click();
		d.findElement(By.xpath("//input[@id='submit']")).click();
		d.findElement(By.xpath("//button[@id='submitButton']")).click();
	
	}
}
