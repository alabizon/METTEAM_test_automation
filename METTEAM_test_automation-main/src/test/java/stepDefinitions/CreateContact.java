package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SetupSubMenuElements;
import utils.CommonMethods;
import utils.JsCommonMethods;
import org.openqa.selenium.interactions.Actions;

public class CreateContact extends CommonMethods {
	
	@When("Click Setup and click Contacts")
	public void click_Setup_and_click_Contacts() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnSetup);
		Thread.sleep(1000);
		CommonMethods.click(setupSubMenuElements.setupContacts);
		CommonMethods.waitForVisib(frames.Frame1);
		
	}
	
	@Then("{string} window is open")
	public void window_is_open(String string) {
		
	}

	@Then("Enter Contact_Id and enter First_Name and enter Middle_Name")
	public void enter_Contact_Id_and_enter_First_Name_and_enter_Middle_Name() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addContactWindowElements.contactId, "Contact_"+CommonMethods.getDateAsString());
		CommonMethods.sendKeys(addContactWindowElements.contactFirstName, "John");
		CommonMethods.sendKeys(addContactWindowElements.contactMiddleName, "Bill");
		
	}
	
	@Then("Enter Last_Name and Enter Suffix and enter Description")
	public void enter_Last_Name_and_Enter_Suffix_and_enter_Description() {
		CommonMethods.sendKeys(addContactWindowElements.contactLastName, "Doe");
		CommonMethods.sendKeys(addContactWindowElements.contactSuffix, "Jr.");
		CommonMethods.sendKeys(addContactWindowElements.contactDescription, "Employee");
		
	}
	
	@Then("Enter Fax and enter Phone1")
	public void enter_Fax_and_enter_Phone1() {
		CommonMethods.sendKeys(addContactWindowElements.contactFax, "1234");
		CommonMethods.sendKeys(addContactWindowElements.contactPhone1, "9298875430");
		
	}
	
	@Then("Enter Phone2 and enter Cell_Phone")
	public void enter_Phone2_and_enter_Cell_Phone() {
		CommonMethods.sendKeys(addContactWindowElements.contactPhone2, "9287763287");
		CommonMethods.sendKeys(addContactWindowElements.contactCellPhone, "9292287645");
		
	}
	
	@Then("Enter Email1 and enter Notes")
	public void enter_Email1_and_enter_Notes() {
		CommonMethods.sendKeys(addContactWindowElements.contactEmail1, "email1@test.com");
		CommonMethods.sendKeys(addContactWindowElements.contactNotes, "Test_Notes");
		
	}
	
	@Then("Click Save button and click Add button next to Facilities grid")
	public void click_Save_button_and_click_Add_button_next_to_Facilities_grid() throws Throwable {
		CommonMethods.click(addContactWindowElements.buttonSave);
		Thread.sleep(2000);
		CommonMethods.click(addContactWindowElements.buttonAddFacility);
	
	}
	
	@Then("Click OK button")
	public void click_OK_button() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.click(findFacilityWindowElements.OkButton);
		
	}
	
	@Then("Click OK button on the Contacts screen")
	public void click_OK_button_on_the_Contacts_screen() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(addContactWindowElements.buttonClose);
	}
	
}


	


