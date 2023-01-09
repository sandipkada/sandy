package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataUsingCt {

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\a\\EXCEL SHEET1.xlsx");
	
	Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(5);
	
	CellType ct = cellinfo.getCellType();
	if(ct==CellType.STRING) {
		System.out.println(cellinfo.getStringCellValue());
	}
	else if (ct==CellType.BOOLEAN) {
		System.out.println(cellinfo.getBooleanCellValue());
	}
	else if (ct==CellType.NUMERIC) {
		System.out.println(cellinfo.getNumericCellValue());
	}
	
	}
}
