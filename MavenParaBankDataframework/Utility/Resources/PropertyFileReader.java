package Resources;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader
{
	Properties pro;
	public PropertyFileReader()
	{
		try {
			FileInputStream File=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenParaBankDataframework\\Resources\\Config.properties");
			pro=new Properties();
			pro.load(File);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getUsername()
	{
		String TUS=pro.getProperty("Username");
		return TUS;
	}
	public String getPassword()
	{
		String TPWD=pro.getProperty("Password");
		return TPWD;
	}
	public String getUrl()
	{
		String TUrl=pro.getProperty("Url");
		return TUrl;
	}
	public String getChromepath()
	{
		String TChromepath=pro.getProperty("Chromepath");
		return TChromepath;
	}

}
