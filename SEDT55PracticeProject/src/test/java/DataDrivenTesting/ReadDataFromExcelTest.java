package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		String text = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(text);
		Sheet sh = wb.getSheet("sheet1");
		
		
		int rowcount = sh.getLastRowNum();
	    int cellcount = sh.getRow(0).getLastCellNum();  //getPhysicalNum()
		
		for (int i = 0; i <=rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String text = sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(text+" ");
			}
			System.out.println(" ");
		}
		wb.close();
	}

}
