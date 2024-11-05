package Js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scr1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        for(int i=0;i<3;i++)
        {
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(1000);
        }
        for(int j=0;j<3;j++)
        {
        	js.executeScript("window.scrollBy(0,-500)");
        	Thread.sleep(1000);
        }
	}

}
