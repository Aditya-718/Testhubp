package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/maps/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='hArJGc vF7Cdb']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-controls='sbsg50']")).sendKeys("Bengaluru");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-controls='sbsg51']")).sendKeys("kabini Karnataka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
       // driver.findElement(By.xpath("//button[@title='I like this']")).click();
	}

}
