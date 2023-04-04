	package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConsoleMenuMetTeamElements extends BaseClass{

	// File menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[1]")
	public WebElement btnFile;
	
	// Workflow menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[2]")
	public WebElement btnWorkflow;
	
	// Maintenance menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[3]")
	public WebElement btnMaintenance;
	
	// Management menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[4]")
	public WebElement btnManagement;
	
	// Reports menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[5]")
	public WebElement btnReports;
	
	// Setup menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[6]")
	public WebElement btnSetup;
	
	// Help menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[7]")
	public WebElement btnHelp;
	
	// Configure menu item
	@FindBy (xpath = "(//*[@class = ' x-btn-text'])[8]")
	public WebElement btnConfigure;
	
	
public ConsoleMenuMetTeamElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}
