package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Baseclass;
import Errors.Screenshots;
import Pages.Homepage;
import Pages.NewAccount;
public class NewAccountTest
{   String ActErrormsg;
	WebDriver driver;
	Homepage Home;
	NewAccount na;
    Baseclass base;
 @BeforeClass
 public void OpenBrowser() 
		 {    base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
@BeforeMethod
public void Loginuser4() throws IOException 
{
			 na= new NewAccount(driver);
			 na.setusername();;
			 na.setpassword();
			 na.clickloginbtn();
}	
@Test
public void opennewacc() throws IOException
{
try {
	Home=new Homepage(driver);
	Home.clickrequestloan();
}
catch(Exception e)
{
	e.printStackTrace();
	Screenshots s=new Screenshots();
	s.TakesScreenshots(driver, "102");
}
}
@AfterMethod
public void Logout()
{
	Home.clicklogout();
}
 @AfterClass
 public void ClosechromeBrowser()
		 {
			 base.CloseBrowser(driver);
		 }
}
