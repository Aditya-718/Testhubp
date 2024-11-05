package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dra_Dro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
       WebElement ele = driver.findElement(By.id("box7"));
       WebElement ele1 = driver.findElement(By.id("box107"));
       Thread.sleep(1000);
        Actions act=new Actions(driver);
        act.dragAndDrop(ele, ele1).perform();
        Thread.sleep(6000);
        driver.quit();
	}

}
