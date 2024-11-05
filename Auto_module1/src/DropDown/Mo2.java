package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm11.html");
      WebElement sb= driver.findElement(By.id("BeerBox"));
      Select s=new Select(sb);
      List<WebElement> ab = s.getOptions();
    int count =ab.size();
for(int i=0;i<count;i=i+2)      
{
	WebElement cd = ab.get(i);
	cd.click();
	System.out.println(cd.getText());
	
      }
Thread.sleep(2000);
driver.quit();
    	  
	}
}


