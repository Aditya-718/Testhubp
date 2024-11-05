package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompTitFb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        String a=driver.getTitle();
        System.out.println(a);
        if(a.contains("hello"))
        {
        	System.out.println("title matched");
        }
        else
        {
        	System.out.println("title not matched");
        }
       // Thread.sleep(5000);
       // driver.quit();
	}

}
