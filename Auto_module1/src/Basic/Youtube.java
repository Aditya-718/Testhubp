package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Martin New Movie Trailer");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div[id='title-wrapper']")).click();
	}

}
