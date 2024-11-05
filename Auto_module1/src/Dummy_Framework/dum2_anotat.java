package Dummy_Framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dum2_anotat extends dum_genric_lauunch {
	@Test
	
	public void Goti()
	{
		  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Martin New Movie Trailer");
	        String ele = driver.getCurrentUrl();
	        System.out.println(ele);
	        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	        driver.findElement(By.xpath("//div[@id='title-wrapper']")).click();
	        SoftAssert sa= new SoftAssert();
	        sa.assertEquals(ele, "https://www.naukri.com/mnjuser/recommendedjobs");
	        sa.assertAll();
	}
	@Test
	public void purohith_Goti()
	{
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Martin New Movie Trailer");
	     driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	     driver.findElement(By.xpath("//div[@id='title-wrapper']")).click();
		 driver.findElement(By.xpath("//span[text()='Download']")).click();
	}

}
