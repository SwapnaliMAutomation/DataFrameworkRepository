package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration2 
{
	    String actual;
	    //declaration
		@FindBy(xpath="//input[@id='customer.firstName']") private WebElement Fname;
		@FindBy(xpath="//input[@id='customer.lastName']") private WebElement Lname;
		@FindBy(xpath="//input[@id='customer.address.street']") private WebElement Add;
		@FindBy(xpath="//input[@id='customer.address.city']") private WebElement city;
		@FindBy(xpath="//input[@id='customer.address.state']") private WebElement state;
		@FindBy(xpath="//input[@id='customer.address.zipCode']") private WebElement zip;
		@FindBy(xpath="//input[@id='customer.phoneNumber']") private WebElement phone;
		@FindBy(xpath="//input[@id='customer.ssn']") private WebElement ssn;
		@FindBy(xpath="//input[@id='customer.username']") private WebElement uname;
		@FindBy(xpath="//input[@id='customer.password']") private WebElement pwd;
		@FindBy(xpath="//input[@id='repeatedPassword']") private WebElement cpwd;
		@FindBy(xpath="(//input[@class='button'])[2]") private WebElement registerbtn;
		@FindBy(xpath="(//p)[3]") private WebElement verifyacc;
		
		//initialization
		public Registration2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void setfname(String Firstname)
		{
			Fname.sendKeys(Firstname);
		}
		public void setLname(String Lastname)
		{
			Lname.sendKeys(Lastname);
		}
		public void setAdd(String Address)
		{
			Add.sendKeys(Address);
		}
		public void setcity(String City)
		{
			city.sendKeys(City);
		}
		public void setstate(String State)
		{
			state.sendKeys(State);
		}
		public void setzip(String Zipcode)
		{
			zip.sendKeys(Zipcode);
		}
		public void setphone(String Phone)
		{
			phone.sendKeys(Phone);
		}
		public void setssn(String SSN)
		{
			ssn.sendKeys(SSN);
		}
		public void setuname(String Username)
		{
			uname.sendKeys(Username);
		}
		public void setpwd(String Password)
		{
			pwd.sendKeys(Password);
		}
		public void setcpwd(String Confirmpwd)
		{
			cpwd.sendKeys(Confirmpwd);
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



