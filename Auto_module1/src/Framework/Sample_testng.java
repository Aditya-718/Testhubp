package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_testng {
	@Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("adityab008@gmail.com");
    //Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abcxyz");
    driver.findElement(By.cssSelector("button[name='login']")).click();

}
	@Test
	public void login_Test()
	{
	   WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	}
	
}
