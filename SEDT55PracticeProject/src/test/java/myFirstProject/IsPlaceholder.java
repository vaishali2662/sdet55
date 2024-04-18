package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsPlaceholder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = driver.findElement(By.id("name")).getAttribute("placeholder");
		//System.out.println(text);
		if(text.equalsIgnoreCase("Enter your name")) {
			System.out.println("placeholder is present");
		}
		else {
			System.out.println("placeholder is not present");
		}
		driver.quit();
	}

}
