package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConsoleMenuMetTeamElements extends BaseClass{

	// File menu item
	@FindBy (id = "ext-gen19")
	public WebElement btnFile;
	
	// Workflow menu item
	@FindBy (id = "ext-gen21")
	public WebElement btnWorkflow;
	
	// Maintenance menu item
	@FindBy (id = "ext-gen23")
	public WebElement btnMaintenance;
	
	// Management menu item
	@FindBy (id = "ext-gen25")
	public WebElement btnManagement;
	
	// Reports menu item
	@FindBy (id = "ext-gen27")
	public WebElement btnReports;
	
	// Setup menu item
	@FindBy (id = "ext-gen29")
	public WebElement btnSetup;
	
	// Help menu item
	@FindBy (id = "ext-gen31")
	public WebElement btnHelp;
	
	// Configure menu item
	@FindBy (id = "ext-gen33")
	public WebElement btnConfigure;
	
	
public ConsoleMenuMetTeamElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}
