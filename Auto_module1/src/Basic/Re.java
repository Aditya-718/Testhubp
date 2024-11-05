package Basic;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Re {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	        // driver.get("https://www.flipkart.com/");
	         driver.navigate().to("https://www.flipkart.com/");
	         driver.navigate().back();
	         Thread.sleep(1000);
	         driver.navigate().forward();
	         Thread.sleep(1000);
	         driver.navigate().refresh();
	         
	       WebElement ele = driver.findElement(By.xpath("//span[.='Login']"));
	             System.out.println(ele.isDisplayed()); 
	             System.out.println(ele.isEnabled());
	             System.out.println(ele.isSelected());
	             System.out.println(ele.getSize().getHeight());
	            WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
	            String res = ele1.getCssValue("font-style");
	            System.out.println(res);
	           String res1 = ele1.getAttribute("class");
	           System.out.println(res1);
	      // System.out.println(ele.getTagName());
	         Thread.sleep(2000);
            // Dimension d=new Dimension(500,200);
            // driver.manage().window().setSize(d);
	        // Point P=new Point(200,300);
	        // driver.manage().window().setPosition(P);
	         driver.quit();

	         
}
}