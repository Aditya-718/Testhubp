package WebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seldel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("file:///C:/Users/Dell/Documents/pgm6.html");
        Thread.sleep(2000);
      List<WebElement> ele = driver.findElements(By.xpath("//input"));
     int count=ele.size();
     System.out.println(count);
     /*for(int i=0; i<=count-1;i++)
     {
    	 ele.get(i).click();
         Thread.sleep(1000);

     }
     for(int i=count-1;i>=0;i--)
     {
    	 ele.get(i).click();
    	 Thread.sleep(1000);
     }*/
     for (WebElement webElement : ele) {
    	 webElement.click();
	}
     Thread.sleep(1000);
     driver.quit();
        
	}

}
