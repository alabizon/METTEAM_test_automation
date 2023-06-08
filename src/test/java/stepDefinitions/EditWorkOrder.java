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
		Thread.sleep(1000);
		CommonMethods.click(workflowSubMenuElements.wflowWorkOrders);
		
	}
	
}


	


