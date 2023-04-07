package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class CreateUser extends CommonMethods {
	
	@When("Click Setup and click Users")
	public void click_Setup_and_click_Userss() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnSetup);
		Thread.sleep(1000);
		CommonMethods.click(setupSubMenuElements.setupUsers);
		
	}
	
	@Then("Enter First_Name and enter Last_Name")
	public void enter_First_Name_and_enter_Last_Name() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addUserWindowElements.userFirstName, "John");
		CommonMethods.sendKeys(addUserWindowElements.userLastName, "Doe");
		
	}
	
	@Then("Enter Initials and enter Username")
	public void enter_Initials_and_enter_Username() {
		CommonMethods.sendKeys(addUserWindowElements.userInitials, "JD");
		CommonMethods.sendKeys(addUserWindowElements.userUsername, "jdoe");
		
	}
	
	@Then("Enter Password and enter Email1")
	public void enter_Password_and_enter_Email1() {
		CommonMethods.sendKeys(addUserWindowElements.userPassword, "jdoe");
		CommonMethods.sendKeys(addUserWindowElements.userEmail1, "test1@test.com");
		
	}
	
	@Then("Enter Phone1 and enter Phone2")
	public void enter_Phone1_and_enter_Phone2() {
		CommonMethods.sendKeys(addUserWindowElements.userPhone1, "123-456-7890");
		CommonMethods.sendKeys(addUserWindowElements.userPhone2, "987-654-3210");
		
	}
	
	@Then("Enter Stamp_Number and Employee_Number")
	public void enter_Stamp_Number_and_Employee_Number() {
		CommonMethods.sendKeys(addUserWindowElements.userStampNumber, "1234");
		CommonMethods.sendKeys(addUserWindowElements.userEmployeeNumber, "5678");
		
	}
	
	@Then("Enter Pay_Grade and click Save button")
	public void enter_Pay_Grade_and_click_Save_button() {
		CommonMethods.sendKeys(addUserWindowElements.userPayGrade, "1");
		CommonMethods.click(addUserWindowElements.buttonSave);
		
	}
	
	@Then("Click OK on the alert and {string} windows is open")
	public void click_OK_on_the_alert_and_windows_is_open(String string) throws Throwable {
		Thread.sleep(3000);
		CommonMethods.click(addUserWindowElements.okOnAlert);
		
	}
	
	@Then("Click Find button and double-click the first grid record")
	public void click_Find_button_and_double_click_the_first_grid_record() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.click(findFacilityWindowElements.FindButton);
		CommonMethods.waitForVisib(findFacilityWindowElements.topFacilityFromTopGrid);
		CommonMethods.doubleClick(findFacilityWindowElements.topFacilityFromTopGrid);
		
	}
	
	@Then("Click Groups button and {string} window is open")
	public void click_Groups_button_and_window_is_open(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addUserWindowElements.buttonGroups);
		
	}
	
	@Then("Click all checkboxes and click Save button")
	public void click_all_checkboxes_and_click_Save_button() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		CommonMethods.click(assignGroupsWindowElements.assignGroupAdmin);
		CommonMethods.click(assignGroupsWindowElements.assignGroupConfig);
		CommonMethods.click(assignGroupsWindowElements.assignGroupUser);
		CommonMethods.click(assignGroupsWindowElements.assignGroupEditProc);
		CommonMethods.click(assignGroupsWindowElements.assignGroupRunProc);
		CommonMethods.click(assignGroupsWindowElements.assignGroupConfigInstr);
		CommonMethods.click(assignGroupsWindowElements.assignGroupDataCheckAdmin);
		CommonMethods.click(assignGroupsWindowElements.assignGroupImport);
		CommonMethods.click(assignGroupsWindowElements.assignGroupCustPortal);
		CommonMethods.click(assignGroupsWindowElements.assignGroupEditResults);
		CommonMethods.click(assignGroupsWindowElements.buttonSave);
		
	}
	
	@Then("Click Logoff button")
	public void click_Logoff_button() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.click(concoleMenuMetTeamElements.btnLogoff);
		Thread.sleep(2000);
		
	}
	
	@Then("Enter Username and enter Password")
	public void enter_Username_and_enter_Password() {
		CommonMethods.sendKeys(loginPageElements.login, "jdoe");
		CommonMethods.sendKeys(loginPageElements.password, "jdoe");
		
	}
	
	@Then("Click Log-in button")
	public void click_Log_in_button() throws Throwable {
		CommonMethods.click(loginPageElements.logInButton);
		Thread.sleep(2000);
		
	}
	
}


	


