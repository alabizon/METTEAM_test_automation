package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class VerifyContact extends CommonMethods {
	
	public static String ContactId;
	public static String FieldContent;

	@Then("Find {string} by entering Last Name and click Find button")
	public void find_by_entering_Last_Name_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ContactId=ExcelUtility.getCellData(Constants.CONTACT_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(ContactId).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	@Then("Verify Contact_ID is Contact_ID")
	public void verify_Contact_ID_is_Contact_ID() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactId);
		Assert.assertEquals(ContactId, FieldContent);
		
	}
	
	@Then("Verify First_Name is {string}")
	public void verify_First_Name_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactFirstName);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Middle_Name is {string}")
	public void verify_Middle_Name_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactMiddleName);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Last_Name is Last_Name")
	public void verify_Last_Name_is_Last_Name() {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactLastName);
		Assert.assertEquals(ContactId, FieldContent);
		
	}
	
	@Then("Verify Suffix is {string}")
	public void verify_Suffix_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactSuffix);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Fax is {string}")
	public void verify_Fax_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactFax);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Phone_{int} is {string}")
	public void verify_Phone__is(Integer int1, String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactPhone1);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Phone_Two is {string}")
	public void verify_Phone_Two_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactPhone2);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Cell_Phone is {string}")
	public void verify_Cell_Phone_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactCellPhone);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Email is {string}")
	public void verify_Email_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContactWindowElements.contactEmail1);
		Assert.assertEquals(string, FieldContent);
		
	}
	
}
		
		
	
	

