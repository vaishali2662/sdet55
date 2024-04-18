package databasepracticesession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromCmdPromptTest {
	@Test
	public void readDataFromCmdLine() {
		WebDriver d = null;
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		if(BROWSER.contains("chrome")) {
			d = new ChromeDriver();
		}else if (BROWSER.contains("firefox")) {
			d = new FirefoxDriver();
		}else {
			System.out.println("---Invalid browser----");
		}
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get(URL);
		d.findElement(By.name("user")).sendKeys(USERNAME);
		d.findElement(By.name("password")).sendKeys(PASSWORD);
		d.findElement(By.name("btnlogin")).click();
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}
	

}
