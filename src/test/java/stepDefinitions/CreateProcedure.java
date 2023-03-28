package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class CreateProcedure extends CommonMethods {
	
	@When("Click Maintenance and click Procedures")
	public void click_Maintenance_and_click_Procedures() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintProcedures.click();
		CommonMethods.waitForVisib(findScreenWindowElements.WindowSwitch);
		
	}

	@Then("{string} window is open and click Add button")
	public void window_is_open_and_click_Add_button(String string) throws Throwable {
		CommonMethods.swithToFrame(findScreenWindowElements.WindowSwitch);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		CommonMethods.waitForVisib(addProcedureWindowElements.windowSwitch2);
		
	}
	
	@Then("{string} window is open and enter Procedure Name")
	public void window_is_open_and_enter_Procedure_Name(String string) throws Throwable {
		CommonMethods.swithToFrame(addProcedureWindowElements.windowSwitch2);
		CommonMethods.waitForVisib(addProcedureWindowElements.procName);
		CommonMethods.sendKeys(addProcedureWindowElements.procName, "Procedure_"+CommonMethods.getDateAsString());
		CommonMethods.waitForVisib(addProcedureWindowElements.elipsisButtonDataSheet);
		
	}
	
	@Then("Click ellipsis button next to the Data Sheet {string} window is open")
	public void click_ellipsis_button_next_to_the_Data_Sheet_window_is_open(String string) throws Throwable {
		CommonMethods.click(addProcedureWindowElements.elipsisButtonDataSheet);
		CommonMethods.waitForVisib(attachDataSheetElements.windowSwitch2);
		
	}
	
	@Then("Select {string} for the {string} and click Find button")
	public void select_for_the_and_click_Find_button(String string, String string2) throws Throwable {
		CommonMethods.swithToFrame(attachDataSheetElements.windowSwitch2);
		CommonMethods.waitForVisib(attachDataSheetElements.attachDataSheetLinkToSearchValue);
		CommonMethods.click(attachDataSheetElements.attachDataSheetLinkToSearchValue);
		Thread.sleep(1000);
		CommonMethods.sendKeys(attachDataSheetElements.attachDataSheetLinkToSearchValue, Keys.DOWN);
		CommonMethods.sendKeys(attachDataSheetElements.attachDataSheetLinkToSearchValue, Keys.DOWN);
		CommonMethods.sendKeys(attachDataSheetElements.attachDataSheetLinkToSearchValue, Keys.DOWN);
		CommonMethods.sendKeys(attachDataSheetElements.attachDataSheetLinkToSearchValue, Keys.DOWN);
		CommonMethods.sendKeys(attachDataSheetElements.attachDataSheetLinkToSearchValue, Keys.DOWN);
	
	
	}
	
	}



	


