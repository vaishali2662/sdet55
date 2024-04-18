package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement src1 = d.findElement(By.xpath("//*[text()='Mobile Charger']"));
		WebElement src2 = d.findElement(By.xpath("//*[text()='Laptop Charger']"));
		WebElement src3 = d.findElement(By.xpath("//*[text()='Mobile Cover']"));
		WebElement src4 = d.findElement(By.xpath("//*[text()='Laptop Cover']"));
		WebElement dest1 = d.findElement(By.xpath("//*[text()='Mobile Accessories']"));
		WebElement dest2 = d.findElement(By.xpath("//*[text()='Laptop Accessories']"));
		//WebElement dest3 = d.findElement(By.xpath("//*[text()='Mobile Accessories']"));
		//WebElement dest4 = d.findElement(By.xpath("//*[text()='Laptop Accessories']"));
		Actions a = new Actions(d);
		a.dragAndDrop(src4, dest1).perform();
		a.dragAndDrop(src3, dest2).perform();
		a.dragAndDrop(src2, dest2).perform();
		a.dragAndDrop(src1, dest1).perform();
		d.quit();
	}

}
