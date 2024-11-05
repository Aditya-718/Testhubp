package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
       Thread.sleep(2000);
       //TakesScreenshot  ts=(TakesScreenshot) driver;
       File src = ele.getScreenshotAs(OutputType.FILE);
       File dst = new File("D:\\Users\\Dell\\Login_button.jpeg");
       FileHandler.copy(src, dst);
       Thread.sleep(3000);
       driver.quit();
       
	}

}
