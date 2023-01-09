package practicParameterizatin1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumaricCellValue {

	public void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(5).getNumericCellValue();
	
	}

}
