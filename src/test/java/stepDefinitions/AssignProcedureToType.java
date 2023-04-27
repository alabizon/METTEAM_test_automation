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

public class AssignProcedureToType extends CommonMethods {
	
	public static String TypeDescription;
	public static String ProcedureName;
	public static String FieldContent;
	
	@Then("click OK button")
	public void click_OK_button() {
		CommonMethods.click(findScreenWindowElements.OkButton);
		
	}
		
	@Then("Click Add Procedure Link button and {string} window opens")
	public void click_Add_Procedure_Link_button_and_window_opens(String string) {
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addTypeWindowElements.typeAddProcedureLink);
		
	}
	
	@Then("Click ellipsis button next to Procedure Name field")
	public void click_ellipsis_button_next_to_Procedure_Name_field() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.click(addTypeProcedureDefaultWindowElements.elipsisButtonProcName);
		
	}
	
	@Then("Find {string} by entering Procedure Name into search criteria and click Find button")
	public void find_by_entering_Procedure_Name_into_search_criteria_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ProcedureName=ExcelUtility.getCellData(Constants.PROCEDURE_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
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
	
	@Then("Enter intrval {string}")
	public void enter_intrval(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		Thread.sleep(1000);
		CommonMethods.sendKeys(addTypeProcedureDefaultWindowElements.defprocInterval, string);
		
	}
	
	@Then("Click Close button on the Edit Types screen")
	public void click_Close_button_on_the_Edit_Types_screen() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addTypeProcedureDefaultWindowElements.defprocClose);
		
	}
	
	
	
	
	
	
}


	


