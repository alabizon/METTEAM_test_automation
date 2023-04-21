package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class VerifyAccreditation extends CommonMethods {
	
	public static String AccreditationCode;
	public static String FieldContent;

	@Then("Find {string} by entering Accreditation Code and click Find button")
	public void find_by_entering_Accreditation_Code_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		AccreditationCode=ExcelUtility.getCellData(Constants.ACCREDITATION_CELL, 0);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(AccreditationCode).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
	    }
	
	@Then("Verify Code is Code")
	public void verify_Code_is_Code() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addAccreditationWindowElements.accredCode);
		Assert.assertEquals(AccreditationCode, FieldContent);
		
	}
	
	@Then("Verify Type is {string}")
	public void verify_Type_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAccreditationWindowElements.accredType);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Description is {string}")
	public void verify_Description_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAccreditationWindowElements.accredDescription);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Start_Date is {string}")
	public void verify_Start_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAccreditationWindowElements.accredStartDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify End_Date is {string}")
	public void verify_End_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAccreditationWindowElements.accredEndDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
}
		
		
	
	

