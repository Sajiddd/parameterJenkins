package day21;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Parameters({"city"})
	@Test
	public void test(String city)
	{
		Reporter.log("parameter received from jenkins is = "+city);
	}
}
