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
import Excel.ExcelReader2;
//import Browser.BaseClass;
import Pages.Homepage;
import Pages.Loginpage3forerrormsg;
import Pages.Registration2;
public class RegTest3
{
	     WebDriver driver;
	    // Loginpage Login;
		 Homepage Home;
		 Registration2 reg2;
		 Baseclass base;
		 Loginpage3forerrormsg Loginforerror;
		//String s;
       @BeforeClass
		 public void OpenBrowser() 
		 {
			  base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
       @DataProvider
       public Object[][] getData() throws IOException 
       {
    	   ExcelReader2 E3=new ExcelReader2();
    	   Object[][] data=E3.gettestdata("RegisterPage","C:\\Users\\Admin\\eclipse-workspace\\MavenParaBankDataframework\\TestData\\DataFrameworkExcelSheet.xlsx");
    	   return data;
       }
		 @Test(dataProvider="getData")
		 public void registeruser3(String Firstname,String Lastname,String Address,String City,String State, String Zipcode,String Phone,String SSN,String Username,String Password,String Confirmpwd,String TCID) throws IOException
		 {
			 try {
		          Loginforerror= new Loginpage3forerrormsg(driver);
				  Loginforerror.clickRegister2();
				 
				  reg2=new Registration2(driver);
				  reg2.setfname(Firstname);
				  reg2.setLname(Lastname);
				  reg2.setAdd(Address);
				  reg2.setcity(City);
				  reg2.setstate(State);
				  reg2.setzip(Zipcode);
				  reg2.setphone(Phone);
				  reg2.setssn(SSN);
				  reg2.setuname(Username);
				  reg2.setpwd(Password);
				  reg2.setcpwd(Confirmpwd);
				  reg2.clickregisterbtn();
				  //System.out.println("Registration done successfully");
				 // Thread.sleep(2000);
				  
				  Home=new Homepage(driver);
				 // Thread.sleep(1000);
				 // System.out.println("Homepage is open");
				  String Act=reg2.verifyacc();
				  String exp= "Your account was created successfully. You are now logged in.";
				 // String actual;
				  Assert.assertEquals(Act,exp);
				  Home.clicklogout();
			  }
		    catch(Exception E)
		    {
		    	E.printStackTrace();
		    	Screenshots s=new Screenshots();
		    	s.TakesScreenshots(driver, TCID);
		    }
			 catch(AssertionError a)
			 {
				 a.printStackTrace();
				 Screenshots s=new Screenshots();
				 s.TakesScreenshots(driver, TCID);
			 }
		 }
			 @AfterClass
			 public void ClosechromeBrowser()
			 {
				 base.CloseBrowser(driver);
			 }
}
