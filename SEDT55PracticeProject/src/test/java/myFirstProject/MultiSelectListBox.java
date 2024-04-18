package myFirstProject;


		import java.time.Duration;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class MultiSelectListBox {

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
				s3.selectByVisibleText("Karnataka");
				WebElement cityListBox = d.findElement(By.xpath("//label[text()='City']/../select"));
				Select s4 = new Select(cityListBox);
				s4.selectByValue("Belgaum");
				WebElement quantityListBox = d.findElement(By.id("select7"));
				Select s5 = new Select(quantityListBox);
				s5.selectByValue("4");
				d.findElement(By.id("continuebtn")).submit();
				d.quit();
	}

}
