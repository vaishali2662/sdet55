package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheApplication {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver d = new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//launch the application without using get() method
//		JavascriptExecutor j = (JavascriptExecutor) d;
//		j.executeScript("window.location=arguments[0]", "https://www.amazon.in");
		
		
		//scroll till bottom of the page
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.amazon.in/");
		
		JavascriptExecutor j = (JavascriptExecutor) d;
//		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		
//		//scroll to the top of the page
//		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		
		
		
		
		//scroll till element
		WebElement ele = d.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
//		j.executeScript("arguments[0].scrollIntoView()", ele);
		
		
		
		//sendKeys
		
		WebElement ele2 = d.findElement(By.id("twotabsearchtextbox"));
		j.executeScript("arguments[0].value=arguments[1]", ele,"iphone");
		
		
		
		
		//click on element
		WebElement ele1 = d.findElement(By.xpath("//a[.='Sell']"));
		j.executeScript("arguments[0].click()", ele);
		
		
		
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		
		
		
		
	}

}
