package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("adityab008@gmail.com");
        //Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("abcxyz");
        driver.findElement(By.name("login")).click();
        
	}

}
