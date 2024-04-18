package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//Sheet sh = wb.createSheet("sheet2");
//		Sheet sh = wb.getSheet("sheet2");
//		sh.createRow(0).createCell(0).setCellValue("data");
//		sh.getRow(0).createCell(1).setCellValue("data1");
//		
		Sheet sh = wb.getSheet("sheet1");
		sh.createRow(2).createCell(0).setCellValue("QSP");
		sh.getRow(2).getCell(0).setCellValue("Yes");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
	}

}
