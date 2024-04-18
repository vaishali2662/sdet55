package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MicTest {

	public static void main(String[] args) {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--use-fake-ui-for-media-stream");
		WebDriver d = new ChromeDriver(c);
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
		d.get("https://mictests.com/");
	    d.findElement(By.id("mic-launcher")).click();
	}

}
