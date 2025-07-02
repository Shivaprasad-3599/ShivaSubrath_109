package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./Test Data/projectfile.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url); 
	}

}
