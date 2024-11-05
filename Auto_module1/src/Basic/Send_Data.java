package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Data {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
	          WebDriver driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("file:///C:/Users/Dell/Documents/pgm1.html");
	          driver.findElement(By.tagName("input")).sendKeys("Aditya");
	          Thread.sleep(2000);
	          driver.findElement(By.tagName("input")).clear();
	          

	}

}
