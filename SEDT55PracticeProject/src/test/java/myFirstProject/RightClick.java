package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement element = d.findElement(By.id("btn30"));
		Actions a = new Actions(d);
		a.contextClick(element).perform();
		d.findElement(By.xpath("//button[@id='btn30']//div/div")).click();
		String text = d.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
		if(text.equalsIgnoreCase("Yes")) {
			System.out.println("you have clicked on yes button");
		}else {
			System.out.println("you have clicked on no button");
		}
		d.quit();
	}
}
