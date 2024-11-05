package POM_FW_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script1 {
	@FindBy(id="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement Pass;
	@FindBy(name="login")
	private WebElement Sub;
	public POM_Script1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void data_Uname(String un)
	{
		uName.sendKeys(un);
	}
	public void data_Password(String pwd)
	{
		Pass.sendKeys(pwd);
	}
	public void data_Click()
	{
		Sub.click();
	}

}
