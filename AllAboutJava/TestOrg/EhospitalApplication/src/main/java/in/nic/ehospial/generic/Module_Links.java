package in.nic.ehospial.generic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ehospital.Login_Page.Objects.HomePage;

public class Module_Links extends BaseClass {
	public WebDriver driver;
	HomePage hp;
	public Map<String, WebElement> linksMap;

	public Module_Links(WebDriver driver) {
		this.driver = driver;
		hp = new HomePage(driver);
	}

	public void LeftSideLinks(List<String> linksToVisit) throws Throwable {
		switchtoLeftFrame();
		

		linksMap = new HashMap<String, WebElement>();

		for (String key : linksToVisit) {
			List<WebElement> leftlinks = hp.getAbcd();

			for (WebElement webElement : leftlinks) {
				
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
	
	
	public void LeftSideLinks2(List<String> linksToVisit) throws Throwable {
		 //use it when we are switch from right frame to Left frame
				driver.switchTo().parentFrame();
				driver.switchTo().frame(hp.getLeftframe());
				linksMap = new HashMap<String, WebElement>();

				for (String key : linksToVisit) {
					List<WebElement> leftlinks = hp.getAbcd();

					for (WebElement webElement : leftlinks) {
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
