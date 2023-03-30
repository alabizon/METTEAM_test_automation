package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Frames extends BaseClass {
	
	/**
	 * Beginning Elements from Frames
	 */
	
	//this element switch to frame from main page
	@FindBy (xpath = "//*[@id =\"frame_1\"]")
	public WebElement Frame1;
	
	//this element switch to Add frame from find screen
	@FindBy (xpath = "//*[@id =\"frame_2\"]")
	public WebElement Frame2;
	
	//this element switch to frame from Add Asset screen to Find Facility screen
	@FindBy (id = "frame_3")
	public WebElement Frame3;
		     
	@FindBy (id = "frame_4")
	public WebElement Frame4;
	
	@FindBy (xpath = "//*[@id=\"frame_5\"]")
	public WebElement Frame5;
	
	@FindBy (xpath = "//*[@id=\"frame_6\"]")
	public WebElement Frame6;
	
	@FindBy (xpath = "//*[@id=\"frame_7\"]")
	public WebElement Frame7;
	
	@FindBy (xpath = "//*[@id=\"frame_8\"]")
	public WebElement Frame8;
	
	@FindBy (xpath = "//*[@id=\"frame_9\"]")
	public WebElement Frame9;
	
	@FindBy (xpath = "//*[@id=\"frame_10\"]")
	public WebElement Frame10;
	
	@FindBy (xpath = "//*[@id=\"frame_11\"]")
	public WebElement Frame11;
	
	@FindBy (xpath = "//*[@id=\"frame_12\"]")
	public WebElement Frame12;
	
	@FindBy (xpath = "//*[@id=\"frame_13\"]")
	public WebElement Frame13;
	
	@FindBy (xpath = "//*[@id=\"frame_14\"]")
	public WebElement Frame14;
	
	@FindBy (xpath = "//*[@id=\"frame_15\"]")
	public WebElement Frame15;
	
	@FindBy (xpath = "//*[@id=\"frame_16\"]")
	public WebElement Frame16;
	
	@FindBy (xpath = "//*[@id=\"frame_17\"]")
	public WebElement Frame17;
		
	public Frames() {
		
	    PageFactory.initElements(driver, this);
	    
	    /**
	     * End Elements from FindScreen
	     */ 
		
}
}