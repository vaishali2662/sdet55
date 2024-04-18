package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleDragAndDrop {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		//WebElement src2 = d.findElement(By.xpath("//div[@id='dragElement1']|//div[@id='dragElement3']"));
		WebElement src1 = d.findElement(By.id("dragElement1")) ;
		WebElement src2 = d.findElement(By.id("dragElement3"));
		WebElement dest = d.findElement(By.id("dropZone2"));
		src1.click();
		src2.click();
		Actions a = new Actions(d);
		a.dragAndDrop(src1, dest).perform();
		d.quit();
	}

}
