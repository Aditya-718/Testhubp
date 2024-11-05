package Altpopups;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_Right_Click {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        WebElement ad1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
        WebElement ad2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
        WebElement ad3 = driver.findElement(By.xpath("//span[text()='Projects']"));
        WebElement ad4 = driver.findElement(By.xpath("//span[text()='Support']"));
        WebElement ad5 = driver.findElement(By.xpath("//span[text()='Blog']"));
        ArrayList<WebElement> nag=new ArrayList<WebElement>();
        nag.add(ad1);
        nag.add(ad2);
        nag.add(ad3);
        nag.add(ad4);
        nag.add(ad5);
        Actions act=new Actions(driver);
        Robot r=new Robot();
        for(WebElement nan:nag)
        {
        	act.contextClick(nan).perform();
        	Thread.sleep(2000);
        	r.keyPress(KeyEvent.VK_T);
        	r.keyRelease(KeyEvent.VK_T);
        	Thread.sleep(2000);
        	
        }
        Set<String> oh = driver.getWindowHandles();
        ArrayList<String> a=new ArrayList<String> (oh);
        String de = a.get(4);
        
        System.out.println(driver.getTitle());
    	//driver.switchTo().window(de);

        if(driver.switchTo().window(de).getTitle()=="Blog | Selenium")
        	
        {
        	driver.switchTo().window(de);
        }

	
        
        	
        	Thread.sleep(2000);
        	driver.close();
        
        	
                


       // Thread.sleep(2000);
       // driver.quit();

        
        
        
        
	}

}
