package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./data/geckodriver.exe");
       WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
           Thread.sleep(3000);
        WebElement country=driver.findElement(By.xpath("//select[@id='select3']"));
        Thread.sleep(3000);
        Select c=new Select(country);
        c.selectByVisibleText("India");
        Thread.sleep(2000);
        WebElement state=driver.findElement(By.xpath("//select[@id='select5']"));
        Select s=new Select(state);
        s.selectByVisibleText("karnataka");
        Thread.sleep(1000);
        
        WebElement city=driver.findElement(By.xpath("//select[@id='select5']/../../following-sibling::div[1]/div[1]/select[1]"));
        Select c1=new Select(city);
        Thread.sleep(1000);
        c1.selectByVisibleText("Mysore");
        
       Thread.sleep(3000);
       driver.quit();
        
        
	}

}
