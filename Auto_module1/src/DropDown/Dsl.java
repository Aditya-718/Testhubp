package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dsl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm11.html");
       WebElement ele = driver.findElement(By.id("BeerBox"));
       Select s = new Select(ele);
       s.selectByVisibleText("Old Monk");
       Thread.sleep(1000);	
       s.deselectByVisibleText("Old Monk");
       Thread.sleep(1000);
       driver.quit();
	}

}
