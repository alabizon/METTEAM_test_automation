package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class ReceiveAssets extends CommonMethods {
	
	public static String FieldContent;
	
	@When("Click Workflow and click Receiving")
	public void click_Workflow_and_click_Receiving() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnWorkflow);
		Thread.sleep(1000);
		CommonMethods.click(workflowSubMenuElements.wflowReceiving);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		
	}
	
	@Then("Enter {string} into Barcode search criteria and click Find button")
	public void enter_into_Barcode_search_criteria_and_click_Find_button(String string) throws Throwable {
		CommonMethods.enterTheFindCriteriaForFindScreen(findScreenWindowElements.listElementsFromTheFindScreen, frames.Frame1, "Barcode", string);
		
	}
	
	@Then("Double-click search result")
	public void double_click_search_result() throws Throwable {
		CommonMethods.doubleClick(findScreenWindowElements.FirstSearchResult);
		
	}
		
	@Then("Click Search criteria and enter {string} into Barcode search criteria and click Find button")
	public void click_Search_criteria_and_enter_into_Barcode_search_criteria_and_click_Find_button(String string) throws Throwable{
		CommonMethods.enterTheFindCriteriaForFindScreen(findScreenWindowElements.listElementsFromTheFindScreen, frames.Frame1, "Barcode", string);
		
	}

	@Then("Double-click search result again")
	public void double_click_search_result_again() throws Throwable {
		Thread.sleep(1000);
		CommonMethods.doubleClick(findScreenWindowElements.FirstSearchResult);
		
	}
	
	@Then("Click OK button on the Find Assets to Receive screen")
	public void click_OK_button_on_the_Find_Assets_to_Receive_screen() {
		CommonMethods.click(findScreenWindowElements.OkButton);
		
	}
	
	@Then("Click Department elipsis button and select {string}")
	public void click_Department_elipsis_button_and_select(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(receivingWindowElements.elipsisButtonDepartment);
		
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.enterTheFindCriteriaForFindScreen(findScreenWindowElements.listElementsFromTheFindScreen, frames.Frame3, "Facility Name", "Quality Department");
		CommonMethods.click(findScreenWindowElements.OkButton);
		
	}
	
	@Then("Enter {string} and enter {string} and enter {string}")
	public void enter_and_enter_and_enter(String string, String string2, String string3) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(receivingWindowElements.receivingLocation, string);
		CommonMethods.sendKeys(receivingWindowElements.receivingQuantity, string2);
		CommonMethods.sendKeys(receivingWindowElements.receivingContactInfo, string3);
		
	}
	
	@Then("Select {string} for Work Area")
	public void select_for_Work_Area(String string) {
		CommonMethods.click(receivingWindowElements.receivingWorkAreaButton);
		CommonMethods.selectValueFromBootStrapDropDown(receivingWindowElements.receivingWorkAreaList, "Mechanical");
		
	}
	
	@Then("Select {string} for Reason for Service")
	public void select_for_Reason_for_Service(String string) {
		CommonMethods.click(receivingWindowElements.receivingReasonOfServiceButton);
		CommonMethods.selectValueFromBootStrapDropDown(receivingWindowElements.receivingReasonOfServiceList, "One Time Only");
		
	}
	
	@Then("Select {string} for Initial Condition")
	public void select_for_Initial_Condition(String string) {
		CommonMethods.click(receivingWindowElements.receivingInitialConditionButton);
		CommonMethods.selectValueFromBootStrapDropDown(receivingWindowElements.receivingInitialConditionList, "In Tolerance");
		
	}
	
	@Then("Check On Site checkbox and check Expedite checkbox")
	public void check_On_Site_checkbox_and_check_Expedite_checkbox() {
		CommonMethods.click(receivingWindowElements.receivingOnSite);
		CommonMethods.click(receivingWindowElements.receivingExpedite);
		
	}
	
	@Then("Select second asset and verify the Department is blank")
	public void select_second_asset_and_verify_the_Department_is_blank() {
		CommonMethods.click(receivingWindowElements.receivingSecondAsset);
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingDepartment);
		Assert.assertEquals("", FieldContent);
		
	}
	
	@Then("Verify Location is blank")
	public void verify_Location_is_blank() {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingLocation);
		Assert.assertEquals("", FieldContent);
		
	}
	
	@Then("Verify Work Area is {string}")
	public void verify_Work_Area_is(String string) {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingWorkArea);
		Assert.assertEquals("Electronic", FieldContent);
		
	}
	
	@Then("Verify Reason of Service is {string}")
	public void verify_Reason_of_Service_is(String string) {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingReasonOfService);
		Assert.assertEquals("Normal Cycle", FieldContent);
		
	}
	
	@Then("Verify Initial Condition is blank")
	public void verify_Initial_Condition_is_blank() {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingInitialCondition);
		Assert.assertEquals(" ", FieldContent);
		
	}
	
	@Then("Verify Quantity is {string} and Contact Info is blank")
	public void verify_Quantity_is_and_Contact_Info_is_blank(String string) {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingQuantity);
		Assert.assertEquals("1", FieldContent);
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingContactInfo);
		Assert.assertEquals("", FieldContent);
		
		
	}
	
	@Then("Verify On Site checkbox is unchecked")
	public void verify_On_Site_checkbox_is_unchecked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingOnSite);
		
	}
	
	@Then("Verify Expedite checkbox is unchecked")
	public void verify_Expedite_checkbox_is_unchecked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingExpedite);
		
	}
	
	@Then("Select first asset and check Location checkbox")
	public void select_first_asset_and_check_Location_checkbox() {
		CommonMethods.click(receivingWindowElements.receivingFirstAsset);
		CommonMethods.click(receivingWindowElements.receivingLocationCheckbox);
		
	}
	
	@Then("Select second asset and verify Location is {string}")
	public void select_second_asset_and_verify_Location_is(String string) {
		CommonMethods.click(receivingWindowElements.receivingSecondAsset);
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingLocation);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Select first asset and uncheck Location checkbox")
	public void select_first_asset_and_uncheck_Location_checkbox() {
		CommonMethods.click(receivingWindowElements.receivingFirstAsset);
		CommonMethods.click(receivingWindowElements.receivingLocationCheckbox);
		
	}
	
	@Then("Select first asset and click Select button")
	public void select_first_asset_and_click_Select_button() {
		CommonMethods.click(receivingWindowElements.receivingFirstAsset);
		CommonMethods.click(receivingWindowElements.receivingSelectButton);
		
	}
	
	@Then("Verify Department relative checkbox is checked and Location relative checkbox is checked")
	public void verify_Department_relative_checkbox_is_checked_and_Location_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingDepartmentCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingLocationCheckbox);
		
	}
	
	@Then("Verify Work Area relative checkbox is checked and Reason for Service relative checkbox is checked")
	public void verify_Work_Area_relative_checkbox_is_checked_and_Reason_for_Service_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingWorkAreaCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingReasonOfServiceCheckbox);
		
	}
	
	@Then("Verify Initial Condition relative checkbox is checked and Priority relative checkbox is checked")
	public void verify_Initial_Condition_relative_checkbox_is_checked_and_Priority_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingInitialConditionCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingPriorityCheckbox);
		
	}
	
	@Then("Verify Quantity relative checkbox is checked and Job Number relative checkbox is checked")
	public void verify_Quantity_relative_checkbox_is_checked_and_Job_Number_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingQuantityCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingJobNumberCheckbox);
		
	}
	
	@Then("Verify On Site relative checkbox is checked and Expedite relative checkbox is checked")
	public void verify_On_Site_relative_checkbox_is_checked_and_Expedite_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingOnSiteCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingExpediteCheckbox);
		
	}
	
	@Then("Verify ISOCert relative checkbox is checked and Service Type relative checkbox is checked")
	public void verify_ISOCert_relative_checkbox_is_checked_and_Service_Type_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingISOCertCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingServiceTypeCheckbox);
		
	}
	
	@Then("Verify Status relative checkbox is checked and Open Date relative checkbox is checked")
	public void verify_Status_relative_checkbox_is_checked_and_Open_Date_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingStatusCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingOpenDateCheckbox);
		
	}
	
	@Then("Verify Required Date relative checkbox is checked and Category relative checkbox is checked")
	public void verify_Required_Date_relative_checkbox_is_checked_and_Category_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingRequiredDateCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingCategoryCheckbox);
		
	}
	
	@Then("Verify Sub Category relative checkbox is checked and Contact Info relative checkbox is checked")
	public void verify_Sub_Category_relative_checkbox_is_checked_and_Contact_Info_relative_checkbox_is_checked() {
		CommonMethods.isElementChecked(receivingWindowElements.receivingSubCategoryCheckbox);
		CommonMethods.isElementChecked(receivingWindowElements.receivingContactInfoCheckbox);
		
	}
	
	@Then("Verify Required Date is Open Date plus {int} days")
	public void verify_Required_Date_is_Open_Date_plus_days(Integer int1) {
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingRequiredDate);
		String ReqDate = CommonMethods.getDate14DaysFromToday();
		Assert.assertEquals(ReqDate, FieldContent);
		
	}
	
	@Then("Enter {string} to Priority and verify Required Date is Open Date plus {int} days")
	public void enter_to_Priority_and_verify_Required_Date_is_Open_Date_plus_days(String string, Integer int1) {
		CommonMethods.sendKeys(receivingWindowElements.receivingPriority, string);
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingRequiredDate);
		String ReqDate = CommonMethods.getDate3DaysFromToday();
		Assert.assertEquals(ReqDate, FieldContent);
		
	}
	
	@Then("Enter {string} to Priority and Verify Required Date is Open Date plus {int} days")
	public void enter_to_Priority_and_Verify_Required_Date_is_Open_Date_plus_days(String string, Integer int1) throws Throwable {
		JsCommonMethods.clearByJS(receivingWindowElements.receivingPriority);
		CommonMethods.sendKeys(receivingWindowElements.receivingPriority, string);
		FieldContent = CommonMethods.getAttribute(receivingWindowElements.receivingRequiredDate);
		String ReqDate = CommonMethods.getDate7DaysFromToday();
		Assert.assertEquals(ReqDate, FieldContent);
		
	}
	
	@Then("Enter {string} to Priority and click Process button")
	public void enter_to_Priority_and_click_Process_button(String string) {
		JsCommonMethods.clearByJS(receivingWindowElements.receivingPriority);
		CommonMethods.sendKeys(receivingWindowElements.receivingPriority, string);
		CommonMethods.click(receivingWindowElements.receivingProcessButton);
		
	}

	@Then("cick OK on the Attention message and click Close button")
	public void cick_OK_on_the_Attention_message_and_click_Close_button() throws Throwable {
		Thread.sleep(5000);
		CommonMethods.click(receivingWindowElements.receivingAttentionOK);
		CommonMethods.click(receivingWindowElements.receivingCloseButton);
		
	}
	
}


	


