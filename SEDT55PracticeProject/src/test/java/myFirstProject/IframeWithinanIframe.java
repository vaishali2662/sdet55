package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithinanIframe {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.linkText("Iframe with in an Iframe")).click();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		d.switchTo().frame(0);
		d.findElement(By.tagName("input")).sendKeys("abc");

	}

}
