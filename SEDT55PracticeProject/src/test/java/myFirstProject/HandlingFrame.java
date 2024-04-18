package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		
		WebElement defaultEmail = d.findElement(By.xpath("//p[.='Admin@gmail.com']"));
		String email = defaultEmail.getText();
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));
		d.findElement(By.id("email")).sendKeys(email);
		d.switchTo().parentFrame();
		
		WebElement defaultPwd = d.findElement(By.xpath("//p[.='Admin@1234']"));
		String pwd = defaultPwd.getText();
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));
		d.findElement(By.id("password")).sendKeys(pwd);
		d.switchTo().parentFrame();
		
		d.switchTo().frame(d.findElement(By.xpath("//section[@class='main_form_container']//iframe")));
		d.findElement(By.id("confirm-password")).sendKeys(pwd);
		d.findElement(By.id("submitButton")).click();



	}
}
