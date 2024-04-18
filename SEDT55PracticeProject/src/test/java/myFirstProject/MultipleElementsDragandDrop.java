package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleElementsDragandDrop {

	public static void main(String[] args) throws AWTException {
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
		
		Actions a = new Actions(d);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		a.click(src1).perform();
		a.click(src3).perform();
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
