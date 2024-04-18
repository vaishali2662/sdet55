package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys("abc@gmail.com",Keys.COMMAND+"ac");
		d.findElement(By.id("password")).sendKeys(Keys.COMMAND+"v");
		// WebElement password = d.findElement(By.id("password"));
		//password.sendKeys(Keys.chord(Keys.COMMAND+"ac"));
		//password.sendKeys(Keys.chord(Keys.COMMAND,"c"));
		d.findElement(By.id("confirmPassword")).sendKeys(Keys.COMMAND+"V"+Keys.ENTER);
		
	}

}
