package Report;

import java.io.File;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	 private static ExtentReports extent;
	 public static ExtentHtmlReporter htmlReporter;
	 
	 public static ExtentReports setExtent() {
		 
		 String fileName = getReportName();
		 
		 String directory = System.getProperty("user.dir") + "/reports/";
		 new File(directory).mkdirs();
		 String path = directory + fileName;	
		 ExtentHtmlReporter  htmlReporter = new ExtentHtmlReporter(path);
		  htmlReporter.config().setDocumentTitle("utf-8");
		  htmlReporter.config().setDocumentTitle("Automation Reports"); 
		  htmlReporter.config().setReportName("End to End Testing"); 
		  htmlReporter.config().setTheme(Theme.DARK);
		  
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  
		  extent.setSystemInfo("Organization", "E-Hospital");
		  extent.setSystemInfo("Host name", "localhost");
		  extent.setSystemInfo("OS", "Window 10");
		  extent.setSystemInfo("Environemnt", "QA");
		  extent.setSystemInfo("user", "Jayant Rai");
		  extent.setSystemInfo("Browser", "Firefox");
		
		  return extent;

	
}
	 
	public static String getReportName() {
		
		Date d = new Date();
		String fileName = "AutomationReport_" + d.toString().replace(":","_").replace(" ","_") +".html";
		return fileName;
		
		
	}
	 
	 
}