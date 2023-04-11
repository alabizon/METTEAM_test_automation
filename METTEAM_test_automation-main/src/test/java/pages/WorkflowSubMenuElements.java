package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class WorkflowSubMenuElements extends BaseClass {

	// Workflow -> Receiving menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[1]/a/span")
	public WebElement wflowReceiving;
	
	// Workflow -> WorkOrders menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[2]/a/span")
	public WebElement wflowWorkOrders;
		
	// Workflow -> Returning menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[3]/a/span")
	public WebElement wflowReturning;
		
	// Workflow -> Shipping menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[5]/a/span")
	public WebElement wflowShipping;
		
	// Workflow -> BatchChange menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[6]/a/span")
	public WebElement wflowBatchChange;
		
	// Workflow -> ToolAssignments menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[7]/a/span")
	public WebElement wflowToolAssignments;
	
	// Workflow -> CombineWorkOrders menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[8]/a/span")
	public WebElement wflowCombineWorkOrders;
	
	// Workflow -> MyWork menu item 
	@FindBy (xpath = "/html/body/div[5]/ul/li[10]/a/span")
	public WebElement wflowMuWork;
	
	
public WorkflowSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

