package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.PageInitializer;

public class CommonMethods extends PageInitializer {
	
	/**
	 * Use this method in need of clicking on a WebElement by Selenium WebDriver.
	 * 
	 * @param element Pass the desired WebElement to be clicked.
	 */
	public static void click(WebElement element) {
		element.click();
		
	}
	
	/**
	 * Use this method in need of double clicking on a WebElement by selenium WebDriver.
	 * @param element Pass the desired WebElement to be clicked two times.
	 */
	public static void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
		
	}
	
	/**
	 * Use this method for drag and drop of WebElement by Selenium WebDriver.
	 * 
	 * @param int1 - xOffset, int2 - yOffset.
	 */
	public static void dragAndDrop(WebElement element, int int1, int int2) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, int1, int2).build().perform();
	}
	
	/**
	 * Use this method in need of right-clicking on a WebElement by selenium WebDriver.
	 * @param element Pass the desired WebElement to be right-clicked times.
	 */
	public static void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
		
	}
		
	/**
	 * Use this method in need to enter value to a text box through Selenium
	 * WebDriver.
	 * 
	 * @param element Pass the element to which the text needs to be entered.
	 * @param value   Pass the desired text/value in the second parameter.
	 */
	public static void sendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
		
	}
	
	/**
	 * Use this method in need of entering keyboard keys into a WebElement by
	 * Selenium WebDriver.
	 * 
	 * @param element     Pass the element to which the key needs to be entered.
	 * @param keyboardKey Pass the desired keyboardKey to be entered to an element.
	 */
	public static void sendKeys(WebElement element, Keys keyboardKey) {
		element.sendKeys(keyboardKey);
		
	}
	
	/**
	 * Use this method in need of retrieving the text of an element through Selenium
	 * WebDriver.
	 * 
	 * @param <element> Pass the element from which the text to be retrieved.
	 * @return This method returns a string object.
	 */
	public static String getText(WebElement element) {
		return element.getText();
		
	}
	
	/**
	 * Use this method in need of retrieving the text from the text field through Selenium
	 * WebDriver.
	 * 
	 * @param <element> Pass the element from which the text to be retrieved.
	 * @return This method returns a content of the text field.
	 */
	public static String getAttribute(WebElement element) {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return element.getAttribute("value");
		
	}
		
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * VisibleText.
	 * 
	 * @param dropDownElement Pass the WebElement of the desired dropDown.
	 * @param ValueOfDropDown Pass the Visible text of DropDown to be selected.
	 */
	public static void selectDropDownValue(String VisibleTextOfDD, WebElement dropDownWebEl) {
		Select select = new Select(dropDownWebEl);
		select.selectByVisibleText(VisibleTextOfDD);
		
	}
	
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * Value.
	 * 
	 * @param dropDownElement Pass the value to be selected.
	 * @param ValueOfDropDown Pass the WebElement of the dropDown.
	 */
	public static void selectDropDownValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	
	/**
	 * Use this over loaded method in need of selecting an element of dropDown by
	 * index.
	 * 
	 * @param dropDownElement      WebElement of the dropDown.
	 * @param indexOfDropDownValue Pass the index
	 */
	public static void selectDropDownValue(WebElement dropDownElement, int index) {
		Select select = new Select(dropDownElement);
		select.selectByIndex(index);
		
	}

	/**
	 * This method will determine if element is present on UI or not.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
		
	}
	
	/**
	 * This method will determine if the element is enabled or disabled.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementEnabled(WebElement element) {
		try {
			return (element.isDisplayed() && element.isEnabled());
		} catch (Exception e) {
			return false;
		}
		
	}
	
	/**
	 * This method will determine if the checkbox is checked or unchecked.
	 * 
	 * @param element
	 * @return
	 */
	public static boolean isElementChecked(WebElement element) {
		try {
			return (element.isDisplayed() && element.isSelected());
		} catch (Exception e) {
			return false;
		}
		
	}
	
	/**
	 * This method will wait until element becomes clickable
	 * 
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	/**
	 * explicitly wait 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		
	}
	
	/**
	 * Wait for visibility element
	 * @param element
	 */
	public static void  waitForVisib(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	/**
	 * Method that will take a screenshot and store with name in specified location with .png extension
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName +getTimeStamp()+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return bytes;
		
	}
	
	/**
	 * This method will generate timeStamp
	 * @return
	 */
	public static String getTimeStamp() {
		
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
		return sdf.format(date);
		
	}
	
	/**
	 * Use this method to pass date as a string. You can concatenate with any String
	 * and get unique name
	 */
	public static String getDateAsString() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateAsString = formatter.format(ts).toString();
		dateAsString = dateAsString.replaceAll("[^A-Za-z0-9]", "");
		return dateAsString;
		
	}
	
	/**
	   * This Method returns today's date in the "MM/dd/yyyy" format 
	   */
	public static String getTodayDate() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String dateAsString = formatter.format(ts).toString();
		return dateAsString;
		
   }
	
	/**
	   * This Method returns date which is 12-months from today's date in the "MM/dd/yyyy" format 
	   */
	public static String getDateYearFromToday() {
		// Get today's date
        LocalDate today = LocalDate.now();

        // Add 12 months to today's date
        LocalDate datePlus12Months = today.plusMonths(12);

        // Format the date using "MM/dd/yyyy" pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = datePlus12Months.format(formatter);
        return formattedDate;
		
  }
	
	/**
	   * This Method returns date which is 14-days from today's date in the "MM/dd/yyyy" format 
	   */
	public static String getDate14DaysFromToday() {
		// Get today's date
       LocalDate today = LocalDate.now();

       // Add 12 months to today's date
       LocalDate datePlus14Days = today.plusDays(14);

       // Format the date using "MM/dd/yyyy" pattern
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       String formattedDate = datePlus14Days.format(formatter);
       return formattedDate;
		
 }
	
	/**
	   * This Method returns date which is 7-days from today's date in the "MM/dd/yyyy" format 
	   */
	public static String getDate7DaysFromToday() {
		// Get today's date
      LocalDate today = LocalDate.now();

      // Add 12 months to today's date
      LocalDate datePlus7Days = today.plusDays(7);

      // Format the date using "MM/dd/yyyy" pattern
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
      String formattedDate = datePlus7Days.format(formatter);
      return formattedDate;
		
}
	
	/**
	   * This Method returns date which is 3-days from today's date in the "MM/dd/yyyy" format 
	   */
	public static String getDate3DaysFromToday() {
		// Get today's date
     LocalDate today = LocalDate.now();

     // Add 12 months to today's date
     LocalDate datePlus3Days = today.plusDays(3);

     // Format the date using "MM/dd/yyyy" pattern
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
     String formattedDate = datePlus3Days.format(formatter);
     return formattedDate;
		
}
	
	/**
	 * Use this method to select a checkbox value
	 */
	public static void selectCheckbox(List<WebElement> checkboxList, String attribute, String value) {
		for (WebElement checkbox : checkboxList) {
			if (checkbox.isEnabled()) {
				String checkboxText = checkbox.getAttribute(attribute);
				if (checkboxText.equals(value)) {
					checkbox.click();
					break;
				}
			}
		}
		
	}
	
	/**
	 * Use this method to select a drop down value from a ServiceNow drop down menu
	 * when Select class will not work. 
	 *     NOTE: Before using, first you must click on the drop down, 
	 *     then store elements in a list
	 */
	public static void selectValueFromBootStrapDropDown(List<WebElement> values, String value) {

		for (WebElement dropDownValues : values) {

			if (dropDownValues.getText().contentEquals(value)) {
				dropDownValues.click();
				break;
			}
		}

	}
	
	/**
	 *by WebElement switch
	 * @param iFrame
	 */
	public static void swithToFrame(WebElement iFrame) {
		try {
			driver.switchTo().frame(iFrame);
			
		}catch(NoSuchFrameException  e){
			e.printStackTrace();
		}
	}
	
	/**
	 * ByIndex switch
	 * @param frameIndex
	 */
	public static void swithToFrame(int frameIndex) {
		try {
			driver.switchTo().frame(frameIndex);
			
		}catch(NoSuchFrameException  e){
			e.printStackTrace();
		}
		
	}
	
	/**
	 * By name or Id switch
	 * @param nameOrId
	 */
	public static void swithToFrame(String  nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
			
		}catch(NoSuchFrameException  e){
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * this method will switch to child window
	 */
	public static void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	for (String window : allWindows) {
		if(!window.equals(mainWindow)) {
			driver.switchTo().window(window);
			break;
	    	}
	  	}
	
	 }
	
	/**
	 * This Method read Json File
	 */
	static String jsonFile;
	public static  String readJson(String fileName) {
		try {
			jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return jsonFile;
	}
	
	/**
	 * Use this method in need of parsing list of elements.
	 * 
	 */
	public static void parseWebElements(List<WebElement> elements) {
		
	    for (WebElement element : elements) {
	    	
	        // Do something with each element, such as getting its text or attribute values
	       String text = element.getText();
	       //String href = element.getAttribute("");
	       System.out.println("Element text: " + text);
	       //System.out.println("Element href: " + href);
	    }
	}
	
	/**
	   * This Method print from the list of elements from the list
	   * @param values
	   */
	public static void printFromTheList(List<WebElement> values) {
		for (WebElement i : values) {
			System.out.println(i.getText());
	
		}
	 
	}
	
	/**
	   * This Method do click on the button associated with a drop-down to open it 
	   * and then select value from the drop-down based on the parameter 
	   * @param values
	   */
	public static void clickThenSelectOptionFromDropdownByText(WebElement valueClick, List<WebElement> values, String value) {
		valueClick.click();
			for (WebElement dropDownValues : values) {
				if (dropDownValues.getText().equals(value)) {
					dropDownValues.click();
				break;
				}
			}
	}
	
	/**
	 * This method will de-press Remember menu button if it is pressed.
	 * @param element -- Pass the desired buttons WebElement to be de-pressed.
	 * @throws Throwable 
	 * 	 */
	
	public static void depressButton(WebElement element) throws Throwable {
		if (element.getAttribute("Class").equals("x-btn x-btn-icon-text x-btn-text-icon x-btn-pressed")) {
			element.click();
			Thread.sleep(500);
			findScreenWindowElements.ResetAllButton.click();
			Thread.sleep(500);
			findScreenWindowElements.ResetAllAlertYesButton.click();
		}
		
	}
	
	/**
	 * This method will do assertion whether field is enabled or disabled. 
	 * 	 */
		
	public static void verifyElementEnabledAssertTrue(WebElement element, String text) {
		boolean a = true;
		if(element.getAttribute("Class").equals(text)) {
			Assert.assertTrue(a);
			}
		else {
			a = false;
			Assert.assertFalse(a);
		}
	}
	
	/**
	 * This method will do "Refresh" button clicking on the active frame. 
	 * 	 */
	
	public static void refreshElement() throws Throwable {
		driver.switchTo().defaultContent();
		Actions actions = new Actions(driver);
			if(addTypeWindowElements.sizeRefreshButton.size()>1){
				Thread.sleep(1000);
				actions.click(addTypeWindowElements.refreshButton2).build().perform();
				JsCommonMethods.drawBlueBorder(addTypeWindowElements.refreshButton2);
			}
			if(addTypeWindowElements.sizeRefreshButton.size()==1) {
				Thread.sleep(1000);
				actions.click(addTypeWindowElements.refreshButton1).build().perform();
				JsCommonMethods.drawBlueBorder(addTypeWindowElements.refreshButton1);
			}
	}
	
	/**
	 * Use this method to enter search criteria and do Find by entered search criteria.
	 * 
	 * @param element           		List of elements from the find screen (parameters grid)
	 * @param frame 					Active frame
	 * @param targetElementText			Field that search will be done by
	 * @param textToEnter				Search criteria
	 */
	public static void enterTheFindCriteriaForFindScreen(List<WebElement> element, WebElement frame, String targetElementText, String textToEnter) throws Throwable {
        driver.switchTo().defaultContent();
        CommonMethods.swithToFrame(frame);
        CommonMethods.depressButton(findScreenWindowElements.RememberButton);
        for (int i = 0; i < element.size(); i++) {
            if (element.get(i).getText().equalsIgnoreCase(targetElementText)) {

                JsCommonMethods.drawRedBorder(element.get(i));
                int elementIndex = i + 4;
                WebElement searchField = element.get(elementIndex);
                Actions actions = new Actions(driver);
                actions.moveToElement(searchField).click().build().perform();
                actions.sendKeys(textToEnter).build().perform();

                    break;
                }
            }
        Thread.sleep(1000);
        CommonMethods.click(selectShipItemsWindowElements.FindButton);
        }
	
	/**
	 * This method will click element by its index
	 */
	
	public static void clickElementByIndex(List<WebElement> elements, int index) {
        if (index >= 0 && index < elements.size()) {
            WebElement element = elements.get(index);
            JsCommonMethods.drawRedBorder(element);
            element.click();
        } else {
            System.out.println("Invalid index or element not found.");
        }
    }
	
	/**
	 * This method will switch focus to the active frame. 
	 * 	 */
	
	public static void switchToLastPresentFrame() {
	      driver.switchTo().defaultContent();
	          CommonMethods.waitForVisib(frames.listFrame.get(1));

	        if (frames.listFrame.size()  > 0) {

	            int frameCount = frames.listFrame.size();

	                WebElement lastFrame = frames.listFrame.get(frameCount-1);
	                driver.switchTo().frame(lastFrame);
	            }
	    }
	
}

	