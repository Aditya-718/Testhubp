package Dummy_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dum_anotat extends dum_genric_lauunch {
	@Test
	public void GC_GT3times()
	{
	    
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Martin New Movie Trailer");
        String ele = driver.getCurrentUrl();
        System.out.println(ele);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//div[@id='title-wrapper']")).click();
        Assert.assertEquals(ele,"https://www.youtube.com/");
		
	}

}
