package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class CategoryWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Category page
	 */
	
	@FindBy (xpath = "//*[@class='x-grid3-body']/div")
	public List<WebElement> categoryList;
	
	@FindBy (id = "tb-ok")
	public WebElement categoryOk;
	
	/**
	 * End Elements Add Category page
	 */
	
public CategoryWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}