package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = d.findElement(By.id("btn20"));
		Actions a = new Actions(d);
		a.doubleClick(ele).perform();
		d.quit();
		
	}
}
