package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/modal?sublist=0");
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
	    d.findElement(By.xpath("//button[@id='modal1']")).click();
	    d.switchTo().alert().dismiss();
	    
	}

}
