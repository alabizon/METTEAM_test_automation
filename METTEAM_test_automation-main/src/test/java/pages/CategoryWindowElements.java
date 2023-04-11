package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class CategoryWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Procedure page
	 */
	
	@FindBy (xpath = "//*[@class='x-grid3-body']/div")
	public List<WebElement> categoryList;
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[7]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement categoryOk;
	
	/**
	 * End Elements Add Procedure page
	 */
	
public CategoryWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}