package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage3forerrormsg
{
	String actual;
	//declaration
	@FindBy(xpath="//input[@name='username']") private WebElement uname;
	@FindBy(xpath="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	@FindBy(xpath="//h1[text()='Accounts Overview']") private WebElement verifyaccount;
	@FindBy(xpath="//a[text()='Log Out']") private WebElement logoutbtnoflp;
	@FindBy(xpath="//a[text()='Forgot login info?']") private WebElement forgotlogininfo;
	@FindBy(xpath="//a[text()='Register']") private WebElement Register2;
	@FindBy(xpath="//p[text()=\"An internal error has occurred and has been logged.\"]") private WebElement Errormsg;
	//initialization
	public Loginpage3forerrormsg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickRegister2()
	{
		Register2.click();
	}
	
	public void setusername(String Username)
	{
		uname.sendKeys(Username);
	}
	public void setpassword(String Password)
	{
		pwd.sendKeys(Password);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	public String getErrormsg() 
	{
		String actual=Errormsg.getText();
		 return actual;
    }
	public void clicklogoutoflp()
	{
		logoutbtnoflp.click();
	}
	
}
