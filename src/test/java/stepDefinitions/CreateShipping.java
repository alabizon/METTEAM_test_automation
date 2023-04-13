package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

import org.openqa.selenium.interactions.Actions;

public class CreateShipping extends CommonMethods {
	
	public static String ShipmentName;
	
	@When("Click Workflow and click Shipping")
	public void click_Workflow_and_click_Shipping() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnWorkflow);
		Thread.sleep(1000);
		workflowSubMenuElements.wflowShipping.click();
		CommonMethods.waitForVisib(frames.Frame1);
		
	}

	@Then("Click ellipsis button next to {string} button and {string} window opens")
	public void click_ellipsis_button_next_to_button_and_window_opens(String string, String string2) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addShippingWindowElements.elipsisButtonShipTo);
		CommonMethods.click(addShippingWindowElements.elipsisButtonShipTo);
		JsCommonMethods.scrollDown(20);
		Thread.sleep(1000);
		
	}
	
	@Then("Enter {string} and click Find button and click OK button")
	public void enter_and_click_Find_button_and_click_OK_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.waitForVisib(findFacilityAddressWindowElements.findFacilityAddressFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findFacilityAddressWindowElements.findFacilityAddressFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findFacilityAddressWindowElements.findFacilityAddressFindButton);
		CommonMethods.click(findFacilityAddressWindowElements.findFacilityAddressOkButton);
		
	}
	
	@Then("Click Yes on the Attention window")
	public void click_Yes_on_the_Attention_window() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addShippingWindowElements.alertYesButton);
		CommonMethods.click(addShippingWindowElements.alertYesButton);
		
	}
	
	@Then("Enter Shipment name and enter Location")
	public void enter_Shipment_name_and_enter_Location() throws Throwable {
		ShipmentName = "Shipment_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addShippingWindowElements.shipShipmentName, ShipmentName);
		CommonMethods.sendKeys(addShippingWindowElements.shipLocation, "TestLocation");
		
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ExcelUtility.writeStringRow(ShipmentName, Constants.SHIPPING_CELL);
		ExcelUtility.writeExcel(Constants.TESTDATA_FILEPATH);
				
	}
	
	@Then("Select {string} and enter Tracking_Number")
	public void select_and_enter_Tracking_Number(String string) throws Throwable {
		CommonMethods.clickThenSelectOptionFromDropdownByText(addShippingWindowElements.shipShipper, addShippingWindowElements.shipShipperList, string);
		CommonMethods.sendKeys(addShippingWindowElements.shipTrackingNum, "DO NOT CHALLENGE");
		
	}
	
	@Then("Enter Required_Date and enter Authority")
	public void enter_Required_Date_and_enter_Authority() {
		CommonMethods.sendKeys(addShippingWindowElements.shipReqDate, CommonMethods.getTodayDate());
		CommonMethods.sendKeys(addShippingWindowElements.shipAuthority, "TestAuthority");
		
	}
	
	@Then("Enter Notes and enter Additional_Info and enter Issued_By")
	public void enter_Notes_and_enter_Additional_Info_and_enter_Issued_By() {
		CommonMethods.sendKeys(addShippingWindowElements.shipNotes, "TestNotes");
		CommonMethods.sendKeys(addShippingWindowElements.shipAddInfo, "TestAdditionalInfo");
		CommonMethods.sendKeys(addShippingWindowElements.shipIssuedBy, "TestUser");
		
	}
	
	@Then("Click Save button")
	public void click_Save_button() {
		CommonMethods.click(addShippingWindowElements.buttonSave);
		
	}
	
	@Then("Click Shipping_Items tab and click Add_Asset button")
	public void click_Shipping_Items_tab_and_click_Add_Asset_button() throws Throwable {
		Thread.sleep(500);
		CommonMethods.click(addShippingWindowElements.shipItemsTab);
		CommonMethods.click(addShippingWindowElements.shipAddAsset);
		
	}
	
	@Then("Enter {string} and then click Find button")
	public void enter_and_then_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectShipItemsWindowElements.findShipItemBarcodeSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	@Then("Double-click search result and click OK button")
	public void double_click_search_result_and_click_OK_button() {
		CommonMethods.click(selectShipItemsWindowElements.OkButton);
		
	}
	
	@Then("Click Add_Non_Asset button and {string} window is open")
	public void click_Add_Non_Asset_button_and_window_is_open(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addShippingWindowElements.shipAddNonAsset);
		
	}
	
	@Then("Enter {string} and enter {string}")
	public void enter_and_enter(String string, String string2) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame5);
		CommonMethods.waitForVisib(addShipItemWindowElements.ship_itemNomenclature);
		CommonMethods.sendKeys(addShipItemWindowElements.ship_itemNomenclature, string);
		CommonMethods.sendKeys(addShipItemWindowElements.ship_itemModelNum, string2);
		
	}
	
	@Then("Enter {string} and then enter {string}")
	public void enter_and_then_enter(String string3, String string4) {
		CommonMethods.waitForClickability(addShipItemWindowElements.ship_itemSerialNum);
		CommonMethods.sendKeys(addShipItemWindowElements.ship_itemSerialNum, string3);
		CommonMethods.sendKeys(addShipItemWindowElements.ship_itemBarcode, string4);
		
	}
	
	@Then("Click Save button and then click Close button")
	public void click_Save_button_and_then_click_Close_button() {
		CommonMethods.click(addShipItemWindowElements.ship_itemSave);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addShippingWindowElements.buttonClose);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	


