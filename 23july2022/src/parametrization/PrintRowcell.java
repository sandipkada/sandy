package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRowcell {// print full one row
 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
  Sheet sl = WorkbookFactory.create(file).getSheet("Sheet1");
   short cellsize=sl.getRow(0).getLastCellNum();//we want print row then we take last cellnumber(colomn)
   
   System.out.println(cellsize);
  for(int i=0;i<cellsize;i++) {// 7 no. data present.
	   String data = sl.getRow(0).getCell(i).getStringCellValue();
  System.out.print(data+"  ");
  
  
  
  }
}



}
