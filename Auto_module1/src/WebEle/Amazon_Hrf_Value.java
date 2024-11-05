package WebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Hrf_Value {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
      List<WebElement> ele = driver.findElements(By.xpath("//img"));
      /*for (WebElement ab : ele) {
    	  System.out.println(ab.getAttribute("href"));
		
	}*/
      //Thread.sleep(1000);
      for (WebElement ab : ele) {
    	  System.out.println(ab.getAttribute("src"));
		
	}
      driver.quit();
	}

}
