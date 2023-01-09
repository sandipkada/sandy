package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumaricValue {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
   FileInputStream file =new FileInputStream("C:\\Users\\Admin\\Downloads\\TestingForParameterization.xlsx");
     double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(7).getNumericCellValue();
System.out.println(data);
//numaric value present is complsary
}
}
