
package in.nic.ehospial.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
public class BrowserFactory  {
	public static WebDriver LaunchBrowser (String browserName)
	{

	WebDriver driver=null ;
	
	//For Setting Up Jenkins
	if(System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
		
		browserName = System.getenv("browser");
		
		
	}
	
	else if (browserName.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "./lib Files/chromedriver.exe");
	driver = new ChromeDriver();
	         //  System.out.println("CHROME LAUNCHED");
	Reporter.log("chrome launched",true);
	}


	else if (browserName.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "./lib Files/geckodriver.exe");
	driver = new FirefoxDriver();
	System.out.println("FIREFOX LAUNCHED");
	Reporter.log("firefox launched",true);


	}

	return driver;
	}
	}



