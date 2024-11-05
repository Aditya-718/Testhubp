package Framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Altpopups.Generic_photo;

public class Para2_method_testng {
	
	@Test()
	public void Login_Flip() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canon 7D Mark II");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Canon EOS 7D Mark II DSLR Camera (Body only)']")).click();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
        driver.quit();
	}
	@Test(dependsOnMethods="Login_Flip")
	public void Samsungs24() throws InterruptedException, IOException
	{
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
