package in.nic.ehospial.generic;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;
import in.nic.ehospial.generic.BaseClass;
import Report.ExtentManager;

public class TestListener implements ITestListener {
	
	
public static int  executionCount,passCount,failCount,skipCount=0;
private static ExtentReports extent = ExtentManager.setExtent();
private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();  // Need When Parallel execution require


public void onTestStart(ITestResult result) {

	ExtentTest test = extent.createTest(result.getTestClass().getName() +"::"+ result.getMethod().getMethodName());
	extentTest.set(test);
	
executionCount++;
Reporter.log( result.getName()+"script execution starts at" + new Date(),true);      

}


public void onTestSuccess(ITestResult result) {
	String logText = "<b>TestMethod " + result.getMethod().getMethodName() + " Successfull</b>";
	Markup m = MarkupHelper.createLabel(logText,ExtentColor.GREEN);
	extentTest.get().log(Status.PASS, m);
	
passCount++;
Reporter.log( result.getName()+"script   is passed",true);      

}


public void onTestFailure(ITestResult result) {
String methodName = result.getMethod().getMethodName();
String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
extentTest.get().fail("<details><summary><b><font color = red>" +
    	"Exception Occured,Click to see details:"+ "<font></b></summary>" +
        exceptionMessage.replaceAll(",", "<br>") + "</details> \n");
    

//WebDriver driver = ((BaseClass).result.getInstance()).driver;   
   String path = takeScreenshot(BaseClass.driver,result.getMethod().getMethodName());
   
	try {
		extentTest.get().fail("<b><font color = red>" + "Screenshot of failure" + "</font></b>",
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	}catch(IOException e) {
		extentTest.get().fail("Test Failed,Can not attach Screenshot");
	}
	
	String logText = "<b>Test Method " +methodName + " Failed</b>";
	Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
	extentTest.get().log(Status.FAIL, m);
	
	
	
//==========================================================================================	
failCount++;
Reporter.log( result.getName()+" script  is failed",true);      
//
//TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
//File srcFile = ts.getScreenshotAs(OutputType.FILE);
//
//File destFile = new File ("./screenshots/"+result.getName()+".png");
//
//try {
//Files.copy(srcFile, destFile);
//} catch (IOException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}
//Reporter.log("Screenshot has been taken",true);
}


public void onTestSkipped(ITestResult result) {
	
	String logText = "<b>TestMethod " + result.getMethod().getMethodName() + " Skipped</b>";
	Markup m = MarkupHelper.createLabel(logText,ExtentColor.BLUE);
	extentTest.get().log(Status.SKIP, m);

}


public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}


public void onTestFailedWithTimeout(ITestResult result) {

}


public void onStart(ITestContext context) {
Reporter.log("framework execution starts at "+new Date(),true);
}


public void onFinish(ITestContext context) {
Reporter.log("Suite Execution ends:"+new Date(),true);
Reporter.log("Total scripts executed:"+executionCount,true);
Reporter.log("Total scripts passed"+passCount,true);
Reporter.log("Total scripts failed"+failCount,true);
Reporter.log("Total scripts skipped"+skipCount,true);

if(extent !=null) {
	extent.flush();
}

}


public String takeScreenshot(WebDriver driver,String methodName) {
	String fileName = getScreenshotName(methodName);
	String 	directory = System.getProperty("user.dir") +"/screenshots/";
	new File(directory).mkdirs();
	String path = directory + fileName;
	
	try {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(path));
		System.out.println("***************************");
		System.out.println("Screeshot stored at" + path);
		System.out.println("***************************");
	}catch(Exception e) {
		e.printStackTrace();
	}
	return path;
}


public static String getScreenshotName(String methodName) {
	Date d = new Date();
	String fileName = methodName + "_" + d.toString().replace(":","_").replace(" ","_") +".png";
	return fileName;	
}





}
