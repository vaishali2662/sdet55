package assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImagesTest {

	public static void main(String[] args) throws IOException {
			WebDriver d = new ChromeDriver();
			d.get("https://www.onlinesbi.sbi/");
			d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			d.manage().window().maximize();
			List<WebElement> allImages = d.findElements(By.tagName("img"));
			System.out.println(allImages.size());
			int count=0;

			for (WebElement image : allImages) {
				String img = image.getAttribute("src");
				try {
				URL url = new URL(img); //creating an instance of url class
				HttpURLConnection imgConn = (HttpURLConnection) url.openConnection(); //downcasting from URLConnection class and openConnection() present in urlConnection
				int statusCode = imgConn.getResponseCode(); //getResponsecode() present in httpurlconnection class
				if(statusCode>=400 && statusCode!=0)
				{
					count++;
					System.out.println(img+"=>"+statusCode);
				}}catch (Exception e) {

				}
				System.out.println(count);

			}
		}
	}

