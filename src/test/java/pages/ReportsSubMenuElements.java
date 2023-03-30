package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ReportsSubMenuElements extends BaseClass {

	// Reports -> Recall menu item 
	@FindBy (id = "ext-gen96")
	public WebElement reportRecall;
	
	// Reports -> Batch Printing menu item 
	@FindBy (id = "ext-gen99")
	public WebElement reportBatchPrinting;
		
	// Reports -> Custom Reports menu item 
	@FindBy (id = "ext-gen102")
	public WebElement reportCustomReports;
		
	// Reports -> Alerting Schedules menu item 
	@FindBy (id = "ext-gen105")
	public WebElement reportAlertingSchedules;
		

public ReportsSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

