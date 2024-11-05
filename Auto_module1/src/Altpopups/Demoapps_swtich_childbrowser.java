package Altpopups;

import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps_swtich_childbrowser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		 driver.get("https://demoapps.qspiders.com/ui/browser");
	        Thread.sleep(3000);
	        //driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
	        //Thread.sleep(2000);
	        WebElement ele = driver.findElement(By.xpath("//a[.='Open in new window']"));
	        ele.click();
	        Set<String> wc1 = driver.getWindowHandles();
	        ArrayList<String> ar= new ArrayList<>(wc1);
	        String ab = ar.get(1);
	        driver.switchTo().window(ab);
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).sendKeys("adityab008@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("abc@123");
	        driver.findElement(By.id("confirm-password")).sendKeys("abc@123");
	        Thread.sleep(2000);
	        driver.quit();

	}

}
