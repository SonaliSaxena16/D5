package in.nic.ehospial.generic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ehospital.Login_Page.Objects.HomePage;

public class HomeDecks {
	public WebDriver driver;
	HomePage hp;

	public HomeDecks(WebDriver driver) {
		this.driver = driver;
		hp = new HomePage(driver);
	}
 public void modules(List<String> ModuleVisit) {
	
	 
	 Map<String, WebElement> linksMap = new HashMap<String, WebElement>();
		
		for (String key : ModuleVisit) {
			List<WebElement> modules = hp.getHomdesk();
		
			for (WebElement webElement :modules ) {
				linksMap.put(webElement.getText(), webElement);
			}
			WebElement link = linksMap.get(key);
			if (link != null) {
				link.click();
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	 
 }

}

