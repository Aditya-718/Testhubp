package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lc1 {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("file:///C:/Users/Dell/Documents/pgm2.html");
          //WebElement ele=driver.findElement(By.tagName("a"));
         // ele.click();
         // driver.findElement(By.id("a1")).click();
         // driver.findElement(By.name("n1")).click();
          driver.findElement(By.className("c1")).click();
          
	}

}
