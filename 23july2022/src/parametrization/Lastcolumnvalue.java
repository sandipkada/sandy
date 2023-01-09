package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lastcolumnvalue {

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
	Object data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getLastCellNum();
	//we want total colume no. present in excel sheet then we take getlastcellnum methode
	
	System.out.println(data);//then only print total colume no.is present in sheet.
	}

}
