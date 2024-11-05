package Ac_ons;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ac1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
        Actions ab=new Actions(driver);
        Thread.sleep(3000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_WINDOWS);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_WINDOWS);
        r.keyRelease(KeyEvent.VK_M);
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.quit();
        }

}
