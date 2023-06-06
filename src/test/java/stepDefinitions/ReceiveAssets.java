package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class ReceiveAssets extends CommonMethods {
	
	//public static String Barcode;
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
		Thread.sleep(1000);
		
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
	
	
	
	
	
	
	
	
	
	
		
	
}


	


