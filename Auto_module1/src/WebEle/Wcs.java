package WebEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wcs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement tgt = driver.findElement(By.name("email"));
         int a = tgt.getSize().getHeight();
         int    b   = tgt.getSize().getWidth();     
         System.out.println(a);
         System.out.println(b);
         Thread.sleep(2000);
         driver.quit();
	}

}
