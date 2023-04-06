package Errors;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots 
{
public void TakesScreenshots(WebDriver driver,String TCID) throws IOException

{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Desc=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Dataframework Screenshot"+TCID+".jpg");
	FileHandler.copy(src, Desc);
			
	
}

}
