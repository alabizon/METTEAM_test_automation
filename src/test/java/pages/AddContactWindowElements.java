package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddContactWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Contact page
	 */
	
	@FindBy (id = "cEmail2")
	public WebElement contactId;
	
	@FindBy (id = "cFirstName")
	public WebElement contactFirstName;
	
	@FindBy (id = "cMiddleName")
	public WebElement contactMiddleName;
	
	@FindBy (id = "cLastName")
	public WebElement contactLastName;
	
	@FindBy (id = "cSuffix")
	public WebElement contactSuffix;
	
	@FindBy (id = "cDescription")
	public WebElement contactDescription;
	
	@FindBy (id = "cFax")
	public WebElement contactFax;
	
	@FindBy (id = "cPhone1")
	public WebElement contactPhone1;
	
	@FindBy (id = "cPhone2")
	public WebElement contactPhone2;
	
	@FindBy (id = "cCellPhone")
	public WebElement contactCellPhone;
	
	@FindBy (id = "cEmail1")
	public WebElement contactEmail1;
	
	@FindBy (id = "mNotes")
	public WebElement contactNotes;
	
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[6]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement buttonSave;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div/table[1]/tbody/tr[2]/td[2]/em/button")
	public WebElement buttonAddFacility;
	
	@FindBy (xpath = "/html/body/div[1]/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[9]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Contact page
	 */
	
public AddContactWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}