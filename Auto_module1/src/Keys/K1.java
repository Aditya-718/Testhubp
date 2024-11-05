package Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class K1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm8.html");
        WebElement  ele=  driver.findElement(By.name("text"));
        ele.sendKeys("Aditya");
        Thread.sleep(2000);
        ele.sendKeys(Keys.CONTROL+"a"+"x");
 
        
       WebElement ele2=driver.findElement(By.className("text"));
        ele2.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
        
      WebElement ele1=driver.findElement(By.id("text"));
         ele1.sendKeys("Geetha");
         Thread.sleep(2000);
         ele1.sendKeys(Keys.CONTROL+"a"+"x");
         Thread.sleep(1000);
         ele.sendKeys(Keys.CONTROL+"v");
         Thread.sleep(1000);
         ele2.sendKeys(Keys.CONTROL+"a"+"x");
         Thread.sleep(1000);
         ele1.sendKeys(Keys.CONTROL+"v");
        
	}

}
