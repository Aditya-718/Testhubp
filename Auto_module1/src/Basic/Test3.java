package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.amazon.com");
         String title=driver.getTitle();
         System.out.println(title);
         String url=driver.getCurrentUrl();
         System.out.println(url);
         String src=driver.getPageSource();
         System.out.println(src);
	}

}
