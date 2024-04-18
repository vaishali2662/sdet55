package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p = new Properties();
		
		p.setProperty("browser", "chrome");
		p.setProperty("url", "http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
		p.setProperty("username", "unguardable");
		p.setProperty("password", "admin");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData.properties");
		p.store(fos, "write data");
	}

}
