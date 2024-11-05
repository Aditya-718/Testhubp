package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DD_T2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
		Workbook Book=WorkbookFactory.create(fis);
		Sheet sh = Book.createSheet("Sheet2");
		Row rw = sh.createRow(0);
		Cell c1 = rw.createCell(0);
		c1.setCellValue("Admin");
		FileOutputStream fos=new FileOutputStream("./Excel/TestData.xlsx");
		Book.write(fos);
		

	}

}

