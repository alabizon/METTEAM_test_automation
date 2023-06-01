package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class CreateGroup extends CommonMethods {
	
	public static String GroupName;
	public static String MyGroup;
	public static boolean groupCheckBox = false;
	
	@When("Click Configure and click Groups")
	public void click_Configure_and_click_Groups() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnConfigure);
		Thread.sleep(1000);
		configureSubMenuElements.confGroups.click();
		CommonMethods.waitForVisib(frames.Frame1);
	}
	
	@Then("Enter Group_Name and click Save")
	public void enter_Group_Name_and_click_Save() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		
		GroupName = "Group_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addGroupWindowElements.groupName, GroupName);
		
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.GROUP_CELL, 1, GroupName);
				
		CommonMethods.click(addGroupWindowElements.groupBtnSave);
		Thread.sleep(1000);
		
	}
	
	@Then("Click Add New Member button and {string} window opens")
	public void click_Add_New_Member_button_and_window_opens(String string) {
		CommonMethods.click(addGroupWindowElements.groupAddNewMember);
		
	}
	
	@Then("Click Close button")
	public void click_Close_button() throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		Thread.sleep(1000);
		CommonMethods.click(addGroupWindowElements.groupBtnClose);
		
	}
	
	@Then("Fill Search_Value with {string} and click Find button")
	public void fill_Search_Value_with_and_click_Find_button(String string) throws Throwable {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame4);
		Thread.sleep(500);
		Actions actions = new Actions(driver);
		//CommonMethods.refreshElement();
		actions.moveToElement(findScreenWindowElements.findFacilityFacilityNameSearchValue).click().sendKeys(string).build().perform();
		CommonMethods.click(findScreenWindowElements.FindButton);
		
	}
	
	@Then("Click OK button from {string} screen")
	public void click_OK_button_from_screen(String string) {
		CommonMethods.click(findScreenWindowElements.OkButton);
		
	}
	
	@Then("{string} window opens and click Groups button")
	public void window_opens_and_click_Groups_button(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame5);
		CommonMethods.click(addUserWindowElements.buttonGroups);
		
	}
	
	@Then("{string} window is up")
	public void window_is_up(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame6);
		
	}
	
	@Then("Verify added group is assigned to the user and is selected")
	public void verify_added_group_is_assigned_to_the_user_and_is_selected() throws Throwable {
		
		Thread.sleep(500);
		for (int i = 0; i < assignGroupsWindowElements.groupsListName.size(); i++) {
				WebElement element = assignGroupsWindowElements.groupsListName.get(i);
				MyGroup = element.getText();
				
		}
		
		Assert.assertEquals("Recently added group is assigned", GroupName, MyGroup);

		for (int i = 0; i < assignGroupsWindowElements.groupListCheckbox.size(); i++) {
			WebElement element1 = assignGroupsWindowElements.groupListCheckbox.get(i);
			groupCheckBox = element1.isSelected();
			
			if (groupCheckBox = true && MyGroup.equalsIgnoreCase(GroupName))
				{
				
					Assert.assertTrue("Recently added group is selected", groupCheckBox);
					break;
				
				}

		}
			
	}
		
}


	


