package Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Scripts.TestBase;

public class ListenerClass extends TestBase implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		if(!result.isSuccess())
		{
			String methodname = result.getName();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MMMM_yyyy_hh_mm_ss");
			try {
			File srcFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			String dest = new File(System.getProperty("user.dir")).getAbsolutePath()+"\\src\\main\\java\\screenShots";
			File destFile = new File(dest+"\\Test_Failure\\"+methodname+"_"+formater.format(cal.getTime())+".png");
			Reporter.log("<a href='"+destFile.getAbsolutePath()+"'> <img src='"+destFile.getAbsolutePath()+"' width='100' height='100'/></a>");			
			
			FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				System.err.println(e);
			}
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		Reporter.log("Test Started: "+arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		if(result.isSuccess())
		{
			String methodname = result.getName();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MMMM_yyyy_hh_mm_ss");
			try {
			File srcFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			String dest = new File(System.getProperty("user.dir")).getAbsolutePath()+"\\src\\main\\java\\screenShots";
			File destFile = new File(dest+"\\Test_Success\\"+methodname+"_"+formater.format(cal.getTime())+".png");
			Reporter.log("<a href='"+destFile.getAbsolutePath()+"'> <img src='"+destFile.getAbsolutePath()+"' width='100' height='100'/></a>");			
			
			FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				System.err.println(e);
			}
			
		}
		
	}
	

}
