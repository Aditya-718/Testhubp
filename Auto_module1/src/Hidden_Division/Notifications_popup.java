package Hidden_Division;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
        WebDriver driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
        WebElement ele = driver.findElement(By.xpath("//button[text()='Notification']"));
        ele.click();
	}

}
