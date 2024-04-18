package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameWindowDifferentTabs {

	public static void main(String[] args) {
		//need to open 3 applications in the same window but different tabs
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.facebook.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.flipkart.com/");
	}

}
