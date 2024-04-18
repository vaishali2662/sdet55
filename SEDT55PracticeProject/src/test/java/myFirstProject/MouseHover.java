package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Actions a = new Actions(d);
		a.moveToElement(ele).perform();
		List<WebElement> data = d.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']"));
		for (WebElement e : data) {
			System.out.println(e.getText());
			
			/*
			 * String text = driver.findElement(By.xpath("//ul[@class='p-4']")).getText();
			   System.out.println(text);
			 * 
			 */
		}
	}
}
