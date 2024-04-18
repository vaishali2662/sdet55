package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBox {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = d.findElement(By.id("buttonAlert1"));
		ele.click();
		Alert a = d.switchTo().alert();
		a.sendKeys("no");
		a.accept();
		String text = d.findElement(By.xpath("//button[@id='buttonAlert1']/following-sibling::p")).getText();
		//System.out.println(text);
		
		if(text.equalsIgnoreCase("You selected yes")) {
			System.out.println(text);
		}
		else {
			System.out.println(text);
		}
		
		/*
		ele.click();
		a.sendKeys("no");
		a.dismiss();
		System.out.println(text);
		*/

	}

}
