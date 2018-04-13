package Scripts;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver d;
	public static Properties  properties;
	private File f;
	private FileReader read;
	
	@BeforeMethod
	public void loadSetUp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 properties=new Properties();
		 f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\config.properties");
		 read=new FileReader(f);
		properties.load(read);
		
		f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\or.properties");
		 read=new FileReader(f);
		properties.load(read);
	}
	
	
	
	public  String getProperty(String key) throws Exception
	{
		String value = properties.getProperty(key);
		return value;
		
	}

}
