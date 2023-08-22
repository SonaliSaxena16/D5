package in.nic.ehospial.generic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ehospital.GenerateGetterSetter.AccessConfigData;
import ehospital.Login_Page.Objects.HomePage;
import in.nic.ehospial.generic.Xls_Reader;

public class BaseClass {
	protected static long Wait_Time = 1000L;
	protected static long delay_Time = 2000L;
	protected static long LongDelay_Time = 5000L;
	public static Properties Config = null;
	static InputStream inPropFile = null;
	FileInputStream fisCache;
	OutputStream outPropFile;
	public SoftAssert softAssert = new SoftAssert();
	//public Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");
	
	public static WebDriver driver;

	HomePage hp = new HomePage(driver);
  
	
	@BeforeTest
	//@Parameters({"browser","baseurl"})
	public  void preCondition() {
		AccessConfigData user = ReadPropertyFile.loadUser();
		System.out.println(user.getBrowser());
		System.out.println(user.getBaseurl());
		System.out.println(user.getUserId());
		String browser = user.getBrowser();
		String baseurl = user.getBaseurl();
		driver = BrowserFactory.LaunchBrowser(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(baseurl);

	}


	@AfterTest
	public void postCondition() {
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("ehosfrm");
		driver.switchTo().frame("banner");

		for (int i = 0; i < 2; i++) {
			delay();

			if (i == 1) {
				driver.switchTo().defaultContent();
				switchingmultiplewindow();
			}
			driver.findElement(By.id("btnlogout")).click();
			delay();
			driver.switchTo().alert().accept();
			delay();
           }
		longDelay();
	
		driver.manage().deleteAllCookies();
		driver.quit();

	}

	
	
	public void switchingmultiplewindow() {
		
		try {
		Set<String> wl1 = driver.getWindowHandles();
		Iterator<String> itr = wl1.iterator();
		String pw = itr.next();
		System.out.println("Window  parent id is"+ pw);
		String cw = itr.next();
		System.out.println("Window  child id is"+cw);
		driver.switchTo().window(pw);
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	}
	public  void switchToNewWindow() {
		
		/*String childWindow;
		childWindow = driver.getWindowHandles().toArray()[1].toString();
		driver.switchTo().defaultContent();
		 driver.switchTo().window(childWindow);*/
		
		try {
			Set<String> wl = driver.getWindowHandles();
			Iterator<String> itr = wl.iterator();
			String pw = itr.next();
			System.out.println("Window  parent id is"+ pw);
			String cw = itr.next();
			System.out.println("Window  child id is"+cw);
			driver.switchTo().window(cw);
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
}

	public  void switchtoRightFrame() {
		try {
			driver.switchTo().parentFrame();
			driver.switchTo().frame(hp.getRightframe());
			
		} catch (Exception e) {
			System.out.println("unable to switch to right frame"+e.getClass());
		}
		
	}
	
	HomePage hp1;
	public  void switchtoRightFrame(HomePage hp) {
		try {
			
			this.hp1 =hp;
			Thread.sleep(5);
			driver.switchTo().parentFrame();
			driver.switchTo().frame(hp1.getRightframe());
			
		} catch (Exception e) {
			System.out.println("unable to switch to right frame"+e.getClass());
		}
		
	}
	
	public  void switchtoLeftFrame() {
		delay();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(hp.getMainiframe());

		driver.switchTo().frame(hp.getLeftframe());

	}

	public void switchtoinnerRightFrame() {
		delay();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(hp.getMainiframe());


		driver.switchTo().frame(hp.getRightframe());

	}
	
	public void switchtoHeaderFrame() {
		delay();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(hp.getMainiframe());


		driver.switchTo().frame(hp.getHeaderframe());

	}


	public void scrollIntoViewByJS(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public WebDriverWait waitTo() {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		return wait;
	}

	public void delay() {
		try {
			Thread.sleep(delay_Time);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public void longDelay() {
		try {
			Thread.sleep(LongDelay_Time);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public boolean isElementVisible(final WebElement ele) {
		long start = System.currentTimeMillis();
		while (true) {
			if (ele.isDisplayed()) {
				return true;
			} else {
				if (System.currentTimeMillis() - start >= Wait_Time) {
					throw new Error("Timeout reached element not visiblie");
				} else {
					try {
						synchronized (this) {
							wait(200);
						}
					} catch (final InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public List<String> getTextForElementfromList(List<WebElement> element) {
	//public List<String> getTextForElementfromList(String element) {
		//List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		List<WebElement> listItems = element ;
		List<String> listtexts = new ArrayList<String>();
		for (WebElement item : listItems) {

			item.getText();
			listtexts.add(item.getText());
		}
		return listtexts;
	}

	public List<WebElement> getElementsList(String element) {
		List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		return listItems;
	}

	public WebElement waitFindElement(WebElement parentElement, By by) {
		WebElement ele = null;
		if (parentElement == null) {
			ele = driver.findElement(by);
		} else {
			ele = parentElement.findElement(by);
		}
		isElementVisible(ele);
		return ele;
	}

	public List<WebElement> waitFindElements(WebElement parentElement, By by) {
		if (parentElement == null) {
			return driver.findElements(by);
		}
		return parentElement.findElements(by);
	}

	public WebElement findVisibleElement(WebDriver driver, By by) {
		WebElement ele = driver.findElement(by);
		isElementVisible(ele);
		return ele;
	}

	public WebElement findVisibleElement(WebElement wEle, By by) {
		WebElement ele = wEle.findElement(by);
		isElementVisible(ele);
		return ele;
	}

	public List<WebElement> waitFindElements(WebDriver driver, By by) {
		return driver.findElements(by);
	}

	public boolean isElementEnabled(WebElement ele) {
		boolean clickable = true;
		String attr = ele.getAttribute("class");
		if ((attr != null) && (attr.indexOf("disabled") > -1)) {
			clickable = false;
		}
		return clickable;
	}

	public WebElement getVisibleDropDownParentElement(String parent) {
		List<WebElement> comboListParentElements = waitFindElements(driver, By.cssSelector(parent));
		for (WebElement el : comboListParentElements) {
			if (el.isDisplayed()) {
				return el;
			}
		}
		return null;
	}

	public void selectElementByIndex(String element, int idx) {
		List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		listItems.get(idx).click();
	}

	public void selectElementByDesc(String element, String desc) {
		List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		for (WebElement item : listItems) {

			if (item.getText().equalsIgnoreCase(desc)) {
				item.click();
				delay();
				return;
			}
		}
	}

	//public void verifyTextForElementfromList(String element, String itemtext) {
	public void verifyTextForElementfromList(List<WebElement> element, String itemtext) {
		List<WebElement> listItems = element;
		for (WebElement item : listItems) {
			item.getText().equalsIgnoreCase(itemtext);
		}
	}

	//public void selectDropdownVisibleElement(String selectElement, String desc, WebElement Element) {
	public void selectDropdownVisibleElement(WebElement Element, String desc ) {	
	      Select select = new Select(Element);
		//Select select = new Select(driver.findElement(By.cssSelector(selectElement)));
		select.selectByVisibleText(desc);
	}

	public void iFillInText(WebElement obj, String text) {
		if (!isElementVisible(obj)) {
			return;
		}
		obj.clear();
		if ("".equals(text)) {
			return;
		}
		obj.sendKeys(text);
	}

	public void clickElement(WebElement element) {
		if (isElementVisible(element)) {
			element.click();
		}
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		 * driver.findElement(by).click();
		 */
	}

	public void iWillWaitToSeeElement(WebElement element, String text) {
		if (isElementVisible(element)) {
			Assert.assertTrue(element.isDisplayed());
		}
	}

	public void verifyTextForElement(WebElement ele, String text) {
		if (isElementVisible(ele)) {
			Assert.assertEquals(ele.getText(), text);
		}
	}

	public String getTextForElement(WebElement ele) {
		if (isElementVisible(ele)) {
			ele.getText();
		}
		return ele.getText();
	}

	public void verifyElementCount(String element, int count) {
		List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		int countelement = listItems.size();
		delay();
		Assert.assertEquals(countelement, count);
	}

	//public int getElementCount(String element) {
	public int getElementCount(List<WebElement> element) {
	    List<WebElement> listItems = element;
		int countelement = listItems.size();
		return countelement;
	}

	public void swithToFrame(String element) {
		driver.switchTo().frame(driver.findElement(By.xpath(element)));
	}

	public void switchBacktoOldWindow() {
		try {
			String parentWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			driver.close();
			for (String windowHandle : handles) {
				if (!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
				}
			}
			delay();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void verifyTextNotPresentForElementFromList(String element, String itemtext) {
		List<WebElement> listItems = driver.findElements(By.cssSelector(element));
		for (WebElement item : listItems) {
			Assert.assertFalse(item.getText().equalsIgnoreCase(itemtext));
		}
	}

	public void verifyTextForElementWithMultipleSpaces(WebElement ele, String text) {
		if (isElementVisible(ele)) {
			Assert.assertEquals(ele.getText().replaceAll("\\s+", " "), text);
		}
	}

	public void elementInformation(WebElement ele) {
		System.out.println("  ");
		System.out.println("************************************");
		System.out.println("tagname " + ele.getTagName());
		System.out.println("text " + ele.getText());
		System.out.println("isdisplayed " + ele.isDisplayed());
		System.out.println("isenabled " + ele.isEnabled());
		System.out.println("value " + ele.getAttribute("value"));
		System.out.println("color " + ele.getAttribute("color"));
		System.out.println("text-align" + ele.getAttribute("text-align"));
		System.out.println("class" + ele.getAttribute("class"));
		System.out.println("class" + ele.getAttribute("style"));
		System.out.println("************************************");
	}

	public void verifyTextForElementFromListByXpath(String element, String itemtext) {
		List<WebElement> listItems = driver.findElements(By.xpath(element));
		for (WebElement item : listItems) {
			item.getText().equalsIgnoreCase(itemtext);
			/*
			 * if (item.getText().equalsIgnoreCase(itemtext)) { try {
			 * Assert.assertTrue(item.getText().equalsIgnoreCase(itemtext)); } catch
			 * (Exception e) {
			 * 
			 * } }
			 */
		}
	}

	public void selectElementByTextDescByXpath(String element, String desc) {
		List<WebElement> listItems = driver.findElements(By.xpath(element));
		for (WebElement item : listItems) {
			if (item.getText().equalsIgnoreCase(desc)) {
				item.click();
				delay();
				return;
			}
		}
	}

	public void verifyAttributeForElementFromListByXpath(String element, String attribute, String itemtext) {
		List<WebElement> listItems = driver.findElements(By.xpath(element));
		for (WebElement item : listItems) {
			item.getAttribute(attribute).equalsIgnoreCase(itemtext);
		}
	}

//public void moveToTheElement(WebElement toElement) {
//	actionEvent.moveToElement(toElement).perform();
//}
//
public void moveToTheElementAndClick(WebElement moveToElement) {
	WebElement button = moveToElement;
	
	Actions clickAction = new Actions(driver).click(button);
	
	clickAction.build().perform();

//	actionEvent.moveToElement(moveToElement).perform();
//	clickToElement.click();
}
//
//public void moveToTheElementAndRightClick(WebElement moveToElementToRightClick) {
//	actionEvent.contextClick(moveToElementToRightClick).build().perform();
//}

	public void clickAllElementofAlistbyXpath(String xpathElement) {
		List<WebElement> listItems = driver.findElements(By.xpath(xpathElement));
		for (WebElement item : listItems) {
			item.click();
		}
	}

	public void verifyElementAttributeContainsValue(WebElement element, String attribute, String contains) {
		String attr = element.getAttribute(attribute);
		Assert.assertTrue(attr.contains(contains));
	}

	public boolean isElementPresentOnPage(By locatorKey) {
		boolean value = true;
		try {
			driver.findElement(locatorKey);

		} catch (org.openqa.selenium.NoSuchElementException e) {
			value = false;
		}
		return value;
	}

	public boolean isElementNotPresentOnPage(String ele) {
		boolean value = false;
		try {
			driver.findElement(By.cssSelector(ele));
		} catch (Exception e) {
			value = true;
		}
		return value;
	}

	public boolean isElementNotPresentOnPage(By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void verifyarraylist(List<String> requiredcombolisttext, List<String> actualcombolisttext) {
		Assert.assertEquals(requiredcombolisttext, actualcombolisttext);
	}

	public boolean existsElement(String element) {
		try {
			driver.findElement(By.cssSelector(element));
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}

	public void switchToFrameByNameOrId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	public void iWillWaitToSee(By locator) {
		try {
			waitTo().until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void iVerifyTextFromListOfElement(By locator, String text) {
		List<WebElement> listItems = driver.findElements(locator);
		String value = null;
		for (WebElement item : listItems) {
			System.out.println(item.getText());
			if (item.getText().trim().equals(text)) {
				value = item.getText().trim();
			}
		}
		Assert.assertEquals(text.trim(), value.trim());
	}

	public void clickSingleElementFromList(By locator, String text) {
		List<WebElement> element = driver.findElements(locator);
		for (WebElement ele : element) {
			if (ele.getText().trim().equals(text)) {
				ele.click();
			}
		}
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void VerifyElementCssProperty(By by, String property) {
		WebElement ele = driver.findElement(by);
		String allignment = ele.getCssValue(property);
		Assert.assertEquals("center", allignment);
	}

//public String createRandomName(String name) {
//	return name + RandomStringUtils.randomAlphabetic(8);
//}
//
//public String createRandomNumber(int num) {
//	return RandomStringUtils.randomNumeric(num);
//}

	public void validateDateFormat(String format, String dateToValdate) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		formatter.setLenient(false);
		formatter.parse(dateToValdate);
	}

	public String CurrentDateTime() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public String getTheCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void HandleAlert() {
		
		try {
			if (isAlertPresent() == true) {
				delay();
				driver.switchTo().alert().accept();
			}
		} catch (NoAlertPresentException e) {
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
public void SwitchtoParentWindow() throws InterruptedException {
	delay();
	String parentWindow;
	parentWindow = driver.getWindowHandles().toArray()[0].toString();
	driver.switchTo().window(parentWindow);
	
}
public boolean ISDropdownisMultiple(WebElement Element) {
	delay();
	Select select = new Select(Element);
	boolean Dropdown = select.isMultiple();
	return Dropdown;
	}

public void selectDropdownVisibleElementWithCondition(WebElement Element, String Textfirst, String Text ) {	
    Select select = new Select(Element);
	List<WebElement> DropdwonOption = select.getOptions();
	for(int i=0;i<DropdwonOption.size();i++) {
	if(DropdwonOption.get(i).getText().equalsIgnoreCase(Textfirst)) {
		DropdwonOption.get(i).click();
		break;
		
	}else if(DropdwonOption.get(i).getText().equalsIgnoreCase(Text)) {
		DropdwonOption.get(i).click();
		break;
		//Select select1 = new Select(Element);
		//select1.selectByIndex(2);
	}

}
}
public void selectDropdownVisibleElementwithIndexValue(WebElement Element,int i ) {	
	Select select1 = new Select(Element);
	select1.selectByIndex(i);
}

public  void switchtoPrintbackFrame() {
	delay();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(hp.getMainiframe());

	driver.switchTo().frame(hp.getRightframe());
	
	driver.switchTo().frame(hp.getPrintbackframe());

}

public  void switchtoPrintbackFrameforBillGenerationRecepit() {
	delay();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(hp.getMainiframe());

	driver.switchTo().frame(hp.getRightframe());
	
	driver.switchTo().frame(hp.getPrintbackframeforBillGenerationRecepit());

}



public  void switchtoPrintPageFrame() {
	delay();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(hp.getMainiframe());

	driver.switchTo().frame(hp.getRightframe());
	
	driver.switchTo().frame(hp.getPrintPageframe());

}
public void switchtoOrderEntryFrame() {
	delay();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(hp.getMainiframe());

	driver.switchTo().frame(hp.getRightframe());

	driver.switchTo().frame(hp.getOrderEntryFrame());
	
}

public void switchtoLabConsoildatedReportOrderEntryFrame() {
	delay();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(hp.getMainiframe());

	driver.switchTo().frame(hp.getRightframe());

	driver.switchTo().frame(hp.getLabConsoildatedReportOrderEntryframe());
	
}


public String GetAlertText() {
	
	Alert alert = driver.switchTo().alert();
	String ActualMessage = alert.getText();
	return ActualMessage;
}


public int getElementCountafterRemovelastIndex(List<WebElement> element) {
	List<WebElement> listItems = element;
	int countelement = listItems.size() -1;
	listItems.remove(countelement);
	return countelement;
}

public boolean isElementPresent(WebElement Element) {
	 try {
	    	WebElement closepopup = Element;
	    	closepopup.isDisplayed();
	        return true;
	    } // try
	    catch (Exception e) {
	        return false;
	    }

}



}

