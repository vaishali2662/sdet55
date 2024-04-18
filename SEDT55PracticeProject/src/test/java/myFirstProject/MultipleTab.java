package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilities.WebDriverUtilities;

public class MultipleTab {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		d.findElement(By.id("browserButton2")).click();
		WebDriverUtilities w = new WebDriverUtilities();
		
		w.switchWindow(d, "SignUpPage");
		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		d.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		w.switchWindow(d, "Login");
		d.findElement(By.id("username")).sendKeys("Admin");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.xpath("//button[text()='Login']")).click();
		
		w.switchWindow(d, "SignUp");
		d.findElement(By.id("username")).sendKeys("Admin");
		d.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		d.findElement(By.id("password")).sendKeys("Admin@1234");
		d.findElement(By.xpath("//button[text()='Sign Up']")).click();





	}

}
