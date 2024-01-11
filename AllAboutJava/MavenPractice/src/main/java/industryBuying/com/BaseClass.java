package industryBuying.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	
	public  WebDriver driver;
	
	public WebDriverWait waitTo() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait;
	}
	
	public void setUp() throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "E:\\Repo\\D5\\AllAboutJava\\MavenPractice\\ExeFiles\\geckodriver.exe");
	
	 driver = new FirefoxDriver();
	 
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	// Thread.sleep(5000);	
	
	driver.get("http://devopsmcfinance.com/misangular/#/login");
		
	driver.manage().window().maximize();
	}

}
