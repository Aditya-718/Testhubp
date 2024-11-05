package Js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Src3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
        WebElement ele = driver.findElement(By.xpath("//a[text()='About Us']"));
        Point p = ele.getLocation();
        int x=p.getX();
        int y=p.getY();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(1000);
        ele.click();
        Thread.sleep(2000);
        driver.quit();
	}

}
