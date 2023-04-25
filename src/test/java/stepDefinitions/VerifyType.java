package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;
import org.openqa.selenium.interactions.Actions;

public class VerifyType extends CommonMethods {
	
	public static String TypeDescription;
	public static String FieldContent;
	
	@Then("Find {string} by entering Description and click Find button")
	public void find_by_entering_Description_and_click_Find_button(String string) {
		ExcelUtility.openExcel(Constants.TESTDATA_FILEPATH);
		ExcelUtility.getSheet("TestExel");
		TypeDescription=ExcelUtility.getCellData(Constants.TYPE_CELL, 0);
		CommonMethods.swithToFrame(frames.Frame1);
		Actions actions = new Actions(driver);
		actions.moveToElement(selectShipItemsWindowElements.findShipItemBarcodeSearchValue).click().sendKeys(TypeDescription).build().perform();
		CommonMethods.click(selectShipItemsWindowElements.FindButton);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	


