package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Before_After extends GenericScript_Annotations {
	@Test
	public void Flip_Search()
	{
	   
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canon 7D Mark II");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement ele = driver.findElement(By.xpath("//div[text()='Canon EOS 7D Mark II DSLR Camera (Body only)']"));
        
        
	}
		
	

}
