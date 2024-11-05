package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
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

}
