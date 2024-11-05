package Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_Tng1 {
	@Test
	public void Test1()
	{
		Reporter.log("Hello world",false);
	}
	@Test
	public void Test2()
	{
		Reporter.log("hello India",true);
	}

}
