package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BooleanParameterization {

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(2).getBooleanCellValue();
	
	System.out.println(data);
	}
}
