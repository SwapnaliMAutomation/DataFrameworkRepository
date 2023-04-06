package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{    String Act;
	//declaration
	@FindBy(xpath="//a[text()='Open New Account']") private WebElement opennewacc;
	@FindBy(xpath="//a[text()='Accounts Overview']") private WebElement accoverview;
	@FindBy(xpath="//a[text()='Transfer Funds']") private WebElement transferfunds;
	@FindBy(xpath="//a[text()='Bill Pay']") private WebElement billpay;
	@FindBy(xpath="//a[text()='Find Transactions']") private WebElement findtran;
	@FindBy(xpath="//a[text()='Update Contact Info']") private WebElement updateconinfo;
	@FindBy(xpath="//a[text()='Request Loan']") private WebElement requestloan;
	@FindBy(xpath="//a[text()='Log Out']") private WebElement logout;
	@FindBy(xpath="//a[text()='Open New Account']") private WebElement verifynewaccopen;
	
	//initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
   public void setopennewacc()
	{
		opennewacc.click();
		
	}
	
	   public boolean verifynewaccoptionispresent()
	   {
		   boolean result=verifynewaccopen.isDisplayed();
		   return result;
			
    }
	public void clickrequestloan()
	{
		requestloan.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
	
	}
