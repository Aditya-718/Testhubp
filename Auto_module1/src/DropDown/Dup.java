package DropDown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm11.html");
       WebElement ele = driver.findElement(By.id("BeerBox"));
       Select s=new Select(ele);
       List<WebElement> opt = s.getOptions();
       TreeSet<String> t=new TreeSet<String>();
       for(WebElement we:opt)	
       {
    	  String t1=we.getText();
    	  t.add(t1);
}		
       for (String t2 : t) {
    	   System.out.println(t2);
    	   
		
	}
       driver.quit();
	}
			}
	
	


