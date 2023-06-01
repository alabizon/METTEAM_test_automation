package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class CreateAsset extends CommonMethods {
	
	public static String Barcode;
	public static String TypeDescription;
	
	@When("Click Maintenance and click Assets")
	public void click_Maintenance_and_click_Assets() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintAssets.click();
		
	}
	
	@Then("Enter ID")
	public void enter_ID() {
		CommonMethods.swithToFrame(frames.Frame2);
		Barcode = "Asset_"+CommonMethods.getDateAsString();
		CommonMethods.waitForVisib(addAssetWindowElements.assetID);
		addAssetWindowElements.assetID.clear();
		CommonMethods.sendKeys(addAssetWindowElements.assetID, Barcode);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.ASSET_CELL, 1, Barcode);
		
	}
	
	@Then("Enter Barcode")
	public void enter_Barcode() throws Throwable {
		addAssetWindowElements.assetBarcode.clear();
		CommonMethods.sendKeys(addAssetWindowElements.assetBarcode, Barcode);
		
	}
	
	@Then("Enter Serial_Number")
	public void enter_Serial_Number() {
		CommonMethods.sendKeys(addAssetWindowElements.assetSerialNum, "TestSerialNumber");
		
	}
	
	@Then("Click ellipsis button next to Customer field")
	public void click_ellipsis_button_next_to_Customer_field() {
		CommonMethods.click(addAssetWindowElements.elipsisButtonCustomer);
		
	}
	
	@Then("Click ellipsis button next to Department field")
	public void click_ellipsis_button_next_to_Department_field() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.elipsisButtonDepartment);
		
	}
	
	@Then("Enter {string} to search criteria and click Find button")
	public void enter_to_search_criteria_and_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Click ellipsis button next to Parent field")
	public void click_ellipsis_button_next_to_Parent_field() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.elipsisButtonParent);
		
	}
	
	@Then("Enter {string} to the search criteria and click Find button")
	public void enter_to_the_search_criteria_and_click_Find_button(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame5);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Click On_Site checkbox and click Not_Tracked checkbox and click Optional checkbox")
	public void click_On_Site_checkbox_and_click_Not_Tracked_checkbox_and_click_Optional_checkbox() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addAssetWindowElements.assetOnSiteCheckbox);
		CommonMethods.click(addAssetWindowElements.assetNotTrackedCheckbox);
		CommonMethods.click(addAssetWindowElements.assetOptionalCheckbox);
		
	}
	
	@Then("Verify Standard_Type is disabled")
	public void verify_Standard_Type_is_disabled() {
		CommonMethods.verifyElementEnabledAssertTrue(addAssetWindowElements.assetStandardType, "x-form-text x-form-field x-trigger-noedit readonly");
				
	}
	
	@Then("Click Standard checkbox and verify Standard_Type is enabled")
	public void click_Standard_checkbox_and_verify_Standard_Type_is_enabled() throws Throwable {
		CommonMethods.click(addAssetWindowElements.assetStandardCheckbox);
		CommonMethods.verifyElementEnabledAssertTrue(addAssetWindowElements.assetStandardType, "x-form-text x-form-field x-trigger-noedit x-form-focus");
		//Thread.sleep(1000);
		
	}
	
	@Then("Click ellipsis button next to Type_Description field")
	public void click_ellipsis_button_next_to_Type_Description_field() {
		CommonMethods.click(addAssetWindowElements.elipsisButtonTypeDescription);
		
	}
	
	@Then("Find {string} by entering Type_Description and click Find button")
	public void find_by_entering_Type_Description_and_click_Find_button(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame6);
		CommonMethods.depressButton(findScreenWindowElements.RememberButton);
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		TypeDescription=ExcelUtility.getCellData(Constants.TYPE_CELL, 1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(TypeDescription).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	@Then("Click Yes button on the alert window")
	public void click_Yes_button_on_the_alert_window() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addAssetWindowElements.assetTypeUpdateAlert);
		Thread.sleep(500);
		
	}
	
	@Then("Click Save button and verify Attention is displayed")
	public void click_Save_button_and_verify_Attention_is_displayed() {
		CommonMethods.click(addAssetWindowElements.buttonSave);
		boolean allert = CommonMethods.isElementDisplayed(addAssetWindowElements.assetAlertWindow);
		Assert.assertTrue("The Attention message is displayed", allert);
		
	}
	
	@Then("Click OK button on the Attention window")
	public void click_OK_button_on_the_Attention_window() throws Throwable {
		CommonMethods.click(addAssetWindowElements.assetOkButtonOnAlert);
		Thread.sleep(500);
		
	}
	
	@Then("Select {string}")
	public void select(String string) {
		CommonMethods.click(addAssetWindowElements.assetStandardTypeButton);
		CommonMethods.selectValueFromBootStrapDropDown(addAssetWindowElements.assetStandardTypeList, string);
		
	}
	
	@Then("Enter location {string} and enter {string}")
	public void enter_location_and_enter_(String string, String string2) {
		CommonMethods.sendKeys(addAssetWindowElements.assetPhysicalLocation, string);
		CommonMethods.sendKeys(addAssetWindowElements.assetPurchaseDate, string2);
		
	}
	
	@Then("Click Save button on the Asset screen")
	public void click_Save_button_on_the_Asset_screen() throws Throwable {
		CommonMethods.click(addAssetWindowElements.buttonSave);
		Thread.sleep(1000);
		
	}
	
	@Then("Enter {string}")
	public void enter(String string) throws Throwable {
		CommonMethods.sendKeys(addAssetWindowElements.assetInServiceDate, string);
		
	}
	
	@Then("Enter {string} date and enter {string} date")
	public void enter_date_and_enter_date(String string, String string2) {
		CommonMethods.sendKeys(addAssetWindowElements.assetWarrantyDate, string);
		CommonMethods.sendKeys(addAssetWindowElements.assetDateInventoried, string2);
		
	}
	
	@Then("Click ellipsis button next to Inventoried_By field")
	public void click_ellipsis_button_next_to_Inventoried_By_field() {
		CommonMethods.click(addAssetWindowElements.elipsisButtonInventoriedBy);
		
	}
	
	@Then("Find {string} by entering Last Name and then click Find button")
	public void find_by_entering_Last_Name_and_then_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame7);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Enter group {string} and enter {string}")
	public void enter_group_and_enter(String string, String string2) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addAssetWindowElements.assetGroup, string);
		CommonMethods.sendKeys(addAssetWindowElements.assetAssignedContact, string2);
		
	}
	
	@Then("Enter Assigned Number {string} and enter {string} and enter {string}")
	public void enter_Assigned_Number_and_enter_and_enter(String string, String string2, String string3){
		CommonMethods.sendKeys(addAssetWindowElements.assetAssignedNumber, string);
		CommonMethods.sendKeys(addAssetWindowElements.assetAssignedDate, string2);
		CommonMethods.sendKeys(addAssetWindowElements.assetOptional1, string3);
		
	}
	
}


	


