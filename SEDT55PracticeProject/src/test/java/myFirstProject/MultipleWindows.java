package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.WebDriverUtilities;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		d.findElement(By.id("browserButton3")).click();
		WebDriverUtilities w = new WebDriverUtilities();
		w.switchWindow(d, "Login");
		d.findElement(By.id("username")).sendKeys("Admin@gmail.com");
	}

}
