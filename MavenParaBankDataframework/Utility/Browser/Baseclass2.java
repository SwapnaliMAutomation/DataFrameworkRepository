package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Resources.PropertyFileReader;
	
public class Baseclass2
{
	public WebDriver OpenBrowser() 
		  {
		PropertyFileReader p=new PropertyFileReader();
		
			 System.setProperty("webdriver.chrome.driver",p.getChromepath());
			 WebDriver driver=new ChromeDriver();
			 driver.get(p.getUrl());
			 driver.manage().window().maximize();
			 
			 return driver;
			 }
		 
		  public void CloseBrowser(WebDriver driver)
		  {
			  driver.quit();
		  }
		  
	 
	    
	  }







