package assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.rbi.org.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.manage().window().maximize();
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		//int count=0;
		for (WebElement eachLink : allLinks) {
			String link = eachLink.getAttribute("href");
			try {
			URL url = new URL(link);
			HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
			int stausCode = httpConn.getResponseCode();
			if(stausCode>=400 && stausCode!=0)
			{
				System.out.println(link+"=>"+stausCode);
			}}catch (Exception e) {

			}
		}
	}

}
