package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class CreateAccreditation extends CommonMethods {
	
	@When("Click Maintenance and click Accreditations")
	public void click_Maintenance_and_click_Accreditations() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintAccreditations.click();

		
	}

	@Then("{string} wind is open and click Add button")
	public void wind_is_open_and_click_Add_button(String string) throws Throwable {
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		
	}
	
	
	@Then("Enter Type and enter Description")
	public void enter_Type_and_enter_Description() {
		driver.switchTo().defaultContent();
		CommonMethods.waitForVisib(frames.Frame2);
		CommonMethods.sendKeys(addAccreditationWindowElements.accredType, "Test Type");
		CommonMethods.sendKeys(addAccreditationWindowElements.accredDescription, "Test Descr");
	}
	
	
	@Then("{string} wnd is open and enter Code")
	public void wnd_is_open_and_enter_Code(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.waitForVisib(frames.Frame2);
		//JsCommonMethods.enterValueByJS(addAccreditationWindowElements.accredCode, "Test Accreditation");
		CommonMethods.sendKeys(addAccreditationWindowElements.accredCode, "Test Accreditation");
		
	}
	
	
	
}


	


