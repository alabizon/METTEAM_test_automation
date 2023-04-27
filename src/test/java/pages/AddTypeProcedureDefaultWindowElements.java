package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddTypeProcedureDefaultWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Type Procedure Default page
	 */
	
	@FindBy (xpath = "//*[@id ='nProcedureUID_display']/following-sibling::img")
	public WebElement elipsisButtonProcName;
	
	@FindBy (id = "nProcedureUID_display")
	public WebElement defprocProcedureName;
	
	@FindBy (xpath = "//*[@id ='nAttTemplateUID_display']/following-sibling::img")
	public WebElement elipsisButtonDataSheet;
	
	@FindBy (id = "nAttTemplateUID_display")
	public WebElement defprocDataSheet;
	
	@FindBy (xpath = "//*[@type= 'text' and @id='cInterval']")
	public WebElement defprocInterval;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Yes')]")
	public WebElement defprocAttnYes;
	
	@FindBy (id = "btnSave")
	public WebElement defprocSave;
	
	@FindBy (id = "tbClose")
	public WebElement defprocClose;
	
	/**
	 * End Elements Add Type page
	 */
	
public AddTypeProcedureDefaultWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}