package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD_T1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	
FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
//To specify the path of the excel file
Workbook book = WorkbookFactory.create(fis);
//it is used to access the file
Sheet sheet=book.getSheet("Sheet1");
//it is used to access the specified sheet
Row rw=sheet.getRow(0);
//it is used to access the specified row
Cell c1=rw.getCell(0);
//it is used to access the specified cell
String usn=c1.getStringCellValue();
//it is used to read data from respective cell
System.out.println(usn);

Cell c11=rw.getCell(1);

String pwd=c11.getStringCellValue();
System.out.println(pwd);

//=============================== Pass the usn and pwd for login to appl ===============
System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");

WebDriver driver=new ChromeDriver();


driver.manage().window().maximize();

driver.get("http://www.facebook.com");
Thread.sleep(0);
driver.findElement(By.id("email")).sendKeys(usn);

driver.findElement(By.id("pass")).sendKeys(pwd);

driver.findElement(By.name("login")).click();

Thread.sleep(10000);
driver.quit();
		
	}

}
