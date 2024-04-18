package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		d.switchTo().frame(ele);
		d.findElement(By.id("username")).sendKeys("abc");
		d.findElement(By.id("password")).sendKeys("Abc@1234");
		d.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
	}

}
