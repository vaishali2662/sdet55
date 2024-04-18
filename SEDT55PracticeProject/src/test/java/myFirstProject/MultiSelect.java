package myFirstProject;


	import java.awt.AWTException;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class MultiSelect {
	 public static void main(String[] args) throws AWTException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement country = driver.findElement(By.id("select-multiple-native"));
	  Select s= new Select(country);
	  s.selectByIndex(1);
	  s.selectByVisibleText("China");
	  s.selectByValue("India");
	  
	  
	  
	}
	}

