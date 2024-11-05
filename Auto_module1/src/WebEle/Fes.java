package WebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        List<WebElement> ad = driver.findElements(By.xpath("//img"));
        List<WebElement> bc = driver.findElements(By.xpath("//a"));
       int count=ad.size();
        System.out.println(count);
       int count1=bc.size();
       System.out.println(count1);
        driver.quit();
        
	}

}
