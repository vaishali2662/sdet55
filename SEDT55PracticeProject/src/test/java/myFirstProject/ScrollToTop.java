package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToTop {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//span[contains(text(),' Back to top')]"));
		int X = ele.getLocation().getX();
		int Y = ele.getLocation().getY();
		Actions a = new Actions(d);
		a.scrollByAmount(X, Y).perform();
		//a.scrollToElement(ele).perform();
		ele.click();
	}

}
