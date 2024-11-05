package Altpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_Child_Max {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
	        Thread.sleep(2000);
	         driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	        String ac = driver.getWindowHandle();
	        Set<String> ab = driver.getWindowHandles();
	        ab.remove(ac);
	        int count = ab.size();
	        System.out.println(count);
	        for(String cd:ab)
	        {
	        	driver.switchTo().window(cd);
	        	System.out.println(driver.getTitle());
	        	Thread.sleep(2000);
	        	driver.manage().window().maximize();
	        	
	       
	}

}
}
