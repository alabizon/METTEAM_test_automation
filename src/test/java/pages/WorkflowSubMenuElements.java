package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class WorkflowSubMenuElements extends BaseClass {

	// Workflow -> Receiving menu item 
	@FindBy (id = "txt-mnuWorkflowReceiving")
	public WebElement wflowReceiving;
	
	// Workflow -> WorkOrders menu item 
	@FindBy (id = "txt-mnuWorkflowWorkOrders")
	public WebElement wflowWorkOrders;
		
	// Workflow -> Returning menu item 
	@FindBy (id = "txt-mnuReturning")
	public WebElement wflowreturning;
		
	// Workflow -> Shipping menu item 
	@FindBy (id = "txt-mnuShipping")
	public WebElement wflowShipping;
		
	// Workflow -> BatchChange menu item 
	@FindBy (id = "txt-mnuBatchChange")
	public WebElement wflowBatchChange;
		
	// Workflow -> ToolAssignments menu item 
	@FindBy (id = "txt-mnuWorkflowTools")
	public WebElement wflowToolAssignments;
	
	// Workflow -> CombineWorkOrders menu item 
	@FindBy (id = "txt-mnuCombineWorkOrders")
	public WebElement wflowCombineWorkOrders;
	
	// Workflow -> MyWork menu item 
	@FindBy (id = "txt-mnuMyWork")
	public WebElement wflowMuWork;
	
	
public WorkflowSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

