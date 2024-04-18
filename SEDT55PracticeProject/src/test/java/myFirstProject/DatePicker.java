package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//div[@class='react-datepicker__input-container']")).click();
		WebElement image = d.findElement(By.xpath("//button[@aria-label='Next Month']"));
		for (int i = 0; i < 11; i++) {
			image.click();
		}
		WebElement date = d.findElement(By.xpath("//div[text()='1']"));
		date.click();
		
	}

}
