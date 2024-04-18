package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleFrames {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String email = d.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']")).getText();
		WebElement ele = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(ele);
		d.findElement(By.id("email")).sendKeys(email);
		
		d.switchTo().parentFrame();
		String password = d.findElement(By.xpath("//p[text()='Password : Admin@1234']")).getText();
		d.switchTo().frame(ele);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("confirm-password")).sendKeys(password);
		d.findElement(By.id("submitButton")).click();
		
		d.switchTo().parentFrame();
		
		String email1 = d.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']")).getText();

		d.switchTo().frame(1);
		d.findElement(By.id("username")).sendKeys(email1);
		d.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		d.findElement(By.id("submitButton")).click();
		
		
	}

}
