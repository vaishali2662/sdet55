package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsUsingRobotClass {

	public static void main(String[] args) throws AWTException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_1);
//		r.keyPress(KeyEvent.VK_2);
//		r.keyPress(KeyEvent.VK_3);
//		r.keyPress(KeyEvent.VK_4);
//		r.keyPress(KeyEvent.VK_5);
		
//		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		d.findElement(By.id("email")).sendKeys("admin@gmail.com".toUpperCase());


		
		
		

//		String text = "admin@gmail.com";
//		Robot r = new Robot();
//		for(char c:text.toCharArray()) {
//			int finalText = KeyEvent.getExtendedKeyCodeForChar(c);
//			r.keyPress(finalText);
//			r.keyRelease(finalText);
//		}
		
		
		
		
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_D);
//		r.keyRelease(KeyEvent.VK_D);
//		r.keyPress(KeyEvent.VK_ENTER);
//		
		
	}

}
