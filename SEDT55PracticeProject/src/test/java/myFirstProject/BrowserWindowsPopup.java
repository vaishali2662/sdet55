package myFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='New Tab']")).click();
		d.findElement(By.id("browserButton4")).click();
		Set<String> allwh = d.getWindowHandles();
		for (String w : allwh) {
			d.switchTo().window(w);
			String url = d.getCurrentUrl();
			if(url.contains("SignUpPage")) {
				break;
			}
		}
		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	}

}
