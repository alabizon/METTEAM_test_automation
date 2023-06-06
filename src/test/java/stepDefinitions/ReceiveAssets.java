package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class ReceiveAssets extends CommonMethods {
	
	public static String Barcode;
	
	@When("Click Workflow and click Receiving")
	public void click_Workflow_and_click_Receiving() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnWorkflow);
		Thread.sleep(1000);
		CommonMethods.click(workflowSubMenuElements.wflowReceiving);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		
	}
	
	@Then("Enter {string} into Barcode search criteria and click Find button")
	public void enter_into_Barcode_search_criteria_and_click_Find_button(String string) throws Throwable {
//		Thread.sleep(1000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
//		CommonMethods.click(findScreenWindowElements.FindButton);
		CommonMethods.enterTheFindCriteriaForFindScreen(findScreenWindowElements.listElementsFromTheFindScreen, frames.Frame1, Barcode, string);
		
	}
	
//	@Then("Double-click search result")
//	public void double_click_search_result() throws Throwable {
//		CommonMethods.doubleClick(findScreenWindowElements.FirstSearchResult);
//		Thread.sleep(1000);
//		
//	}
//		
//	@Then("Click Search criteria and enter {string} into Barcode search criteria and click Find button")
//	public void click_Search_criteria_and_enter_into_Barcode_search_criteria_and_click_Find_button(String string) throws Throwable{
//		Actions actions = new Actions(driver);
//		CommonMethods.doubleClick(findScreenWindowElements.findFacilityFacilityNameSearch2Value);
//		Thread.sleep(0);
//		//CommonMethods.click(findScreenWindowElements.findFacilityFacilityNameSearch2Value);
//		JsCommonMethods.clearByJS(findScreenWindowElements.findFacilityFacilityNameSearch2Value);
//		Thread.sleep(1000);
//		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearch2Value).click().sendKeys(string).build().perform();
//		CommonMethods.click(findScreenWindowElements.FindButton);
//		
//	}
//	
//	@Then("Double-click search result again")
//	public void double_click_search_result_again() throws Throwable {
//		Thread.sleep(1000);
//		CommonMethods.doubleClick(findScreenWindowElements.FirstSearchResult);
//		
//	}
//	
//	@Then("Click OK button on the Find Assets to Receive screen")
//	public void click_OK_button_on_the_Find_Assets_to_Receive_screen() {
//		CommonMethods.click(findScreenWindowElements.OkButton);
//		
//	}
//		
	
}


	


