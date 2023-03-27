package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConsoleMenuMetTeamElements extends BaseClass{

	// File menu item
	@FindBy (id = "btn-mnuFile")
	public WebElement btnFile;
	
	// Workflow menu item
	@FindBy (id = "btn-mnuWorkflow")
	public WebElement btnWorkflow;
	
	// Maintenance menu item
	@FindBy (id = "btn-mnuMaintenance")
	public WebElement btnMaintenance;
	
	// Management menu item
	@FindBy (id = "btn-mnuManagement")
	public WebElement btnManagement;
	
	// Reports menu item
	@FindBy (id = "btn-mnuReports")
	public WebElement btnReports;
	
	// Setup menu item
	@FindBy (id = "btn-mnuSetup")
	public WebElement btnSetup;
	
	// Help menu item
	@FindBy (id = "btn-mnuHelp")
	public WebElement btnHelp;
	
	// Configure menu item
	@FindBy (id = "btn-mnuSystem")
	public WebElement btnConfigure;
	
	
public ConsoleMenuMetTeamElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}
