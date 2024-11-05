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

public class Write_Print_Table_form {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
          FileInputStream fis=new FileInputStream("./Excel/WriteData.xlsx");
          Workbook bk = WorkbookFactory.create(fis);
         Sheet sh = bk.createSheet("W_d");
        Row rw = sh.createRow(0);
       Cell ch = rw.createCell(0);
    Cell ch1 = rw.createCell(1);
    Cell ch2 = rw.createCell(2);
       ch.setCellValue("Aditya");
       ch1.setCellValue("36");
       ch2.setCellValue("Rxz");
      Row rw1 = sh.createRow(1);
      Cell ch3 = rw1.createCell(0);
      Cell ch4 = rw1.createCell(1);
      Cell ch5 = rw1.createCell(2);
         ch3.setCellValue("Shru");
         ch4.setCellValue("33");
         ch5.setCellValue("lv");
          FileOutputStream fos=new FileOutputStream("./Excel/WriteData.xlsx");
          bk.write(fos);
	}

}
