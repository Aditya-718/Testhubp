package Dummy_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dum2_Fbun_Refresh_Testng {
	
	WebDriver driver;
	@Test
	public void FbUsername() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	WebElement ele = driver.findElement(By.cssSelector("input[type='text']"));
	ele.sendKeys("adityab008@gmail.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	ele.sendKeys("adityab008@gmail.com");
	}
}
