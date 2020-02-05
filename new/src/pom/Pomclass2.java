package pom;

import genriqe.Base_page;
import genriqe.Base_test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomclass2 extends Base_page{
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement textbox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clicksearch;
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'Apple iPhone XR (64GB) - Yellow')]")
	WebElement click2oniphone;
	@FindBy(xpath = "(//span[contains(.,'₹ 47,900.00')])[3]")
	WebElement gettext;
	public Pomclass2(WebDriver driver)
	{
		super();//PageFactory.initElements(driver, this);
	}
	public void set(String un)
	{
		textbox.sendKeys();
	}
	public void click()
	{
		clicksearch.click();
	}
	public void click2()
	{
		click2oniphone.click();
	}
	public void getprice()
	{
		gettext.getText();
	}
	
}
