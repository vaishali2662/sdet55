package myFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFlipkartFacebook {
	
	//need to open 3 applications in the different windows

	public static void main(String[] args) {
//		WebDriver d = new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    d.manage().window().maximize();
//		d.get("https://www.amazon.in/");
//		d.switchTo().newWindow(WindowType.WINDOW);
//		d.get("https://www.facebook.com/");
//		d.switchTo().newWindow(WindowType.WINDOW);
//		d.get("https://www.flipkart.com/");
		
	
		
		
		//open chrome browser 5 times in the same window but different tabs
//		WebDriver d = new ChromeDriver();
//		for (int i = 0; i < 4; i++) {
//			d.switchTo().newWindow(WindowType.TAB);
//		}

		//open chrome browser 5 times in the different window.
		WebDriver d = new ChromeDriver();
		for (int i = 0; i < 4; i++) {
			d.switchTo().newWindow(WindowType.WINDOW);
		}
		
	}

}
