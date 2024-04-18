package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleNestedFrames {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		//d.switchTo().frame(0);		
		String emailId = d.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));
		d.switchTo().frame(0);
		d.findElement(By.id("email")).sendKeys(emailId);
		
		d.switchTo().defaultContent();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		String password = d.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));


		//d.switchTo().parentFrame();
		d.switchTo().frame(1);
		d.findElement(By.id("password")).sendKeys(password);
		
		d.switchTo().parentFrame();
		d.switchTo().frame(2);
		d.findElement(By.id("confirm")).sendKeys(password);
		
		d.switchTo().parentFrame();
		d.switchTo().frame(3);
		d.findElement(By.id("submitButton")).click();
	}

}
