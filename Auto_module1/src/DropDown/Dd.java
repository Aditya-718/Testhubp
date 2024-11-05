package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm11.html");
       WebElement ele = driver.findElement(By.id("BeerBox"));
       Select s = new Select(ele);
       s.selectByIndex(50);
       s.selectByValue("c");
       s.selectByVisibleText("Old Monk");
       Thread.sleep(1000);
       s.deselectAll();
       boolean a = s.isMultiple();
       if(a)
       {
    	   System.out.println("dd is a Multiselect");
       }
       else
       {
    	   System.out.println("dd is not a Multislect");
       }
       
       List<WebElement> b = s.getOptions();
       for (WebElement wb : b) {
    	   System.out.println(wb.getText());
    	   
		
	}
       Thread.sleep(5000);
       driver.quit();
	}

}
