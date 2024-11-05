package DropDown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ka_Ta {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
        Actions ab=new Actions(driver);
        ab.contextClick(ele).perform();
        Thread.sleep(2000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_T);
        Thread.sleep(2000);
        driver.quit();
	}

}
