package demoproject;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Objectrepository {

	WebDriver  driver;
	
	@FindBy(name ="q")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(className ="L0Z3Pu")
	@CacheLookup
	WebElement searchbtn;
	
	@FindBy(className  = "ttx38n")
	@CacheLookup
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[4]/div/label/div[2]")
	@CacheLookup
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/span[1]")
	@CacheLookup
	WebElement Electronics;

	@FindBy(xpath = "_3A1TYz")
	@CacheLookup
	WebElement Laptopimage;
	
	@FindBy(linkText = "Login")
	@CacheLookup
	WebElement LoginLink;
	@FindBy(linkText = "Login")
	@CacheLookup
	WebElement Checkbox;
	
	public  Objectrepository(WebDriver driver1)
	{
	driver  = driver1;
	PageFactory.initElements(driver, this);
	}
	
	public void entersearchbox(String SB)
	{
		searchbox.sendKeys(SB);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}
	public void dropdown()
	{
		dropdown.click();
	}
	
	public void checkbox()
	{
		checkbox.click();
	}
	
	
	public void  Electronics(WebDriver driver)
	{
			Actions obj = new Actions(driver);
		
		obj.moveToElement(Electronics).perform();
	}
	
	
	public boolean isLoginLinkDisplayed()
	{
		try
		{
		boolean status = LoginLink.isDisplayed();
		return status;
		}catch(NoSuchElementException e)
		{
			System.out.println("loginin link is not displayed in Login Page");
			return false;
		}
	}
		
		public boolean isLaptopimageDisplayed()
		{
			try
			{
			boolean status = Laptopimage.isDisplayed();
			return status;
			}catch(NoSuchElementException e)
			{
				System.out.println(" Laptopimage is not displayed in  Page");
				return false;
			}
}
		public boolean isCheckboxDisplayed()
		{
			try
			{
			boolean status = Checkbox.isDisplayed();
			return status;
			}catch(NoSuchElementException e)
			{
				System.out.println(" Checkbox is not displayed in  Page");
				return false;
			}
		}
}