package genriqe;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.w3c.dom.css.Rect;

public abstract class Base_page  {
	WebDriver driver;
	public Base_page()
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void verifytittle(String title)
	{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
	wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("tittle is present",true);
}
catch(Exception e)
{
   Reporter.log("tittle is not present",true);
	Assert.fail();
}
	}

	public void verifyelement(WebElement ele)
	{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
	wait.until(ExpectedConditions.visibilityOf(ele));
	Reporter.log("element is present",true);
}
catch(Exception e)
{
	Reporter.log("element not is present",true);
	Assert.fail();

}
}
	}