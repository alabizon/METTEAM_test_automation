package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;
import org.openqa.selenium.interactions.Actions;

public class CreatePart extends CommonMethods {
	
	@When("Click Maintenance and click Parts")
	public void click_Maintenance_and_click_Parts() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintParts.click();
		CommonMethods.waitForVisib(frames.Frame1);
		
	}

	@Then("{string} window opens and click Add button")
	public void window_opens_and_click_Add_button(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		
	}
	
	@Then("{string} wnd is open and enter Description")
	public void wnd_is_open_and_enter_Description(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addPartWindowElements.partDescription);
		CommonMethods.sendKeys(addPartWindowElements.partDescription, "TestPart_"+CommonMethods.getDateAsString());
		
	}
	
	@Then("Enter Part_Number and enter On_Hand and enter Re_Order and enter Last_Qty")
	public void enter_Part_Number_and_enter_On_Hand_and_enter_Re_Order_and_enter_Last_Qty() {
		CommonMethods.sendKeys(addPartWindowElements.partPartNumber, "456");
		CommonMethods.sendKeys(addPartWindowElements.partOnHand, "10");
		CommonMethods.sendKeys(addPartWindowElements.partReOrder, "7");
		CommonMethods.sendKeys(addPartWindowElements.partLastQty, "6");
		
	}
	
	@Then("Click ellipsis button nxt to the Manufacturer {string} window is open")
	public void click_ellipsis_button_nxt_to_the_Manufacturer_window_is_open(String string) {
		CommonMethods.click(addPartWindowElements.elipsisButtonManufacturer);
		
	}
	
	@Then("Enter {string} and click Find buttn")
	public void enter_and_click_Find_buttn(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.waitForVisib(findFacilityWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findFacilityWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findFacilityWindowElements.FindButton);
		
	}
	
	@Then("Click OK button and enter Class and enter Purchase_Units and enter Price")
	public void click_OK_button_and_enter_Class_and_enter_Purchase_Units_and_enter_Price() {
		CommonMethods.click(findFacilityWindowElements.OkButton);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addPartWindowElements.partClass, "TestClass");
		CommonMethods.sendKeys(addPartWindowElements.typePurchaseUnit, "EA");
		CommonMethods.sendKeys(addPartWindowElements.partPrice, "3.00");
		
	}
	
	@Then("Enter Stock_Number and enter Group")
	public void enter_Stock_Number_and_enter_Group() {
		CommonMethods.sendKeys(addPartWindowElements.partStockNumber, "123");
		CommonMethods.sendKeys(addPartWindowElements.partGroup, "TestGroup");
		
	}
	
	@Then("Click ellipsis button next to the InventoriedBy {string} window is open")
	public void click_ellipsis_button_next_to_the_InventoriedBy_window_is_open(String string) {
		CommonMethods.click(addPartWindowElements.elipsisButtonInventoriedBy);
		
	}
	
	@Then("Enter {string} and click Find btn")
	public void enter_and_click_Find_btn(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.waitForVisib(findUserWindowElements.findUserLastNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findUserWindowElements.findUserLastNameSearchValue).click().sendKeys(string).build().perform();
		Thread.sleep(1000);
		CommonMethods.click(findUserWindowElements.FindButton);
	
	}
		
	@Then("Click OK button and enter Date_Inventoried and enter Cost")
	public void click_OK_button_and_enter_Date_Inventoried_and_enter_Cost() {
		CommonMethods.click(findUserWindowElements.OkButton);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addPartWindowElements.partDateInventoried, "05/27/2005");
		CommonMethods.sendKeys(addPartWindowElements.partCost, "5.00");
		
	}
	
	@Then("Enter Location and enter Supplier and enter Last_Ordered and enter Last_Cost")
	public void enter_Location_and_enter_Supplier_and_enter_Last_Ordered_and_enter_Last_Cost() {
		CommonMethods.sendKeys(addPartWindowElements.partLocation, "TestLocation");
		CommonMethods.sendKeys(addPartWindowElements.partSupplier, "TestSupplier");
		CommonMethods.sendKeys(addPartWindowElements.partLastOrdered, "05/27/2005");
		CommonMethods.sendKeys(addPartWindowElements.partLastCost, "3.50");
		
	}
	
	@Then("Click Save btn and click Close button")
	public void click_Save_btn_and_click_Close_button() throws Throwable {
		CommonMethods.click(addPartWindowElements.partSave);
		Thread.sleep(2000);
		CommonMethods.click(addPartWindowElements.partClose);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	


