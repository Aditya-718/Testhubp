package WebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("file:///C:/Users/Dell/Documents/pgm10.html");
      List<WebElement> ele = driver.findElements(By.xpath("//input"));
      for (WebElement webElement : ele)
      {
    	   webElement.sendKeys("Aditya");
		
	}
      Thread.sleep(1000);
      for (WebElement webElement : ele) {
		webElement.clear();
		
	}
      Thread.sleep(1000);
      driver.quit();
	}

}
