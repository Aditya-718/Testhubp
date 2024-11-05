package POM_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_FW_Generic.POM_Script1;

public class POM_FB_Login_Runner {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		POM_Script1 p=new POM_Script1(driver);
		p.data_Uname("adityab008@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.data_Uname("adityab008@gmail.com");
	}

}
