package genriqe;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest3 implements Auto_constant{
	public WebDriver driver;
	@BeforeClass
	public void openapp()
	{
		System.setProperty("webDriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.tripadvisor.in/");
	}
	@AfterClass 
	public void closeapp()
	{
		driver.quit();
	}
}
