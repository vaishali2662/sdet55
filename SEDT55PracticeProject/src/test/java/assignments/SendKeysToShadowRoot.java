package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysToShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.get("https://selectorshub.com");
		d.findElement(By.xpath("//a[.='PracticePage']")).click();
		WebElement element = d.findElement(By.xpath("//div[@id='userName']"));
		Actions a = new Actions(d);
		a.scrollToElement(element).perform();
		SearchContext shadow = element.getShadowRoot();
		shadow.findElement(By.id("kils")).sendKeys("abvs");
		Thread.sleep(3000);
		WebElement ele = d.findElement(By.cssSelector("#app2"));
		Thread.sleep(3000);
		SearchContext shade = ele.getShadowRoot();
		shade.findElement(By.id("pizza")).sendKeys("dominoz");
	}

}
