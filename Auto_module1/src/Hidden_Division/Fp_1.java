package Hidden_Division;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fp_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Dell/Documents/Fileup.html");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.name("upload file"));
        ele.sendKeys("C:\\Users\\Dell\\Downloads\\Aditya_B_-_Quality_Analyst.docx");
}
	
}
