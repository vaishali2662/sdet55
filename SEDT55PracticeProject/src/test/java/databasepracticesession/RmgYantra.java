package databasepracticesession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RmgYantra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.get("http://rmgtestingserver:8084");
		d.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		d.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		d.findElement(By.xpath("//button[.='Sign in']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[.='Projects']")).click();
		d.findElement(By.xpath("//span[.='Create Project']")).click();
		d.findElement(By.xpath("//input[@name='projectName']")).sendKeys("Project_Vaish_2019");
		//d.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("4");
		d.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Vaishali");
		WebElement options = d.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select[@name='status']"));
		Select s= new Select(options);
		s.selectByValue("Created");
		d.findElement(By.xpath("//input[@class='btn btn-success']")).click();
	}

}
