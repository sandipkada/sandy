package practicParameterizatin1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetStringcellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
	
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(6).getStringCellValue();
	 
	System.out.println(data);
	
	}
	

}
