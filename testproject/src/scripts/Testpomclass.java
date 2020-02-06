package scripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Pomclass;
import genriqe.Auto_constant;

public class Testpomclass 
{
	public class Base_test implements Auto_constant{
		public WebDriver driver;
		@BeforeClass
		public void openapp()
		{
			System.setProperty(gecko_kay,gecko_value);
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
		}
	@Test
	public void testpom2()
	{
		Pomclass amaznn=new Pomclass(driver);
		amaznn.set("iphone xr 64 gb yellow");
		amaznn.click();
		amaznn.click2();
		amaznn.getprice();
}
	@AfterClass 
	public void closeapp()
	{
		driver.quit();
	}
}
	public class Base_test1 implements Auto_constant{
		public WebDriver driver;
	@BeforeClass
	public void openapp()
	{
		System.setProperty(gecko_kay,gecko_value);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.in/");
	}
	@Test
	public void testpom2()
	{
		Pomclass amaznn=new Pomclass(driver);
		amaznn.set("iphone xr 64 gb yellow");
		amaznn.click();
		amaznn.click2();
		amaznn.getprice();
	}
	@AfterClass 
	public void closeapp()
	{
		driver.quit();
	}
	}
}
