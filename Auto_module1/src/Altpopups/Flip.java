package Altpopups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flip {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        WebElement gee = driver.findElement(By.xpath("//input[@type='text']"));
        gee.sendKeys("samsung s24 ultra");
        Thread.sleep(2000);
        WebElement bab = driver.findElement(By.xpath("//button[@type='submit']"));
        bab.click();
        Thread.sleep(2000);
        WebElement adi = driver.findElement(By.className("KzDlHZ"));
        adi.click();
        Set<String> nag = driver.getWindowHandles();
        ArrayList<String> ar= new ArrayList<String>(nag);
        String sd = ar.get(1);
        driver.switchTo().window(sd);

        Thread.sleep(5000);
        Generic_photo.getPhoto(driver);
        Thread.sleep(2000);
        
        String sd1 = ar.get(0);
        driver.switchTo().window(sd1);
        Generic_photo.getPhoto(driver);
        Thread.sleep(3000);
        driver.quit();
        
        
        
	}

}

