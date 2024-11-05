package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Dell/Documents/Mainframe.html");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aditya");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='ln']")).sendKeys("Babu");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='USNTF']")).sendKeys("123");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8105557696");
	}

}
