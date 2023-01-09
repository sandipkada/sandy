package practicParameterizatin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastCellNum {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	int data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	System.out.println(data);
	}//getlastcellnumer is give in total cell count no.

}
