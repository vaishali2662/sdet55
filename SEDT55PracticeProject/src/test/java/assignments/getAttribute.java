package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		d.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB)')]")).click();
		Set<String> allwh = d.getWindowHandles();
		for (String wh : allwh) {
			d.switchTo().window(wh);
		}
		List<WebElement> color = d.findElements(By.xpath("//img[@class='imgSwatch']"));
		for (WebElement webElement : color) {
			System.out.println(webElement.getAttribute("alt"));
		}

		

	}
}