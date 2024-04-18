package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = d.findElement(By.id("circle"));
		Actions a = new Actions(d);
		a.clickAndHold(ele).pause(2000).perform();
		a.release().perform();
		//gfdduihysgyh
	}

}
