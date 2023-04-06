package TestClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browser.Baseclass;
//import Browser.BaseClass;
import Pages.Homepage;
import Pages.Loginpage;
import Pages.Registration;
public class RegistrationTest {
	     WebDriver driver;
	     Loginpage Login;
		 Homepage Home;
		 Registration reg;
		 Baseclass base;
       @BeforeClass
		 public void OpenBrowser() 
		 {
			  base=new Baseclass();
	          driver=base.OpenBrowser();
		 }
		 @Test
		 public void registeruser() throws InterruptedException
		 {
		          Login= new Loginpage(driver);
				  Login.clickRegister();
				 
				  reg=new Registration(driver);
				  reg.setfname();
				  reg.setLname();
				  reg.setAdd();
				  reg.setcity();
				  reg.setstate();
				  reg.setzip();
				  reg.setphone();
				  reg.setssn();
				  reg.setuname();
				  reg.setpwd();
				  reg.setcpwd();
				  reg.clickregisterbtn();
				  System.out.println("Registration done successfully");
				  Thread.sleep(2000);
				  Home=new Homepage(driver);
				  Thread.sleep(1000);
				  System.out.println("Homepage is open");
				  String exp= "Your account was created successfully. You are now logged in.";
				 // String actual;
				  Assert.assertEquals(reg.verifyacc(),exp);
				  //Home.clicklogout();
			  }
			 
			 @AfterClass
			 public void ClosechromeBrowser()
			 {
				 base.CloseBrowser(driver);
			 }
}
