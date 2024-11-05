package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Actions_BeforeAfter_Generic {
	public RemoteWebDriver driver;
public	 Actions act;
	@BeforeMethod
	public void FB_open()
	{
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		act= new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void FB_close() throws IOException
	{
		
		 driver.close();
	}

}


