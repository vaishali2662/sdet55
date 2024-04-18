package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcHiddenDivisionPopupTest {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.ksrtc.in/oprs-web/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("txtJourneyDate")).click();
		d.findElement(By.xpath("//div[@class='ui-datepicker-title']/../..//descendant::a[text()='26']")).click();
		d.quit();
	}

}
