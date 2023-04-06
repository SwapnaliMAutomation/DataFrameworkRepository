package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.Baseclass;
import Pages.Loginpage;

public class LoginTestclass
{
	WebDriver driver;
	Loginpage Login;
    Baseclass base;
 @BeforeClass
 public void OpenBrowser() 
		 {
			  base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
 @Test 
 public void Loginuser() throws InterruptedException 
		  {
			 Login= new Loginpage(driver);
			 Login.setusername();
			 Login.setpassword();
			 Login.clickloginbtn();
			 System.out.println("Login done successfully");
			 //System.out.println("Homepage is open");
			 Thread.sleep(3000);
			//verification point
			 String exp= "Accounts Overview";
			 Assert.assertEquals(Login.verifyacc(),exp);
			 
          }
 @AfterClass
 public void ClosechromeBrowser()
		 {
			 base.CloseBrowser(driver);
		 }
}
