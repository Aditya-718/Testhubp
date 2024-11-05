package Ac_ons;

//import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
                       
        driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath("//input[@class=' rangeInputSlidebar']"));
        Actions ab=new Actions(driver);
        ab.dragAndDropBy(ele, 100, 0).perform();
        
        Thread.sleep(3000);
        driver.quit();
       
        
	}

}
