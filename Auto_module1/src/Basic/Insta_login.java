package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("adityab008@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();
	}
	}


