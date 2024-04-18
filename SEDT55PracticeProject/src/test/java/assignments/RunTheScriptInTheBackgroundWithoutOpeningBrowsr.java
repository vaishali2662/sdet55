package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTheScriptInTheBackgroundWithoutOpeningBrowsr {

	public static void main(String[] args) {
//		ChromeOptions option = new ChromeOptions();
//		
//		//run the script in the background without opening the browser.
//		option.addArguments("--headless");
//		
//		WebDriver d = new ChromeDriver(option);
//		d.get("https://www.facebook.com/");
//		System.out.println(d.getCurrentUrl());
		
		
//		ChromeOptions option = new ChromeOptions();
//		//run the script in incognito mode.
//		option.addArguments("--incognito");
//		WebDriver d = new ChromeDriver(option);
//		d.get("https://www.facebook.com/");
//		System.out.println(d.getCurrentUrl());
		
		ChromeOptions option = new ChromeOptions();
		//globalization testing
		option.addArguments("--lang=kn");
		WebDriver d = new ChromeDriver(option);
		d.get("https://www.facebook.com/");
		System.out.println(d.getTitle());
	}

}
