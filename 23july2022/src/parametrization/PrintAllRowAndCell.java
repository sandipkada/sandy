package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllRowAndCell {
            
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	for(int i=0;i<sh.getLastRowNum();i++) {// it is for row
		for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {//its print all row and coloumn present on sheet
			
			
			String data = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+" ,");
		}
		System.out.println();
	}
	
	
	
	
	
	
	}
     	
	 
	

	
}

