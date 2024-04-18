package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadDataFromPropertyFileTest {
	static WebDriver d;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		
		if(browser.equalsIgnoreCase("chrome")) {
			d = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("safari")) {
			d = new SafariDriver();
		}else {
			System.out.println("-----Invalid browser---");
		}
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(8000);
		d.get(url);
		d.findElement(By.name("user")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		
		

		
	}

}
