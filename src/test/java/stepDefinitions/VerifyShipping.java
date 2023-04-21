package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class VerifyShipping extends CommonMethods {
	
	public static String ShipmentName;
	public static String FieldContent;
	
	@Then("Enter search value for the Shipment Name and click Find button")
	public void enter_search_value_for_the_Shipment_Name_and_click_Find_button() {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ShipmentName=ExcelUtility.getCellData(Constants.SHIPPING_CELL, 0);
		CommonMethods.swithToFrame(frames.Frame1);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectShipItemsWindowElements.findShipItemBarcodeSearchValue).click().sendKeys(ShipmentName).build().perform();
		CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
		
	@Then("Click OK button and {string} window opens")
	public void click_OK_button_and_window_opens(String string) {
		CommonMethods.click(selectShipItemsWindowElements.OkButton);
		
	}
	
	@Then("Verify Ship_From is {string}")
	public void verify_Ship_From_is(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipFrom);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Ship_To is {string}")
	public void verify_Ship_To_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipTo);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Shipment_Name is Shipment_Name")
	public void verify_Shipment_Name_is_Shipment_Name() {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipShipmentName);
		Assert.assertEquals(ShipmentName, FieldContent);
		
	}
	
	@Then("Verify Location is {string}")
	public void verify_Location_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipLocation);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Shipper is {string}")
	public void verify_Shipper_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipShipperValue);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Tracking_Number is {string}")
	public void verify_Tracking_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipTrackingNum);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Required_Date is Required_Date")
	public void verify_Required_Date_is_Required_Date() {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipReqDate);
		Assert.assertEquals(CommonMethods.getTodayDate(), FieldContent);
		
	}
	
	@Then("Verify Authority is {string}")
	public void verify_Authority_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipAuthority);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Notes is {string}")
	public void verify_Notes_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipNotes);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Additional_Info is {string}")
	public void verify_Additional_Info_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipAddInfo);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Issued_By is {string}")
	public void verify_Issued_By_is(String string) {
		FieldContent = CommonMethods.getAttribute(addShippingWindowElements.shipIssuedBy);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Click Shipping_Items tab")
	public void click_Shipping_Items_tab() {
		CommonMethods.click(addShippingWindowElements.shipItemsTab);
		
	}
	
	@Then("Verify Nomenclature is {string}")
	public void verify_Nomenclature_is(String string) {
		FieldContent = CommonMethods.getText(addShippingWindowElements.firstGridNomenclature);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Model_Number is {string}")
	public void verify_Model_Number_is(String string) {
		FieldContent = CommonMethods.getText(addShippingWindowElements.firstGridModNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Serial_Number is {string}")
	public void verify_Serial_Number_is(String string) {
		FieldContent = CommonMethods.getText(addShippingWindowElements.firstGridSerNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify first item Barcode is {string}")
	public void verify_first_item_Barcode_is(String string) {
		FieldContent = CommonMethods.getText(addShippingWindowElements.firstGridBarcode);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify second item Barcode is {string}")
	public void verify_second_item_Barcode_is(String string) {
		FieldContent = CommonMethods.getText(addShippingWindowElements.secondGridBarcode);
		Assert.assertEquals(string, FieldContent);
		
	}
	
}


	


