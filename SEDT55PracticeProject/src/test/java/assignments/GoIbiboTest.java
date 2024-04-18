package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiboTest {

	public static void main(String[] args) {
		String monthAndYear = "September 2024";
		String date = "27";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.goibibo.com/");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//d.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		//d.findElement(By.xpath("//span[text()='From']/following-sibling::p[.='Enter city or airport']")).sendKeys("Banga");
		d.findElement(By.xpath("//span[contains(.,'Bengaluru')]")).click();
		d.findElement(By.xpath("//span[text()='Departure']")).click();
		//d.findElement(By.xpath("//p[text()='31']")).click();
		for(;;) {
			try {
				d.findElement(By.xpath("//div[.='"+monthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
				//d.findElement(By.xpath("//div[.='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='27']")).click();
				break;
			}catch (Exception e) {
				d.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			}
		}
	}


