package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCaptchaTest {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/captcha?sublist=0");
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement ele = d.findElement(By.xpath("//div[@class='rc-anchor-logo-img rc-anchor-logo-img-portrait']"));
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}

}
