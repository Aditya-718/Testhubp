package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dra1_Drop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
       WebElement ele = driver.findElement(By.id("dragElement1"));
      // ele.sendKeys(Keys.CONTROL+"");
       WebElement ele1 = driver.findElement(By.id("dragElement3"));
       driver.findElement(By.id("dropzone"));
       Actions act= new Actions(driver);
       

}
}
