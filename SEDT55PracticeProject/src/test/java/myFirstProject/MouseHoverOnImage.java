package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnImage {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/mouseHover/mouseHoverimage?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//img[@src='/assets/orderPlaced-fB7gNxPF.jpg']"));
		Actions a = new Actions(d);
		a.moveToElement(ele).perform();
	}

}
