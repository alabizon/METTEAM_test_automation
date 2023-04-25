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

public class VerifyProcedure extends CommonMethods {
	
	public static String ProcedureName;
	public static String FieldContent;
	
	@Then("Find {string} by entering Procedure Name and click Find button")
	public void find_by_entering_Procedure_Name_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ProcedureName=ExcelUtility.getCellData(Constants.PROCEDURE_CELL, 0);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		for (int i = 0; i < selectShipItemsWindowElements.listElementsFromTheFindScreen.size(); i++) {
	        if (selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i).getText().equals(string)) {
	        	JsCommonMethods.drawRedBorder(selectShipItemsWindowElements.listElementsFromTheFindScreen.get(i));
	            int elementIndex = i + 4;
	            WebElement searchField = selectShipItemsWindowElements.listElementsFromTheFindScreen.get(elementIndex);
	            Actions actions = new Actions(driver);
	        	actions.moveToElement(searchField).click().sendKeys(ProcedureName).build().perform();
	           
	                break;
	            }
	        }
	    CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	@Then("Verify Procedure_Name is Procedure_Name")
	public void verify_Procedure_Name_is_Procedure_Name() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procName);
		Assert.assertEquals(ProcedureName, FieldContent);
		
	}
	
	@Then("Verify Number is {string}")
	public void verify_Number_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procNumber);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Version is {string}")
	public void verify_Version_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procVersion);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Procedure_Date is {string}")
	public void verify_Procedure_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Data_Sheet is {string}")
	public void verify_Data_Sheet_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procDataSheet);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Revision is {string}")
	public void verify_Revision_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procRevision);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Revision_Date is {string}")
	public void verify_Revision_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procRevisionDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Service_Type is {string}")
	public void verify_Service_Type_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procServiceType);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Category is {string}")
	public void verify_Category_is(String string) {
		FieldContent = CommonMethods.getAttribute(addProcedureWindowElements.procCategory);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	
	
	
	
	
	
	
	
}


	


