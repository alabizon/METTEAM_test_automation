package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class WorkflowSubMenuElements extends BaseClass {

	// Workflow -> Receiving menu item 
	@FindBy (id = "ext-gen110")
	public WebElement wflowReceiving;
	
	// Workflow -> WorkOrders menu item 
	@FindBy (id = "ext-gen112")
	public WebElement wflowWorkOrders;
		
	// Workflow -> Returning menu item 
	@FindBy (id = "ext-gen114")
	public WebElement wflowReturning;
		
	// Workflow -> Shipping menu item 
	@FindBy (id = "ext-gen117")
	public WebElement wflowShipping;
		
	// Workflow -> BatchChange menu item 
	@FindBy (id = "ext-gen119")
	public WebElement wflowBatchChange;
		
	// Workflow -> ToolAssignments menu item 
	@FindBy (id = "ext-gen121")
	public WebElement wflowToolAssignments;
	
	// Workflow -> CombineWorkOrders menu item 
	@FindBy (id = "ext-gen123")
	public WebElement wflowCombineWorkOrders;
	
	// Workflow -> MyWork menu item 
	@FindBy (id = "ext-gen126")
	public WebElement wflowMuWork;
	
	
public WorkflowSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

