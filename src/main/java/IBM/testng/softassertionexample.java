package IBM.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertionexample {

	@Test()
	public void hardassert()
	{
		
		String Expected = "IBMBatch";
		String Actual = "IBM";
		//Assert.assertEquals(Actual, Expected); //hard assertion
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(Actual, Expected);
		System.out.println("after assertion");
		//obj.assertAll();
}
}
