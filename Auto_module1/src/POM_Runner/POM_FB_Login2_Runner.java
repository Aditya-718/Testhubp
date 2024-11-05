package POM_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_FW_Generic.POM_Script1;

public class POM_FB_Login2_Runner {
   @Test
	public void Login_click()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		POM_Script1 p=new POM_Script1(driver);
		p.data_Uname("adityab008@gmail.com");
		p.data_Password("Test@123");
		p.data_Click();
	}
}
