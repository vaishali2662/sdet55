package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id='email'][name='email']")).sendKeys("Hi"); 
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com"); working
		//driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("Hi");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hi"); working
		//driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter your email']")).sendKeys("Hi"); //working
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com"); working
		//driver.findElement(By.cssSelector("input")).sendKeys("Hi"); not working
		//driver.findElement(By.cssSelector(".bg-gray-50 border border-gray-300 text-gray-900 rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:placeholder-gray-400 focus:bg-[rgb(240,240,240)] disabled:opacity-50 disabled:cursor-not-allowed text-sm")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.quit();
	}

}
