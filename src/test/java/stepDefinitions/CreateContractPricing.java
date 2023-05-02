package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class CreateContractPricing extends CommonMethods {
	
	public static String PricingDescription;
	public static String Customer;
	public static String WorkingFacility;
	public static String TypeDescription;
	
	@When("Click Management and click Contract Pricing")
	public void click_Management_and_click_Contract_Pricing() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnManagement);
		Thread.sleep(1000);
		managementSubMenuElements.manageContractPricing.click();
		
	}
	
	@Then("Click elipsis bytton next to the Custoner field")
	public void click_elipsis_bytton_next_to_the_Custoner_field() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addContractPricingWindowElements.elipsisButtonCustomer);
		
	}
	
	@Then("Enter {string} into search criteria and click Find button")
	public void enter_into_search_criteria_and_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Click ellipsis button next to the Working Facility field")
	public void click_ellipsis_button_next_to_the_Working_Facility_field() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addContractPricingWindowElements.elipsisButtonWorkingFacility);
		
	}
	
	@Then("Enter {string} into Facility Name search criteria and click Find button")
	public void enter_into_Facility_Name_search_criteria_and_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Click ellipsis button next to Type Procedure Default field")
	public void click_ellipsis_button_next_to_Type_Procedure_Default_field() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addContractPricingWindowElements.elipsisButtonDefaultProcedure);
		
	}
	
	@Then("Find {string} by entering Types Description and click Find button")
	public void find_by_entering_Types_Description_and_click_Find_button(String string) throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		TypeDescription=ExcelUtility.getCellData(Constants.TYPE_CELL, 1);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame5);
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
	
	@Then("Enter Contract Pricing {string}")
	public void enter_Contract_Pricing(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addContractPricingWindowElements.pricingEffectiveDate, string);
		
	}
	
	@Then("Click Save button and save Contract Pricing")
	public void click_Save_button_and_save_Contract_Pricing() throws Throwable {
		CommonMethods.click(addContractPricingWindowElements.buttonSave);
		Thread.sleep(1000);
		
	}
	
	@Then("Enter Pricing {string}")
	public void enter_Pricing(String string) {
		CommonMethods.sendKeys(addContractPricingWindowElements.pricingExpireDate, string);
		
	}
	
	@Then("Enter {string} to the Price field")
	public void enter_to_the_Price_field(String string) {
		JsCommonMethods.clearByJS(addContractPricingWindowElements.pricingPrice);
		CommonMethods.sendKeys(addContractPricingWindowElements.pricingPrice, string);
		
	}
	
	@Then("Click Save button and click Close button to close Contract Pricing screen")
	public void click_Save_button_and_click_Close_button_to_close_Contract_Pricing_screen() throws Throwable {
		CommonMethods.click(addContractPricingWindowElements.buttonSave);
		Thread.sleep(1000);
		CommonMethods.click(addContractPricingWindowElements.buttonClose);
		
	}
	
	
}


	


