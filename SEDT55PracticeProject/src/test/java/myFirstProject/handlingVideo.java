package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingVideo {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/video?sublist=0&scenario=1");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//div[@class='pt-10']//section/following-sibling::section/video")).click();
		//d.findElement(By.xpath("//video[@src='/assets/videofile-PWMPKjmv.mp4')"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("document.getElementsByTagName('video')[0].play()");

	}

}
  
 
     
