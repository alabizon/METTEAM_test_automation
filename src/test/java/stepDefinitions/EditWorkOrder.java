package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class EditWorkOrder extends CommonMethods {
	
	public static String FieldContent;
	
	@When("Click Workflow and click Work Orders")
	public void click_Workflow_and_click_Work_Orders() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnWorkflow);
		Thread.sleep(2000);
		CommonMethods.click(workflowSubMenuElements.wflowWorkOrders);
		
	}
	
	@Then("Click Labor tab")
	public void click_Labor_tab() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.click(editWorkOrderElements.woLaborFilesTab);
		
	}
	
	@Then("Click Edit Labor button")
	public void click_Edit_Labor_button() {
		CommonMethods.click(editWorkOrderElements.woLaborEditButton);
		
	}
	
	@Then("Click Close button on Edit Labor screen")
	public void click_Close_button_on_Edit_Labor_screen() {
		CommonMethods.clickElementByIndex(addLaborWindowElements.addLaborCloseButton, 0);
		
	}
	
}


	


