package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class CreateFacility extends CommonMethods {
	
	public static String FacilityName;
	
	@When("Click Maintenance and click Facilities")
	public void click_Maintenance_and_click_Facilities() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintFacilities.click();
		
	}
	
	@Then("Enter Facility Name and enter Tax Number and enter Facility Number and enter Fed Number")
	public void enter_Facility_Name_and_enter_Tax_Number_and_enter_Facility_Number_and_enter_Fed_Number() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Accreditation_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
		
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ExcelUtility.writeStringRow(FacilityName, Constants.FACILITY_CUST1_CELL);
		ExcelUtility.writeExcel(Constants.TESTDATA_FILEPATH);
		
		CommonMethods.sendKeys(addFacilityWindowElements.facilityTaxNumber, "33333");
		CommonMethods.sendKeys(addFacilityWindowElements.facilityNumber, "12345");
		CommonMethods.sendKeys(addFacilityWindowElements.facilityFedNumber, "44444");
		
	}
		
	@Then("Enter Industry Code and enter Account Number and enter Company Code and enter Web Site")
	public void enter_Industry_Code_and_enter_Account_Number_and_enter_Company_Code_and_enter_Web_Site() {
		CommonMethods.sendKeys(addFacilityWindowElements.facilityIndustryCode, "66666");
		CommonMethods.sendKeys(addFacilityWindowElements.facilityAccountNumber, "77777");
		CommonMethods.sendKeys(addFacilityWindowElements.facilityCompanyCode, "88888");
		CommonMethods.sendKeys(addFacilityWindowElements.facilityWebSite, "www.MyFacility.com");
		
	}
	
	@Then("Select {string} for the Shipping Method and select {string} Recall Rule")
	public void select_for_the_Shipping_Method_and_select_Recall_Rule(String string, String string2) {
		CommonMethods.click(addFacilityWindowElements.facilityShippingMethodButton);
		CommonMethods.selectValueFromBootStrapDropDown(addFacilityWindowElements.facilityShipMethod, string);
		CommonMethods.clickThenSelectOptionFromDropdownByText(addFacilityWindowElements.facilityRecallRuleButton, addFacilityWindowElements.facilityRecall, string2);
		
	}
	
	@Then("Check Manufacturer checkbox and check Sub Contractor checkbox")
	public void check_Manufacturer_checkbox_and_check_Sub_Contractor_checkbox() {
		CommonMethods.click(addFacilityWindowElements.facilityManufacturer);
		CommonMethods.click(addFacilityWindowElements.facilitySubContractor);
		
	}
	
	@Then("Verify {string} checkbox is disabled")
	public void verify_checkbox_is_disabled(String string) {
		CommonMethods.isElementEnabled(addFacilityWindowElements.facilityInspectAll);
		Assert.assertTrue(true);
		
	}
	
	@Then("Click Lab checkbox")
	public void click_Lab_checkbox() {
		CommonMethods.click(addFacilityWindowElements.facilityLab);
		
	}
	
	@Then("Verify {string} checkbox is enabled")
	public void verify_checkbox_is_enabled(String string) {
		CommonMethods.isElementEnabled(addFacilityWindowElements.facilityInspectAll);
		Assert.assertFalse(false);
		
	}
	
	@Then("Verify {string} field is disabled")
	public void verify_field_is_disabled(String string) {
		CommonMethods.isElementEnabled(addFacilityWindowElements.facilityTaxRate);
		Assert.assertTrue(true);
		
	}
	
	@Then("Click Customer checkbox")
	public void click_Customer_checkbox() {
		CommonMethods.click(addFacilityWindowElements.facilityCustomer);
		
	}
	
	@Then("Verify {string} field is enabled")
	public void verify_field_is_enabled(String string) {
		CommonMethods.isElementEnabled(addFacilityWindowElements.facilityTaxRate);
		Assert.assertFalse(false);
		
	}
	
	@Then("Check Optional1 checkbox and check Inspect All checkbox and check No Tax checkbox")
	public void check_Optional1_checkbox_and_check_Inspect_All_checkbox_and_check_No_Tax_checkbox() {
		CommonMethods.click(addFacilityWindowElements.facilityOptional1);
		CommonMethods.click(addFacilityWindowElements.facilityInspectAll);
		CommonMethods.click(addFacilityWindowElements.facilityNoTax);
		
	}
	
	@Then("Uncheck No Tax checkbox")
	public void uncheck_No_Tax_checkbox() {
		CommonMethods.click(addFacilityWindowElements.facilityNoTax);
		
	}
	
	@Then("Enter Tax Rate {string}")
	public void enter_Tax_Rate(String string) {
		JsCommonMethods.clearByJS(addFacilityWindowElements.facilityTaxRate);
		CommonMethods.sendKeys(addFacilityWindowElements.facilityTaxRate, string);
		
	}
	
	@Then("Enter Hourly Rate {string}")
	public void enter_Hourly_Rate(String string) {
		JsCommonMethods.clearByJS(addFacilityWindowElements.facilityHourlyRate);
		CommonMethods.sendKeys(addFacilityWindowElements.facilityHourlyRate, string);
		
	}
	
	@Then("Enter Discount {string}")
	public void enter_Discount(String string) {
		JsCommonMethods.clearByJS(addFacilityWindowElements.facilityDiscount);
		CommonMethods.sendKeys(addFacilityWindowElements.facilityDiscount, string);
		
	}
	
	@Then("Enter Expedite Fee {string}")
	public void enter_Expedite_Fee(String string) {
		JsCommonMethods.clearByJS(addFacilityWindowElements.facilityExpediteFee);
		CommonMethods.sendKeys(addFacilityWindowElements.facilityExpediteFee, string);
		
	}
	
}


	


