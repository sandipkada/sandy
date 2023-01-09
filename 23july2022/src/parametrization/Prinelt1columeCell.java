package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prinelt1columeCell {//print all colume present data

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
      int lastrowindex = sh.getLastRowNum();
    
      System.out.println(lastrowindex);//=5 but index is 4
      for(int i=0; i<=lastrowindex;i++) {
    	String data = sh.getRow(i).getCell(0).getStringCellValue();// he print 0 cloumn all value in consol
    //by using getstringcellvalue method
      System.out.print(data+",");
      
      
      }
      
      
 


}
	
}




