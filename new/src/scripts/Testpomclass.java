package scripts;


import org.testng.annotations.Test;

import pom.Pomclass;
import genriqe.Base_test;

public class Testpomclass extends Base_test
{
	@Test
	public void testpom2()
	{
		Pomclass amaznn=new Pomclass(driver);
		amaznn.set("iphone xr 64 gb yellow");
		amaznn.click2();
		amaznn.click2();
		amaznn.getprice();
}
}

