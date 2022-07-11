package IBM.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngexample {
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Iam in before method");
	}
	
	
	
	
	
	@Test
	public void testcase1()
	{
		System.out.println("Hello World");
	}

}
