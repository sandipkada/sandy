package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
     
		CellType ct = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getCell(6).getCellType();
      
      System.out.println(ct);
	
	
	}
	

}
