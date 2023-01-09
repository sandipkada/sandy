package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
  String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
	}

}
