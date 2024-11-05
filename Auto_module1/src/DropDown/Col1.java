package DropDown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Col1 {

	public static void main(String[] args, Object August) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
       WebElement ele = driver.findElement(By.id("month"));
       Thread.sleep(1000);
       Select s = new Select(ele);
      List<WebElement> ab = s.getOptions();
      ArrayList<String> l=new ArrayList<String>();
      System.out.println(ab);
      for( WebElement we:ab)
      {
    	  String cd = we.getText();
    	  l.add(cd);
      }
      if(l.contains(August))
      {
    	  System.out.println("August is present in the list");
      }
      else
      {
    	  System.out.println("August is not present in the list");
      }
      Collections.sort(l);
      for(String l1:l)
      {
    	  System.out.println(l1);
    	  
      }
      Thread.sleep(2000);
      driver.quit();
       
       
       
	}

}
