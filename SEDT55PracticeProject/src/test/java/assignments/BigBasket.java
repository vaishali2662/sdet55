package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.get("https://www.bigbasket.com/ps/?q=apple&nc=as");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("apple"+Keys.ENTER);
		Thread.sleep(4000);
		//d.findElement(By.xpath("//span[@title='Apple - Royal Gala Economy']")).click();
		WebElement ele = d.findElement(By.xpath("//h3[.='Apple - Royal Gala Economy']/ancestor::h3/following-sibling::div[@class='flex flex-col false']//button[text()='Add']"));
		Actions a = new Actions(d);
		a.moveToElement(ele).perform();
		ele.click();
		//hi
	}
	

}
