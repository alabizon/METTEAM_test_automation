package stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class VerifyAccreditation extends CommonMethods {
	
	public static String AccreditationCode;
	public static String FieldContent;
	
	@Then("Enter search value for the Accreditation Code and click Find button")
	public void enter_search_value_for_the_Accreditation_Code_and_click_Find_button() throws Throwable {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		AccreditationCode=ExcelUtility.getCellData(Constants.ACCREDITATION_CELL, 0);
		CommonMethods.swithToFrame(frames.Frame1);
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectShipItemsWindowElements.findShipItemBarcodeSearchValue).click().sendKeys(AccreditationCode).build().perform();
		CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


	


