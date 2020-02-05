package pom;

import genriqe.Base_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Pomclass3 extends Base_page{
	private static final WebDriver driver = null;
	@FindBy(xpath = "//input[contains(@placeholder,'Try “boutique hotels in Paris”')]")
	WebElement textbox;
	@FindBy(xpath = "(//span[@class='_2LyoLJ4U _2HBN-k68'])[2]")
	WebElement clicksearch;
	@FindBy(xpath = "//span[contains(.,'Club Mahindra Madikeri, Coorg')]")
	WebElement click2onfirstresult;
	@FindBy(xpath = "//a[contains(.,'Write a review')]")
	WebElement click3onwriteriew;
	@FindBy(xpath = "//span[@class='ui_bubble_rating fl bubble_50']")
	WebElement ele;
	@FindBy(xpath = "//span[@data-value='5']")
	WebElement clickonstar;
	@FindBy(xpath = "//input[@type='text']")
	WebElement textboxtittleofreview;
	@FindBy(xpath = "//textarea[contains(@name,'ReviewText')]")
	WebElement textboxofreview;
	@FindBy(xpath = "//span[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']")
	WebElement verifyelementreviewrateing;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement selectcheckbox;
	
	
	
	
	public Pomclass3(WebDriver driver)
	{
		super();//PageFactory.initElements(driver, this);
	}
	public void set(String un)
	{
		textbox.sendKeys("Club Mahindra");
	}
	public void click()
	{
		clicksearch.click();
	}
	public void click2()
	{
		click2onfirstresult.click();
	}
	public void click3()
	{
		click3onwriteriew.click();
	}
	
	public void mousehoveractionon()
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void click4()
	{
		clickonstar.click();
	}
	public void writereviewtittleof(String un)
	{
		textbox.sendKeys("Club Mahindra Madiker is one of best to have experiance for those who travell to madikeri");
	}
	public void writereview2disc(String un)
	{
		textbox.sendKeys("Club Mahindra Madikeri is one of best to have experience for those who travel to madikeri its an amazing co-ordination by the staff of hotel and i feel comfortable to stay for more days and also have nice environment around the stay and  they are responding so quickly for our request.");
	}
	public void verifyelementreviewrating1() 
	{
		verifyelement(verifyelementreviewrateing);
	boolean b=verifyelementreviewrateing.isDisplayed();
	System.out.print(b);
	if(b)
	{
		verifyelementreviewrateing.click();
	}
	else
	{
		System.out.print("element is not present");
	}	
	}
	public void clickcheckboxok()
	{
		clickonstar.click();
	}
		
	}

