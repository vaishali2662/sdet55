package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleModalPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
	    d.findElement(By.id("multiModalButton")).click();
	    d.findElement(By.id("multiClosemodal")).click();
	    String text = d.findElement(By.xpath("//p[.='This is the secondary modal']")).getText();
	    System.out.println(text);
	    d.findElement(By.xpath("//p[.='This is the secondary modal']/../following-sibling::section/button")).click();
	    d.findElement(By.id("multiclose2")).click();
	    d.quit();
	    
	   
	}

}
