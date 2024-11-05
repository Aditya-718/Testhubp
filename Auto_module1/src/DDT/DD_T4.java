package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DD_T4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
             FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
             Workbook Book= WorkbookFactory.create(fis);
             Sheet sh = Book.getSheet("Flikart Links");
             int lr = sh.getLastRowNum();
             for(int i=0;i<lr;i++) {
            	 Row rw=sh.getRow(i);
            	 Cell c1=rw.getCell(0);
            	 String val = c1.getStringCellValue();
            	 System.out.println(val);
            	 
             }
             
             
	}

}
