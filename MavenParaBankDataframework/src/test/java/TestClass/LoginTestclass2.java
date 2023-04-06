package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Baseclass;
import Excel.ExcelReader;
import Pages.Loginpage;
import Pages.Loginpage2;

public class LoginTestclass2
{
	WebDriver driver;
	Loginpage2 Login;
	
    Baseclass base;
 @BeforeClass
 public void OpenBrowser() 
		 {
			  base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
 @DataProvider
 public Object[][] getData() throws IOException 
 {
	   ExcelReader E=new ExcelReader();
	   Object[][] data=E.gettestdata();
	   return data;
 }
 @Test(dataProvider="getData") 
 public void Loginuser2(String Username,String Password) 
		  {
			 Login= new Loginpage2(driver);
			 Login.setusername(Username);
			 Login.setpassword(Password);
			 Login.clickloginbtn();
			 System.out.println("Login done successfully");
			 //System.out.println("Homepage is open");
			
			//verification point
			 String exp= "Accounts Overview";
			 Assert.assertEquals(Login.verifyacc(),exp);
			 
			 Login.clicklogoutoflp();
			 
			 
          }
 @AfterClass
 public void ClosechromeBrowser()
		 {
			 base.CloseBrowser(driver);
		 }
}
