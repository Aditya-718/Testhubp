package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Before_After_Annotations extends GenericScript_Annotations {
	@Test
	public void Run()
	{
	
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung s24 ultra");
    
     driver.findElement(By.xpath("//button[@type='submit']")).click();
    
     driver.findElement(By.className("KzDlHZ")).click();
 
}
}
