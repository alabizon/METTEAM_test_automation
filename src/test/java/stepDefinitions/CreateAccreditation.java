package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class CreateAccreditation extends CommonMethods {
	
	public static String AccreditationCode;
	
	@When("Click Maintenance and click Accreditations")
	public void click_Maintenance_and_click_Accreditations() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintAccreditations.click();

	}

	@Then("{string} window opens")
	public void window_opens(String string) {
		CommonMethods.waitForVisib(frames.Frame1);
		CommonMethods.swithToFrame(frames.Frame1);
		
	}
	
	@Then("Click Add button and {string} window is open")
	public void click_Add_button_and_window_is_open(String string) {
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);		
		
	}
	
	@Then("Enter Code and enter Type and enter Description")
	public void enter_Code_and_enter_Type_and_enter_Description() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addAccreditationWindowElements.accredCode);
		AccreditationCode = "Accreditation_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addAccreditationWindowElements.accredCode, AccreditationCode);
			
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.ACCREDITATION_CELL, 1, AccreditationCode);
		
		CommonMethods.sendKeys(addAccreditationWindowElements.accredType, "22");
		CommonMethods.sendKeys(addAccreditationWindowElements.accredDescription, "Auto");
		
	}
	
	@Then("Enter Start_Date and enter End_Date")
	public void enter_Start_Date_and_enter_End_Date() {
		CommonMethods.sendKeys(addAccreditationWindowElements.accredStartDate, "07/15/2022");
		CommonMethods.sendKeys(addAccreditationWindowElements.accredEndDate, "11/22/2022");
		
	}
	
	
}


	


