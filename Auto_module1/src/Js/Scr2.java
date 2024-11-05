package Js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scr2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/pgm12.html");
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('a1').value=' '");
        Thread.sleep(2000);
        driver.quit();
	}

}
