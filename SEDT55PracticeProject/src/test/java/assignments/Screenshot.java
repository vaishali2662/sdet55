package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot{
	public static void main(String[] args) throws IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		TakesScreenshot t = (TakesScreenshot) d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/defect.png");
		FileUtils.copyFile(src, dest);
	}

}
