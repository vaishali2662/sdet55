package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Shirts");
		List<WebElement> autoSugg = d.findElements(By.xpath("//a[@class='oleBil']"));
		for (WebElement i : autoSugg) {
			System.out.println(i.getText());
		}
		autoSugg.get(0).click();
	}

}
