package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRownum {

public static void main(String[]args) throws EncryptedDocumentException, IOException { 
	 FileInputStream file =new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();// we want no. of row present in sheet
	// we take then getlastrownum method.
	
	System.out.println(data+1);// then he count only row 
}


}
