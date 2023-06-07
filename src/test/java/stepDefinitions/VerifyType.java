package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class VerifyType extends CommonMethods {
	
	public static String TypeDescription;
	public static String FieldContent;
	
	@Then("Find {string} by entering Description and click Find button")
	public void find_by_entering_Description_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		TypeDescription=ExcelUtility.getCellData(Constants.TYPE_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
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
		
	@Then("Verify Type_Description is Type_Description")
	public void verify_Type_Description_is_Type_Description() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeDescription);
		Assert.assertEquals(TypeDescription, FieldContent);
		
	}
	
	@Then("Verify Item_Cost is {string}")
	public void verify_Item_Cost_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeItemCost);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Replace_Cost is {string}")
	public void verify_Replace_Cost_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeReplaceCost);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Manufacturer is {string}")
	public void verify_Type_Manufacturer_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeManufacturer);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Model_Number is {string}")
	public void verify_Type_Model_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeModelNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Weight is {string}")
	public void verify_Type_Weight_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeWeight);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Weight_UOM is {string}")
	public void verify_Type_Weight_UOM_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeWeightUOM);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Size is {string}")
	public void verify_Type_Size_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeSize);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Stock_Number is {string}")
	public void verify_Type_Stock_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeStockNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Dimensions is {string}")
	public void verify_Type_Dimensions_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeDimension);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Class is {string}")
	public void verify_Type_Class_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeClass);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Family is {string}")
	public void verify_Type_Family_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeFamily);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Type_Authoirty is {string}")
	public void verify_Type_Authoirty_is(String string) {
		FieldContent = CommonMethods.getAttribute(addTypeWindowElements.typeAuthority);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	
	
	
	
}


	


