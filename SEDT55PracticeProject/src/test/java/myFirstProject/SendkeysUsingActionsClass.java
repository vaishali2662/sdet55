package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysUsingActionsClass {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=3");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement emailTxtBox = d.findElement(By.xpath("//input[@id='email']"));
		Actions a = new Actions(d);
		//a.click(emailTxtBox).sendKeys("abc@gmail.com").perform();
		a.sendKeys(emailTxtBox, "abc@gmail.com").perform();
		WebElement passwordTxtBox = d.findElement(By.xpath("//input[@id='password']"));
		a.sendKeys(passwordTxtBox, "Abc@1234").perform();
		WebElement confirmPasswordTxtBox = d.findElement(By.xpath("//input[@id='confirmPassword']"));
		a.sendKeys(confirmPasswordTxtBox, "Abc@1234").perform();
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.quit();
	}

}
