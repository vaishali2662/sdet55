package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.manage().window().maximize();
	    String username = "admin";
	    String password = "admin";
	    String url = "https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
	    d.get(url);
	}

}
