package scripts;



import org.testng.annotations.Test;

import pom.Pomclass2;
import genriqe.Base_test2;

public class Testpomclass2 extends Base_test2
{
	@Test
	public void testpom2()
	{
		Pomclass2 flipkar=new Pomclass2(driver);
		flipkar.set("iphone xr 64 gb yellow");
		flipkar.click2();
		flipkar.click2();
		flipkar.getprice();
	}
}
