package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class CreateProcedure extends CommonMethods {
	
	@When("Click Maintenance and click Procedures")
	public void click_Maintenance_and_click_Procedures() throws InterruptedException {
		Thread.sleep(2000);
		consoleMenuMetTeamElements.btnMaintenance.click();
		Thread.sleep(1000);
		
		maintenanceSubMenuElements.maintProcedures.click();
		Thread.sleep(1000);
		
		}

	@Then("Find Procedure {string} is open and click Add button")
	public void find_Procedure_is_open_and_click_on_Add_button(String WindowName) throws Throwable {
		
		CommonMethods.switchToFrame(findScreenWindowElements.WindowSwitch);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		
	}
	
	@Then("{string} window is opened and enter procedure name")
	public void window_is_opened_and_enter_procedure_name (String WindowName) throws InterruptedException {
		
		CommonMethods.switchToFrame(addAssetWindowElements.windowSwitch);
		CommonMethods.waitForVisib(addProcedureWindowElements.procName);
		CommonMethods.sendKeys(addProcedureWindowElements.procName, "Procedure_01");
		Thread.sleep(1000);
		
	}
	
	

	
	
	}



	


