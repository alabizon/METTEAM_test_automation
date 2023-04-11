package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AssignGroupsWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Assign Groups page
	 */
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[1]")
	public WebElement assignGroupAdmin;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[2]")
	public WebElement assignGroupConfig;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[3]")
	public WebElement assignGroupUser;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[4]")
	public WebElement assignGroupEditProc;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[5]")
	public WebElement assignGroupRunProc;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[6]")
	public WebElement assignGroupConfigInstr;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[7]")
	public WebElement assignGroupDataCheckAdmin;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[8]")
	public WebElement assignGroupImport;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[9]")
	public WebElement assignGroupCustPortal;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first '])[10]")
	public WebElement assignGroupEditResults;
	
	@FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement buttonSave;
	
	@FindBy (id = "/html/body/div[1]/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[10]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement buttonClose;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-1 x-grid3-cell-last ']/div")
	public List<WebElement> groupsListName;
	
	/**
	 * End Elements Assign Groups page
	 */
	
public AssignGroupsWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}