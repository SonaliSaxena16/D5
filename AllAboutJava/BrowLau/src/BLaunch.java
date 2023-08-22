import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Repo\\AllAboutJava\\MavenPractice\\ExeFiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		driver.quit();
	}

}
