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
	

//	@Then("Verify {string} is {string}")
//	public void verify_is(String string, String string2) throws Throwable {
//		driver.switchTo().defaultContent();
//		CommonMethods.swithToFrame(frames.Frame2);
//		CommonMethods.click(addShippingWindowElements.shipFrom);
//		Thread.sleep(500);
//		FieldContent = CommonMethods.getText(addShippingWindowElements.shipFrom);
//		
//		System.out.println(string + " +++++++++++++++++!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(string2 + " ------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(FieldContent + " ////////////////////////////////////////////");
//		
//		Thread.sleep(500);
//		Assert.assertEquals(string, CommonMethods.getText(addShippingWindowElements.shipFrom));
//		
//	}
	
	@Then("Verify Ship_From is {string}")
	public void verify_Ship_From_is(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getText(addShippingWindowElements.shipFrom);
		
		System.out.println(string + " +++++++++++++++++!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(FieldContent + " ////////////////////////////////////////////");
		Assert.assertEquals(string, FieldContent);
		
	}
	
	
}


	


