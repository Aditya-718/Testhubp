package Framework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Altpopups.Generic_photo;

public abstract class GenericScript_Annotations extends Generic_photo {
	public RemoteWebDriver driver;
	@BeforeMethod
	public void FB_open()
	{
		System.setProperty("webdriver.chrome.driver","./data/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void FB_close() throws IOException
	{
		getPhoto(driver);
		 driver.close();
	}

}
