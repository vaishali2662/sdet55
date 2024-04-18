package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement countrycodeListBox = d.findElement(By.id("select1"));
		Select s = new Select(countrycodeListBox);
		s.selectByIndex(0);
		d.findElement(By.id("phone")).sendKeys("9876543210");
		WebElement genderListBox = d.findElement(By.id("select2"));
		Select s1 = new Select(genderListBox);
		s1.selectByIndex(1);
		WebElement countryListBox = d.findElement(By.id("select3"));
		Select s2 = new Select(countryListBox);
		List<WebElement> allOptions = s2.getOptions();
		int count =0;
		String element = "india";
		for (int i = 0; i < allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			if(text.equalsIgnoreCase(element)) {
				count++;
				break;
			}
			
		}
		if(count==1) {
			System.out.println(element+" is present");
			
		}else {
			System.out.println(element+" is not Present");
		}
	}

}
