package Framework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Para1_method_testng {
	@Test(invocationCount=3, priority=1)
	public void test12()
	{
		System.out.println("Good Morning");
	}
	@Test
	public void test15()
	{
		System.out.println("Happy Weekend");
	}

}
