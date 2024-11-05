package WebEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       WebElement tgt = driver.findElement(By.name("email"));
         String a = tgt.getCssValue("color");
         System.out.println(a);
         Thread.sleep(2000);
         driver.quit();
	}

}
