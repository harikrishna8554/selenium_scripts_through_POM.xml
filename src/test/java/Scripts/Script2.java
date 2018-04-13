package Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script2 extends TestBase {
	
	@Test
	public void test2() throws Exception
	{
		d.get(getProperty("url2"));
		Thread.sleep(2000);
		d.findElement(By.xpath(getProperty("catIcon"))).click();
		d.quit();
		//d.findElement(By.xpath(getProperty("gmailIcon"))).click();
	}

}
