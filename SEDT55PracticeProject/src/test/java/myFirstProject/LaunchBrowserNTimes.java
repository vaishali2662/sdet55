package myFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserNTimes {

	public static void main(String[] args) {
		//open chrome browser 5 times in the same window but different tabs
		WebDriver d = new ChromeDriver();
		for (int i = 0; i < 4; i++) {
			d.switchTo().newWindow(WindowType.TAB);
		}
	}

}
