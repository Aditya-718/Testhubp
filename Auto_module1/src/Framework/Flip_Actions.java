package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Flip_Actions extends Actions_BeforeAfter_Generic {
	@Test
	public void takeAction() throws InterruptedException
	{
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canon 7D Mark II");
    WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
    act.contextClick(ele).perform();
          
          Thread.sleep(2000);
          
}
}
