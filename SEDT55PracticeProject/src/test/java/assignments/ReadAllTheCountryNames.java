package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAllTheCountryNames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		d.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> allcountry = d.findElements(By.xpath("//span[@class='si-fname si-text']"));
		boolean flag =false;
		for (WebElement e : allcountry) {
			String text = e.getText();
			
			if(text.equalsIgnoreCase("Sri Lanka")) {
				flag=true;
				break;
			}
						
		}
		if(flag) {
			System.out.println("present");
		}else{
			System.out.println("not present");
		}
	}

}
