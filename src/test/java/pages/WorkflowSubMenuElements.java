package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class WorkflowSubMenuElements extends BaseClass {

	// Workflow -> Receiving menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[1]")
	public WebElement wflowReceiving;
	
	// Workflow -> WorkOrders menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[2]")
	public WebElement wflowWorkOrders;
		
	// Workflow -> Returning menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[3]")
	public WebElement wflowReturning;
		
	// Workflow -> Shipping menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[4]")
	public WebElement wflowShipping;
		
	// Workflow -> BatchChange menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[5]")
	public WebElement wflowBatchChange;
		
	// Workflow -> ToolAssignments menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[6]")
	public WebElement wflowToolAssignments;
	
	// Workflow -> CombineWorkOrders menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[7]")
	public WebElement wflowCombineWorkOrders;
	
	// Workflow -> MyWork menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[8]")
	public WebElement wflowMuWork;
	
	
public WorkflowSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

