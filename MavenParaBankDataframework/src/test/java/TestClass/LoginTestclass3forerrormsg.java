package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Baseclass;
import Errors.Screenshots;
import Excel.ExcelReader;
import Excel.ExcelReader2;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.Loginpage2;
import Pages.Loginpage3forerrormsg;
public class LoginTestclass3forerrormsg
{
	String ActErrormsg;
	WebDriver driver;
	Loginpage3forerrormsg Lp3;
	Homepage Home;
    Baseclass base;
 @BeforeClass
 public void OpenBrowser() 
		 {    base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
 @DataProvider
 public Object[][] getData() throws IOException 
 {
	   ExcelReader2 E2=new ExcelReader2();
	   Object[][] data=E2.gettestdata("LoginPage","C:\\Users\\Admin\\eclipse-workspace\\MavenParaBankDataframework\\TestData\\DataFrameworkExcelSheet.xlsx");
	   return data; }
 @Test(dataProvider="getData") 
 public void Loginuser3(String Username,String Password,String TCID,String Status) throws IOException 
		  { try 
		  {
			 Lp3= new Loginpage3forerrormsg(driver);
			 Lp3.setusername(Username);
			 Lp3.setpassword(Password);
			 Lp3.clickloginbtn();
			 
			if(Status.equalsIgnoreCase("Valid"))
			{
				Home=new Homepage(driver);
				Assert.assertTrue(Home.verifynewaccoptionispresent());
				Home.clicklogout();
			}
			else
			{
				String ActErrormsg=Lp3.getErrormsg();
				Assert.assertEquals(ActErrormsg, "An internal error has occurred and has been logged");
			}
		  }
			catch(Exception e)
			{
				e.printStackTrace();
				Screenshots s=new Screenshots();
				s.TakesScreenshots(driver, TCID);
				}}
 @AfterClass
 public void ClosechromeBrowser()
		 {
			 base.CloseBrowser(driver);
		 }
}
