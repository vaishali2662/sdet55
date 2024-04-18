package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++) {
			 String text = allLinks.get(i).getText();
			 String url = allLinks.get(i).getAttribute("href");
			 System.out.println(url);
			 System.out.println(text);
		}
		
	}
}
