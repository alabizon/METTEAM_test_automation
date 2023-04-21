package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyPart extends CommonMethods {
	
	public static String PartNumber;
	public static String FieldContent;
	
	@Then("Find {string} by entering Part Number and click Find button")
	public void find_by_entering_Part_Number_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		PartNumber=ExcelUtility.getCellData(Constants.PART_CELL, 0);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(PartNumber).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
	    }
	
	@Then("Verify Description is Description")
	public void verify_Description_is_Description() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partDescription);
		Assert.assertEquals(PartNumber, FieldContent);
		
	}
	
	@Then("Verify Part_Number is Part_Number")
	public void verify_Part_Number_is_Part_Number() {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partPartNumber);
		Assert.assertEquals(PartNumber, FieldContent);
		
	}
	
	@Then("Verify Manufacturer is {string}")
	public void verify_Manufacturer_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partManufacturer);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Class is {string}")
	public void verify_Class_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partClass);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Stock_Number is {string}")
	public void verify_Stock_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partStockNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Group is {string}")
	public void verify_Group_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partGroup);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Location is like {string}")
	public void verify_Location_is_like(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partLocation);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify On_Hand is {string}")
	public void verify_On_Hand_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partOnHand);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Re_Order is {string}")
	public void verify_Re_Order_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partReOrder);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Last_Qty is {string}")
	public void verify_Last_Qty_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partLastQty);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Purchase_Unit is {string}")
	public void verify_Purchase_Unit_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.typePurchaseUnit);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Price is {string}")
	public void verify_Price_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partPrice);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Inventoried_By is {string}")
	public void verify_Inventoried_By_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partInventoriedBy);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Date_Inventoried is {string}")
	public void verify_Date_Inventoried_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partDateInventoried);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Cost is {string}")
	public void verify_Cost_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partCost);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Supplier is {string}")
	public void verify_Supplier_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partSupplier);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Last_Ordered is {string}")
	public void verify_Last_Ordered_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partLastOrdered);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Last_Cost is {string}")
	public void verify_Last_Cost_is(String string) {
		FieldContent = CommonMethods.getAttribute(addPartWindowElements.partLastCost);
		Assert.assertEquals(string, FieldContent);
		
	}
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	


