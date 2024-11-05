package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD_T3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
       List<WebElement> links = driver.findElements(By.xpath("//a"));
        FileInputStream fis= new FileInputStream("./Excel/TestData.xlsx");
        Workbook Book=WorkbookFactory.create(fis);
        Sheet sh = Book.createSheet("Flikart Links");
        int count = links.size();
        for(int i=0;i<count;i++)
        {
        	WebElement l1 = links.get(i);
        	String url = l1.getAttribute("href");
        	Row rw = sh.createRow(i);
        	Cell c1 = rw.createCell(0);
        	c1.setCellValue(url);
        }
        FileOutputStream fos= new FileOutputStream("./Excel/TestData.xlsx");
        Book.write(fos);
        
	}

}
