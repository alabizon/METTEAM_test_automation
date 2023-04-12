package testBase;

import pages.AddAccreditationWindowElements;
import pages.AddAssetWindowElements;
import pages.AddContactWindowElements;
import pages.AddGroupWindowElements;
import pages.AddPartWindowElements;
import pages.AddProcedureWindowElements;
import pages.AddShipItemWindowElements;
import pages.AddShippingWindowElements;
import pages.AddTemplateWindowElements;
import pages.AddTypeWindowElements;
import pages.AddUserWindowElements;
import pages.AssignGroupsWindowElements;
import pages.AttachDataSheetElements;
import pages.CategoryWindowElements;
import pages.ConfigureSubMenuElements;
import pages.ConsoleMenuMetTeamElements;
import pages.EditWorkOrderElements;
import pages.FindFacilityAddressWindowElements;
import pages.FindFacilityWindowElements;
import pages.FindScreenWindowElements;
import pages.FindTypeWindowElements;
import pages.FindUserWindowElements;
import pages.Frames;
import pages.LoginPageElements;
import pages.MaintenanceSubMenuElements;
import pages.SelectShipItemsWindowElements;
import pages.SetupSubMenuElements;
import pages.WorkflowSubMenuElements;


public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static Frames frames;
	protected static ConsoleMenuMetTeamElements concoleMenuMetTeamElements;
	protected static MaintenanceSubMenuElements maintenanceSubMenuElements;
	protected static FindScreenWindowElements findScreenWindowElements;
	protected static AddAssetWindowElements addAssetWindowElements;
	protected static FindTypeWindowElements findTypeWindowElements;
	protected static EditWorkOrderElements editWorkOrderElements;
	protected static AddProcedureWindowElements addProcedureWindowElements;
	protected static AttachDataSheetElements attachDataSheetElements;
	protected static CategoryWindowElements categoryWindowElements;
	protected static AddTypeWindowElements addTypeWindowElements;
	protected static FindFacilityWindowElements findFacilityWindowElements;
	protected static AddPartWindowElements addPartWindowElements;
	protected static FindUserWindowElements findUserWindowElements;
	protected static AddAccreditationWindowElements addAccreditationWindowElements;
	protected static AddTemplateWindowElements addTemplateWindowElements;
	protected static SetupSubMenuElements setupSubMenuElements;
	protected static AddContactWindowElements addContactWindowElements;
	protected static AddUserWindowElements addUserWindowElements;
	protected static AssignGroupsWindowElements assignGroupsWindowElements;
	protected static AddGroupWindowElements addGroupWindowElements;
	protected static ConfigureSubMenuElements configureSubMenuElements;
	protected static WorkflowSubMenuElements workflowSubMenuElements;
	protected static AddShippingWindowElements addShippingWindowElements;
	protected static FindFacilityAddressWindowElements findFacilityAddressWindowElements;
	protected static AddShipItemWindowElements addShipItemWindowElements;
	protected static SelectShipItemsWindowElements selectShipItemsWindowElements;
	public static void initializePageObjects() {
		findScreenWindowElements = new FindScreenWindowElements();
		loginPageElements = new LoginPageElements();
		frames = new Frames();
		concoleMenuMetTeamElements = new ConsoleMenuMetTeamElements();
		maintenanceSubMenuElements = new MaintenanceSubMenuElements();
		addAssetWindowElements = new AddAssetWindowElements();
		findTypeWindowElements = new FindTypeWindowElements();
		editWorkOrderElements = new EditWorkOrderElements();
		addProcedureWindowElements = new AddProcedureWindowElements();
		attachDataSheetElements = new AttachDataSheetElements();
		categoryWindowElements = new CategoryWindowElements();
		addTypeWindowElements = new AddTypeWindowElements();
		findFacilityWindowElements = new FindFacilityWindowElements();
		addPartWindowElements = new AddPartWindowElements();
		findUserWindowElements = new FindUserWindowElements();
		addAccreditationWindowElements = new AddAccreditationWindowElements();
		addTemplateWindowElements = new AddTemplateWindowElements();
		setupSubMenuElements = new SetupSubMenuElements();
		addContactWindowElements = new AddContactWindowElements();
		addUserWindowElements = new AddUserWindowElements();
		assignGroupsWindowElements = new AssignGroupsWindowElements();
		addGroupWindowElements = new AddGroupWindowElements();
		configureSubMenuElements = new ConfigureSubMenuElements();
		workflowSubMenuElements = new WorkflowSubMenuElements();
		addShippingWindowElements = new AddShippingWindowElements();
		findFacilityAddressWindowElements = new FindFacilityAddressWindowElements();
		addShipItemWindowElements = new AddShipItemWindowElements();
		selectShipItemsWindowElements = new SelectShipItemsWindowElements();
			
	}
}
