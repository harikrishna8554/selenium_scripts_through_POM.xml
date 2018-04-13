package Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script1  extends TestBase{
	
	@Test
	public void test1() throws Exception
	{
		d.get(getProperty("url1"));
		
		d.findElement(By.xpath(getProperty("signin"))).click();
		Thread.sleep(2000);
		d.findElement(By.xpath(getProperty("email"))).sendKeys("harikrishna");
		d.findElement(By.xpath(getProperty("password"))).sendKeys("harikrishna25");
		d.findElement(By.xpath(getProperty("submit"))).click();
		
		
	}

}
