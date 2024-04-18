package GenericUtilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtilities {

	/**
	 * This methods is used to switch between one window to another window using URl
	 * @author surajvantagode
	 * @param driver
	 * @param url
	 */
	
	public void switchWindow(WebDriver d,String url) {
		Set<String> allwh = d.getWindowHandles();
		for (String wh : allwh) {
			d.switchTo().window(wh);
			String currentUrl = d.getCurrentUrl();
			if(currentUrl.contains(url)) {
				break;
			}
		}
	}
}
