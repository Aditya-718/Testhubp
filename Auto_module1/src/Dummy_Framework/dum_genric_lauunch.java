package Dummy_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class dum_genric_lauunch {
	public WebDriver driver;
	
	@BeforeMethod
	public void TGT()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
   @AfterMethod
   public void goat() throws InterruptedException
  
   {
	   //Thread.sleep(7000);
	    //driver.close();
   }
}
