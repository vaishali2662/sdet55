package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int cellcount = wb.getSheet("usersheet").getRow(0).getLastCellNum();
		String expText = "client";
        boolean dataFound = false;
		for (int i = 0; i < cellcount; i++) {
			String text = wb.getSheet("usersheet").getRow(5).getCell(i).getStringCellValue();
			System.out.println(text);
			if (text.equalsIgnoreCase(expText)) {
                dataFound = true;
            }
        }
		System.out.println("==================");
        if (dataFound) {
            System.out.println("Data is present");
        } else {
            System.out.println("Data is not present");
        }
		wb.close();
	}

}
