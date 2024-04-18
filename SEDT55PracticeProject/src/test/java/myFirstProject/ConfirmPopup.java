package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = d.findElement(By.id("buttonAlert5"));
		ele.click();
		Alert a = d.switchTo().alert();
		a.accept();
		String text = d.findElement(By.xpath("//button[@id='buttonAlert5']/following-sibling::p")).getText();
		System.out.println(text);


		ele.click();
		a.dismiss();
		System.out.println(text);
		
				

	}

}
