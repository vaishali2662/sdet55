package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("abc");
		d.findElement(By.xpath("//input[@class='w-full m-2 h-10 px-4 border-2 border-stone-600 rounded-md']")).sendKeys("abc@gmail.com");
		WebElement productListBox = d.findElement(By.xpath("//label[.='Product']/following-sibling::div/select"));
		Select s = new Select(productListBox);
		s.selectByVisibleText("Laptop");
		d.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("Hi Hello 123");
		d.findElement(By.xpath("//button[.='Submit']")).click();
	}

}
