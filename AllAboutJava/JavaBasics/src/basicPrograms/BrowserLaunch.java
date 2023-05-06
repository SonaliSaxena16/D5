package basicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		/*String key = "webdriver.chrome.driver";
		String vaule = "D:\\J Eclipse\\LaucnhBrowser\\ExeFiles\\chromedriver.exe";		
		
		System.setProperty("key", "value");
		*/
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\J Eclipse\\LaucnhBrowser\\ExeFiles\\chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://www.selenium.dev/downloads/");
		cd.manage().window().maximize();
		cd.quit();
		
		
	}

}
