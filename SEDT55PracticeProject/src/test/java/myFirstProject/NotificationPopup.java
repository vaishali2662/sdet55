package myFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import GenericUtilities.WebDriverUtilities;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(c);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
		Set<String> wh = d.getWindowHandles();
		for (String s : wh) {
			d.switchTo().window(s);
			String title = d.getTitle();
			System.out.println(title);
			if(title.contains("Online Bus Ticket")) {
				break;
			}
		}
		d.findElement(By.id("departFrom")).sendKeys("Bangalore");
	    d.findElement(By.xpath("//div[text()='Bangalore']")).click();

		d.findElement(By.id("goingTo")).sendKeys("Mumbai");
	    d.findElement(By.xpath("//div[text()='Mumbai']")).click();
	    d.close();
	    
	    WebDriverUtilities w = new WebDriverUtilities();
	    w.switchWindow(d, "train-search");
		d.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		w.switchWindow(d, "train-search");
		d.findElement(By.xpath("//a[contains(text(),'MEALS')]")).click();
		d.findElement(By.xpath("//span[contains(text(),'Order Food - E-Catering')]")).click();


	    

		//d.findElement(By.id("browNotButton")).click();
		


	}

}
