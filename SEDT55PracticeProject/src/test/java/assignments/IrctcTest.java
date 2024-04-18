package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcTest {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver d = new ChromeDriver(option);
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		d.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c58-10']//parent::div//descendant::td/a[text()='27']")).click();
	}

}
