package jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins_parameter {
	WebDriver d;
	@Test
	public void testJenkinsParam() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		System.out.println(System.getProperty("url"));
		d.get(System.getProperty("==========================url"));
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys(System.getProperty("data"));
	}

}
