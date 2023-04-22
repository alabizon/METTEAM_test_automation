package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class CreateProcedure extends CommonMethods {
	
	public static String ProcedureName;
	
	@When("Click Maintenance and click Procedures")
	public void click_Maintenance_and_click_Procedures() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintProcedures.click();
		CommonMethods.waitForVisib(frames.Frame1);
		
	}

	@Then("{string} window is open and click Add button")
	public void window_is_open_and_click_Add_button(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		CommonMethods.waitForVisib(frames.Frame2);
		
	}
	
	@Then("{string} window is open and enter Procedure Name")
	public void window_is_open_and_enter_Procedure_Name(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame2);
		ProcedureName = "Procedure_"+CommonMethods.getDateAsString();
		CommonMethods.waitForVisib(addProcedureWindowElements.procName);
		CommonMethods.sendKeys(addProcedureWindowElements.procName, ProcedureName);
		
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ExcelUtility.writeStringRow(ProcedureName, Constants.PROCEDURE_CELL);
		ExcelUtility.writeExcel(Constants.TESTDATA_FILEPATH);
				
	}
	
	@Then("Enter Number and enter Version")
	public void enter_Number_and_enter_Version() throws Throwable {
		CommonMethods.sendKeys(addProcedureWindowElements.procNumber, "12345");
		CommonMethods.sendKeys(addProcedureWindowElements.procVersion, "V.01");
	
	}
	
	@Then("Enter Revision")
	public void enter_Revision() throws Throwable {
		CommonMethods.sendKeys(addProcedureWindowElements.procRevision, "Rev.03");
		CommonMethods.waitForVisib(addProcedureWindowElements.elipsisButtonDataSheet);
		
	}

	@Then("Enter Procedure_Date and enter Revision_Date")
	public void enter_Procedure_Date_and_enter_Revision_Date() throws Throwable {
		CommonMethods.sendKeys(addProcedureWindowElements.procDate, "03/27/2023");
		CommonMethods.sendKeys(addProcedureWindowElements.procRevisionDate, "03/27/2023");
		
	}
	
	@Then("Click ellipsis button next to the Data Sheet {string} window is open")
	public void click_ellipsis_button_next_to_the_Data_Sheet_window_is_open(String string) throws Throwable {
		CommonMethods.click(addProcedureWindowElements.elipsisButtonDataSheet);
		
	}
	
	@Then("Select {string} for the search value and click Find button")
	public void select_for_the_Search_Value_and_click_Find_button(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.selectValueFromBootStrapDropDown(attachDataSheetElements.linkToSearchValueClick, string);
		CommonMethods.click(attachDataSheetElements.attachDataSheetFind);
		Thread.sleep(1000);
		
	}
	
	@Then("Select {string} and click OK button")
	public void select_procedure_and_click_Ok_button(String string) throws Throwable {
		CommonMethods.selectValueFromBootStrapDropDown(attachDataSheetElements.attachDataSheetResults, string);
		CommonMethods.click(attachDataSheetElements.attachDataSheetOk);
		//Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	}
		
	@Then("Click ellipsis button next to the Category {string} window is open")
	public void click_ellipsis_button_next_to_the_Category_window_is_open(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addProcedureWindowElements.elipsisButtonCategory);
		driver.switchTo().defaultContent();	
		
	}
	
	@Then("Select {string} from the grid and click OK button")
	public void select_category_and_click_Ok_button(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.selectValueFromBootStrapDropDown(categoryWindowElements.categoryList, string);
		CommonMethods.waitForVisib(categoryWindowElements.categoryOk);
		CommonMethods.click(categoryWindowElements.categoryOk);
		Thread.sleep(2000);
		
	}
	
	@Then("Click Save button and click Close button")
	public void click_Save_button_and_click_Close_button() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addProcedureWindowElements.buttonSave);
		Thread.sleep(2000);
		CommonMethods.click(addProcedureWindowElements.buttonClose);
		
	}
}


	


