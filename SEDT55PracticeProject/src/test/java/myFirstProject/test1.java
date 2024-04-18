package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.cssSelector("[id='name'][name='name']")).sendKeys("Hi"); 
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("abc@1234");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//driver.quit();
		//driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("Hi"); working


		
		
	}

}
