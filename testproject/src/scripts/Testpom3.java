package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Pomclass3;
import genriqe.Auto_constant;

public class Testpom3 {
	public class BaseTest3 implements Auto_constant{
		public WebDriver driver;
		@BeforeMethod
		public void openapp()
		{
			System.setProperty(gecko_kay,gecko_value);
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.tripadvisor.in/");
		}
	@Test
	public void testpom3()
	{
		Pomclass3 tripadvisor=new Pomclass3(driver);
		tripadvisor.set("Club Mahindra");
		tripadvisor.click();
		tripadvisor.click2();
		tripadvisor.click3();
		tripadvisor.mousehoveractionon();
		tripadvisor.click4();
		tripadvisor.writereviewtittleof("Club Mahindra Madiker is one of best to have experiance for those who travell to madikeri");
		tripadvisor.writereview2disc("Club Mahindra Madikeri is one of best to have experience for those who travel to madikeri its an amazing co-ordination by the staff of hotel and i feel comfortable to stay for more days and also have nice environment around the stay and  they are responding so quickly for our request.");
		tripadvisor.verifyelementreviewrating1();
		tripadvisor.clickcheckboxok();
		
	}
	@AfterClass 
	public void closeapp()
	{
		driver.quit();
	}
	}
}