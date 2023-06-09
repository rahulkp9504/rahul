package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("sdcn");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("ge").getRow(2).getCell(2).getStringCellValue();
		System.out.println(data);
	}

}
