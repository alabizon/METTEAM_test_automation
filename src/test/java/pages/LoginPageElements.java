package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPageElements extends BaseClass {
	
 /**
 * Beginning Elements from LoginPage
 */
	// Username field
	@FindBy (id = "username")
	public WebElement login;
	
	// Password field
	@FindBy(id = "password")
	public WebElement password;
	
	// Log-in button
	@FindBy (id ="btn-auth-submit")
	public WebElement logInButton;
	
	// Change Password link
	@FindBy (id ="btn-auth-password")
	public WebElement changePassword;
	
	// Error window title
	@FindBy (id = "ext-gen39")
	public WebElement errorWindowsHeader; 
	
	// Change Password window title
	@FindBy (id = "lbl-newPassword")
	public WebElement changePasswordTitle; 
	
	// Change Password Save button
	@FindBy (id = "btn-saveNewPwd")
	public WebElement changePasswordSave; 
	
	// Change Password Cancel button
	@FindBy (id = "btn-cancelNewPwd")
	public WebElement changePasswordCancel;
	
	// Error window text
	@FindBy (id = "ext-gen47")
	public WebElement errorWindowsText; 
	
     // Ok button from the Error message. 
	 @FindBy (id = "btn-id-OK")
	 public WebElement 	okButton;
	 
	 /**
	 * End Elements from LoginPage
	 */
	 
	 // Logged in user from the main page
	 @FindBy (id = "logged-in-user")
	 public WebElement howYouLoginText;
	
	
	public LoginPageElements() {
		
	    PageFactory.initElements(driver, this);
		}
}
