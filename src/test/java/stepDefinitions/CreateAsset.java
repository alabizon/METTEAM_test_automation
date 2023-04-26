package stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

public class CreateAsset extends CommonMethods {
	
	public static String Barcode;
	
	@When("Click Maintenance and click Assets")
	public void click_Maintenance_and_click_Assets() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintAssets.click();
		
	}
	
	@Then("Enter ID")
	public void enter_ID() {
		CommonMethods.swithToFrame(frames.Frame2);
		Barcode = "Asset_"+CommonMethods.getDateAsString();
		CommonMethods.waitForVisib(addAssetWindowElements.assetID);
		addAssetWindowElements.assetID.clear();
		CommonMethods.sendKeys(addAssetWindowElements.assetID, Barcode);
		
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		ExcelUtility.writeStringRow(Barcode, Constants.ASSET_CELL);
		ExcelUtility.writeExcel(Constants.TESTDATA_FILEPATH);
		
	}
	
	@Then("Enter Barcode")
	public void enter_Barcode() throws Throwable {
		addAssetWindowElements.assetBarcode.clear();
		CommonMethods.sendKeys(addAssetWindowElements.assetBarcode, Barcode);
		
	}
	
	@Then("Enter Serial_Number")
	public void enter_Serial_Number() {
		CommonMethods.sendKeys(addAssetWindowElements.assetSerialNum, "TestSerialNumber");
		
	}
	
	@Then("Click ellipsis button next to Customer field")
	public void click_ellipsis_button_next_to_Customer_field() {
		CommonMethods.click(addAssetWindowElements.elipsisButtonCustomer);
		
	}
	
	@Then("Click ellipsis button next to Department field")
	public void click_ellipsis_button_next_to_Department_field() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		Thread.sleep(1000);
		CommonMethods.click(addAssetWindowElements.elipsisButtonDepartment);
		
	}
	
	@Then("Enter {string} to search criteria and click Find button")
	public void enter_to_search_criteria_and_click_Find_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.waitForVisib(findScreenWindowElements.findFacilityFacilityNameSearchValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


	


