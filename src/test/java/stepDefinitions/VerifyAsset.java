package stepDefinitions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyAsset extends CommonMethods {
	
	public static String Barcode;
	public static String TypeDescription;
	public static String FieldContent;
	
	@Then("Find {string} by entering Barcode and click Find button")
	public void find_by_entering_Barcode_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		Barcode=ExcelUtility.getCellData(Constants.ASSET_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(Barcode).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
		
	@Then("Verify ID is ID")
	public void verify_ID_is_ID() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetID);
		Assert.assertEquals(Barcode, FieldContent);
		
	}
	
	@Then("Verify Barcode is Barcode")
	public void verify_Barcode_is_Barcode() {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetBarcode);
		Assert.assertEquals(Barcode, FieldContent);
		
	}
	
	@Then("Verify Serial Number is {string}")
	public void verify_Serial_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetSerialNum);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Customer is  is {string}")
	public void verify_Customer_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetCustomer);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Department is {string}")
	public void verify_Department_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetDepartment);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Parent is  is {string}")
	public void verify_Parent_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetParent);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Standard Type is {string}")
	public void verify_Standard_Type_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetStandardType);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Physical Location is  is {string}")
	public void verify_Physical_Location_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetPhysicalLocation);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Disposition is {string}")
	public void verify_Disposition_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetDisposition);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Purchase Date is  is {string}")
	public void verify_Purchase_Date_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetPurchaseDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify In Service Date is {string}")
	public void verify_In_Service_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetInServiceDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Warranty Date is  is {string}")
	public void verify_Warranty_Date_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetWarrantyDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Date Inventoried is {string}")
	public void verify_Date_Inventoried_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetDateInventoried);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Inventoried By is  is {string}")
	public void verify_Inventoried_By_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetInventoriedBy);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type Description is Type_Description")
	public void verify_Type_Description_is_Type_Description() {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		TypeDescription=ExcelUtility.getCellData(Constants.TYPE_CELL, 1);
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetTypeDescription);
		Assert.assertEquals(TypeDescription, FieldContent);
		
	}
	
	@Then("Verify Group is  is {string}")
	public void verify_Group_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetGroup);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Assigned Contact is {string}")
	public void verify_Assigned_Contact_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetAssignedContact);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Assigned Number is  is {string}")
	public void verify_Assigned_Number_is_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetAssignedNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Assigned Date is {string}")
	public void verify_Assigned_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetAssignedDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Optional_{int} is  is {string}")
	public void verify_Optional__is_is(Integer int1, String string) {
		FieldContent = CommonMethods.getAttribute(addAssetWindowElements.assetOptional1);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	
}


	


