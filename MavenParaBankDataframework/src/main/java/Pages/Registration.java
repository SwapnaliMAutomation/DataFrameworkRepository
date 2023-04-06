package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration 
{
	    String actual;
	    //declaration
		@FindBy(xpath="//input[@id='customer.firstName']") private WebElement Fname;
		@FindBy(xpath="//input[@id='customer.lastName']") private WebElement Lname;
		@FindBy(xpath="//input[@id='customer.address.street']") private WebElement Add;
		@FindBy(xpath="//input[@id='customer.address.city']") private WebElement city;
		@FindBy(xpath="//input[@id='customer.address.state']") private WebElement State;
		@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement zip;
		@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement phone;
		@FindBy(xpath="//input[@id='customer.ssn']") private WebElement ssn;
		@FindBy(xpath="//input[@id='customer.username']") private WebElement uname;
		@FindBy(xpath="//input[@id='customer.password']") private WebElement pwd;
		@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement cpwd;
		@FindBy(xpath="(//input[@class='button'])[2]") private WebElement registerbtn;
		@FindBy(xpath="(//p)[3]") private WebElement verifyacc;
		
		//initialization
		public Registration(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void setfname()
		{
			Fname.sendKeys("677");
		}
		public void setLname()
		{
			Lname.sendKeys("jghjj");
		}
		public void setAdd()
		{
			Add.sendKeys("goa");
		}
		public void setcity()
		{
			city.sendKeys("Pune");
		}
		public void setstate()
		{
			State.sendKeys("Maharashtra");
		}
		public void setzip()
		{
			zip.sendKeys("3769002");
		}
		public void setphone()
		{
			phone.sendKeys("9876543256");
		}
		public void setssn()
		{
			ssn.sendKeys("985658987654");
		}
		public void setuname()
		{
			uname.sendKeys("tushsachin@yaaho.in");
		}
		public void setpwd()
		{
			pwd.sendKeys("google@34");
		}
		public void setcpwd()
		{
			cpwd.sendKeys("google@34");
		}
		public void clickregisterbtn() 
		{
			registerbtn.click();
			
		}
		public String verifyacc() 
		{
			 
			 actual=verifyacc.getText();
			 return actual;
	    }
		
	}



