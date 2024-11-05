package Altpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sw_oth_tab {

	public static void main(String[] args) throws AWTException   {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
        Actions ab=new Actions(driver);
        ab.contextClick(ele).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_T);
        Set<String> ac = driver.getWindowHandles();
       int count = ac.size();
       System.out.println(count);
       ArrayList<String> cd = new ArrayList<String>(ac);
         String adi = cd.get(1);
       driver.switchTo().window(adi);
       //driver.quit();
        
        
        
	}

}
