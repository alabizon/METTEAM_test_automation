package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class CreateTemplate extends CommonMethods {
	
	@When("Click Maintenance and click Manual Templates")
	public void click_Maintenance_and_click_Manual_Templates() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintManualTemplates.click();

	}

	@Then("{string} window is open and enter Template Name and click Template_Design tab")
	public void window_is_open_and_enter_Template_Name_and_click_Template_Design_tab(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.sendKeys(addTemplateWindowElements.tempateName, "Template_"+CommonMethods.getDateAsString());
		CommonMethods.click(addTemplateWindowElements.templateTabTemplateDesign);
		
	}
	
	@Then("Right-click and select {string} from context menu")
	public void right_click_and_select_from_context_menu(String string) throws Throwable {
		CommonMethods.waitForVisib(addTemplateWindowElements.templateDesignSpace);
		CommonMethods.rightClick(addTemplateWindowElements.templateDesignSpace);
		//CommonMethods.waitForVisib(addTemplateWindowElements.templateSubmenuAddRow);
		CommonMethods.click(addTemplateWindowElements.templateSubmenuAddRow);
		Thread.sleep(2000);
		
	}
	
	
}


	


