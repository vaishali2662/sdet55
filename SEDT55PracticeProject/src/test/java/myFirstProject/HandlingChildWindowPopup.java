package myFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Open in new window']")).click();
		Set<String> allwh = d.getWindowHandles();
		for (String wh : allwh) {
			d.switchTo().window(wh);
			String url = d.getCurrentUrl();
			System.out.println(url);
			if(url.contains("SignUpPage")) {
				d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
				d.findElement(By.id("password")).sendKeys("Admin@1234");
				d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
				d.findElement(By.xpath("//button[text()='Sign Up']")).click();
			}
			/*
			d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
			d.findElement(By.id("password")).sendKeys("Admin@1234");
			d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
			d.findElement(By.xpath("//button[text()='Sign Up']")).click();
			*/
		}
	}

}
