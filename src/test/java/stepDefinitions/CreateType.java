package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class CreateType extends CommonMethods {
	
	@When("Click Maintenance and click Type")
	public void click_Maintenance_and_click_Type() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintTypes.click();
		CommonMethods.waitForVisib(frames.Frame1);
		
	}

	@Then("{string} findType_window is open and click Add button")
	public void findType_window_is_open_and_click_Add_button(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		CommonMethods.waitForVisib(frames.Frame2);
		
	}
	
	@Then("{string} window is open and enter Description")
	public void window_is_open_and_enter_Description(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addTypeWindowElements.typeDescription);
		CommonMethods.sendKeys(addTypeWindowElements.typeDescription, "Type"+CommonMethods.getDateAsString());
				
	}
	
	@Then("Enter Item_Cost and enter Replace_Cost")
	public void enter_Item_Cost_and_enter_Replace_Cost() {
		
	}
	
	@Then("Enter Manufacturer and enter Model_Number")
	public void enter_Manufacturer_and_enter_Model_Number() {
		
	}
	
	@Then("Enter Weight and enter Dimensions")
	public void enter_Weight_and_enter_Dimensions() {
		
	}
	
	@Then("Enter Size and enter Stock_Number")
	public void enter_Size_and_enter_Stock_Number() {
		
	}
	
	@Then("Enter Class and enter Family")
	public void enter_Class_and_enter_Family() {
		
	}
	
	
	
	
	
	
}


	


