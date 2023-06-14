package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class VerifyFacility extends CommonMethods {
	
	public static String FacilityName;
	public static String FieldContent;
	public static Boolean CheckboxState;
	
	@Then("Find {string} by entering Facility Name and click Find button")
	public void find_by_entering_Facility_Name_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		FacilityName=ExcelUtility.getCellData(Constants.FACILITY_CUST1_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(FacilityName).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
		
	@Then("Verify Facility_Name is Facility Name")
	public void verify_Facility_Name_is_Facility_Name() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityName);
		Assert.assertEquals(FieldContent, FacilityName);
		
	}
	
	@Then("Verify Tax Number is {string}")
	public void verify_Tax_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityTaxNumber);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Facility Number is {string}")
	public void verify_Facility_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityNumber);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Fed Number is {string}")
	public void verify_Fed_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityFedNumber);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Industry Code is {string}")
	public void verify_Industry_Code_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityIndustryCode);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Account Number is {string}")
	public void verify_Account_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityAccountNumber);
		Assert.assertEquals(FieldContent, string);
	}
	
	@Then("Verify Company Code is {string}")
	public void verify_Company_Code_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityCompanyCode);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Shipping Method is {string}")
	public void verify_Shipping_Method_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityShippingMethod);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Facility Web Site is {string}")
	public void verify_Facility_Web_Site_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityWebSite);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Recall Rule is {string}")
	public void verify_Recall_Rule_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityRecallRule);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Tax Rate is {string}")
	public void verify_Tax_Rate_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityTaxRate);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Hourly Rate is {string}")
	public void verify_Hourly_Rate_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityHourlyRate);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Discount is {string}")
	public void verify_Discount_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityDiscount);
		Assert.assertEquals(FieldContent, string);
	}

	@Then("Verify Expedite Fee is {string}")
	public void verify_Expedite_Fee_is(String string) {
		FieldContent = CommonMethods.getAttribute(addFacilityWindowElements.facilityExpediteFee);
		Assert.assertEquals(FieldContent, string);
	}
	
	@Then("Verify Customet checkbox is checked")
	public void verify_Customet_checkbox_is_checked() {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilityCustomer);
		Assert.assertTrue(true);
	}

	@Then("Verify Inspect All checkbox is checked")
	public void verify_Inspect_All_checkbox_is_checked() {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilityInspectAll);
		Assert.assertTrue(true);
	}

	@Then("Verify Manufacturer checkbox is checked")
	public void verify_Manufacturer_checkbox_is_checked() {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilityManufacturer);
		Assert.assertTrue(true);
	}

	@Then("Verify Sub Contractor checkbox is checked")
	public void verify_Sub_Contractor_checkbox_is_checked() {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilitySubContractor);
		Assert.assertTrue(true);
	}

	@Then("Verify Lab checkbox is checked")
	public void verify_Lab_checkbox_is_checked() {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilityLab);
		Assert.assertTrue(true);
	}

	@Then("Verify Optional {int} checkbox is checked")
	public void verify_Optional_checkbox_is_checked(Integer int1) {
		CheckboxState = CommonMethods.isElementChecked(addFacilityWindowElements.facilityOptional1);
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	


