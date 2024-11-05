package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Apps {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        Thread.sleep(10000);
        driver.findElement(By.id("name")).sendKeys("Aditya");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("adityab008@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("Test@123");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();

      	}
}
