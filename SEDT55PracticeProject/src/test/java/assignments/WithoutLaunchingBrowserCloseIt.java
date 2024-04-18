package assignments;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class WithoutLaunchingBrowserCloseIt {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		Process proc = r.exec("taskkill /im chrome.exe /f /t");
	}

}
