package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomclass {
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement textbox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clicksearch;
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'Apple iPhone XR (64GB) - Yellow')]")
	WebElement click2oniphone;
	@FindBy(xpath = "(//span[contains(.,'₹ 47,900.00')])[3]")
	WebElement gettext;
	public Pomclass(WebDriver driver)
	{
		super();//PageFactory.initElements(driver, this);
	}
	public void set(String un)
	{
		textbox.sendKeys("iphone xr 64 gb yellow");
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
	public void set1(String un) {
		textbox.sendKeys("iphone xr 64 gb yellow");
		
	}
		
	}
