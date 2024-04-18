package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));
		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		d.findElement(By.id("submitButton")).click();
		d.quit();
	}

}
