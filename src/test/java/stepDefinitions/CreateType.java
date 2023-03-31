package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;
import org.openqa.selenium.interactions.Actions;

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
		//CommonMethods.waitForVisib(frames.Frame2);
		
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
		CommonMethods.waitForVisib(findFacilityWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findFacilityWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findFacilityWindowElements.FindButton);
		
	}
	
	@Then("Click OK button and enter Model_Number")
	public void click_OK_button_and_enter_Model_Number() {
		CommonMethods.click(findFacilityWindowElements.OkButton);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addTypeWindowElements.typeModelNumber, "2468");
		
	}
	
	@Then("Enter Weight and enter Dimensions")
	public void enter_Weight_and_enter_Dimensions() throws Throwable {
		CommonMethods.sendKeys(addTypeWindowElements.typeWeight, "10");
		CommonMethods.sendKeys(addTypeWindowElements.typeDimension, "5x5");
		
	}
	
	@Then("Enter Size and enter Stock_Number")
	public void enter_Size_and_enter_Stock_Number() {
		CommonMethods.sendKeys(addTypeWindowElements.typeSize, "2x2");
		CommonMethods.sendKeys(addTypeWindowElements.typeStockNumber, "369");
		
	}
	
	@Then("Enter Class and enter Family")
	public void enter_Class_and_enter_Family() {
		CommonMethods.sendKeys(addTypeWindowElements.typeClass, "TestClass");
		CommonMethods.sendKeys(addTypeWindowElements.typeFamily, "TestFamily");
		
	}
	
	@Then("Click Save buttn and click Close button")
	public void click_save_buttn_and_click_close_button() throws Throwable {
		CommonMethods.click(addTypeWindowElements.typeSave);
		Thread.sleep(2000);
		CommonMethods.click(addTypeWindowElements.typeClose);
		
	}
	
}


	


