package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       //WebElement ele1 = driver.findElement(By.id("box107"));
       Thread.sleep(1000);
        Actions act=new Actions(driver);
        act.doubleClick(ele).perform();
        Thread.sleep(3000);
        driver.quit();
	}

}
