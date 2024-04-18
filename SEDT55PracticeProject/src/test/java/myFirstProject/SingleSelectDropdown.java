package myFirstProject;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
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
		s2.selectByValue("India");
		WebElement stateListBox = d.findElement(By.id("select5"));
		Select s3 = new Select(stateListBox);
		List<WebElement> allOptions = s3.getOptions();
		
		TreeSet t = new TreeSet();
		 for(int i=0;i<allOptions.size();i++) {
			String text = allOptions.get(i).getText();
			t.add(text);
		}
			//ascending order
		for(Object e:t) {
		System.out.println(e);
		}	
		
		System.out.println("------------------------------");
		//descending order
		java.util.Iterator x = t.descendingIterator();
		while (x.hasNext()) { 
            System.out.println("Value is : "+ x.next()); 
        } 
	}
	
}
