package practicParameterizatin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumaricCellvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	 double data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(6).getNumericCellValue();
	}//getnumericCellvalue is used to print a numbers are presnt in sheet
// numeber should be presnt in sheet.

}
