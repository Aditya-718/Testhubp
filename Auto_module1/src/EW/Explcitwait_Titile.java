package EW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explcitwait_Titile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement ele = driver.findElement(By.id("email"));
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
        ele.sendKeys("adityab008@gmail.com");
	}

}
