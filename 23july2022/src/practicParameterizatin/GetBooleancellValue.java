package practicParameterizatin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBooleancellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(5).getBooleanCellValue();
	System.out.println(data);
	// getboolean cellvalue method is usd to find true or false data 
	}

}
