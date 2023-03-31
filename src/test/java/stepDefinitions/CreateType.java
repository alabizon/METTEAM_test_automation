package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

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
		CommonMethods.sendKeys(addTypeWindowElements.typeDescription, "Type_"+CommonMethods.getDateAsString());
				
	}
	
	@Then("Enter Item_Cost and enter Replace_Cost")
	public void enter_Item_Cost_and_enter_Replace_Cost() throws InterruptedException {
		JsCommonMethods.clearByJS(addTypeWindowElements.typeItemCost);
		CommonMethods.sendKeys(addTypeWindowElements.typeItemCost, "5.00");
		JsCommonMethods.clearByJS(addTypeWindowElements.typeReplaceCost);
		CommonMethods.sendKeys(addTypeWindowElements.typeReplaceCost, "7.00");
				
	}
	
	@Then("Click ellipsis button next to the Manufacturer {string} window is open")
	public void click_ellipsis_button_next_to_the_Manufacturer_window_is_open(String string) {
		CommonMethods.click(addTypeWindowElements.elipsisButtonManufacturer);
		
	}
	
	@Then("Enter {string} and click Find button")
	public void enter_and_click_Find_button(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		Thread.sleep(2000);
		CommonMethods.selectValueFromBootStrapDropDown(findFacilityWindowElements.findFacilityFacilityNameSearchValue, string);
		Thread.sleep(2000);
		CommonMethods.click(findFacilityWindowElements.FindButton);
		Thread.sleep(1000);
		
	}
	
	
	
}


	


