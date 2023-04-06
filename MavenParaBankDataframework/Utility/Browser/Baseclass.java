package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Baseclass
{
	public WebDriver OpenBrowser() 
		  {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\MavenParaBankDataframework\\Browsers\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://parabank.parasoft.com");
			 driver.manage().window().maximize();
			 
			 return driver;
			 }
		 
		  public void CloseBrowser(WebDriver driver)
		  {
			  driver.quit();
		  }
		  
	 
	    
	  }







