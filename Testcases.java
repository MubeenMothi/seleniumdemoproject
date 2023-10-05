package demoproject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;


public class Testcases {
	
	WebDriver  driver;
	
	Objectrepository obj;
	
	@BeforeMethod
	public void launchApplication(String browser) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver  = new  ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.flipkart.com");
	
	obj  = new Objectrepository(driver);
	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void verifythesearchbox()
	{
		obj.entersearchbox("Laptop");
		
		boolean flag = obj.isLoginLinkDisplayed();
		Assert.assertEquals(flag, true);
	
	
	}
	
	
	@Test(priority = 2)
	public void verifythesearchbtn()
	{
		obj.searchbtn.click();
		boolean flag = obj.isLaptopimageDisplayed();
		Assert.assertEquals(flag, true);
	}

	@Test(priority = 3)
	public void verifythedd()
	{
		obj.dropdown.click();
		boolean flag = obj.isCheckboxDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test(priority = 4)
	public void verifyandclickcheckbox()
	{
		obj.checkbox.click();
	}
	
	@Test(priority =5)
	public void verifythemoushehover()
	{
		obj.Electronics.click();
	}
	
	
	}
	
