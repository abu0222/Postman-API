package unitTests;

import issPageClasses.ChangeLocationModalPage;
import issPageClasses.HomePage;
import issPageClasses.Resources;
import issPageClasses.SignOnPage;
import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;
import platformIndependentCore.utilities.ConfigProperties;

/**
 * <b>Name :</b> VsecsHomePageTestScript.java
 * <p>
 * <b>Generated :</b> Dec 20, 2022
 * <p>
 * <b>Description :</b> Unit test for the VSECS HomePage.
 * <p>
 *
 * @since Apr 05, 2023
 * @author OITLEXGreenA
 */
public class HomePageTestScript extends TestScript {

	/** URL for SSOI login for the active test environment */
	protected static final String BROWSER = ConfigProperties.getValue("BROWSER");

	/**
	 * Main method
	 *
	 * @param args Args
	 */
	public static void main(String[] args) {
		runScript(args);
	}

	@Override
	public void testScript(Arguments args) {
		HomePage hp = new HomePage();
		ChangeLocationModalPage clmp = new ChangeLocationModalPage();
		Resources r = new Resources();

		hp.loadPage();
		SignOnPage sp = new SignOnPage();
		if (BROWSER.equals("FIREFOX")) {
			sp.clickSignInWithPIVCard();
		} else {
			sp.clickSignInWithWindowsAuthentication();
		}
		sleep(10);

		// Clicking the Main link
		hp.clickBtnMain();
		sleep(3);

		// Verify you are on Main page
		vpEquals("Verify you are on Main page", "Pending and Appointment Requests", r.readCurrentPageTitle());

		// Clicking the Patient Search link
		hp.clickBtnPatientSearch();
		sleep(3);

		// Verify you are on Patient Search page
		vpEquals("Verify you are on Patient Search page", "Patient Search", r.readCurrentPageTitle());

		hp.clickBtnHome();
		sleep(3);

		// Verify you are on Home page
		vpEquals("Verify you are on Home page", "ISS Integrated Scheduling Solutions", r.readCurrentPageTitle());

		// Click the Facility Location drop down
		hp.clickBtnFacilityLocation();
		sleep(3);

		// Verify you are on Change Location modal page is display
		vpEquals("Verify you are on Change Location page is displayed", true, clmp.isChangeLocationFormDisplayed());

		// Clicking the Change Location Close Button
		clmp.clickBtnChangeLocationClose();
		sleep(3);

		// Verify you are on Change Location modal page is no longer displayed
		vpEquals("Verify you are on Change Location page is no longer displayed", false,
				clmp.isChangeLocationFormDisplayed());

		// Clicking the Up and Down arrow
		hp.clickImgAngleUpDownArrow();
		sleep(3);

		// TO DO - Verify angle direction is down and header and footer are no longer
		// displayed

		// Verify angle direction is down
		vpEquals("Verify angle direction is down", "down", hp.readImgAngleUpDownArrowDirection());

		// Verify USA Banner is not displayed
		vpEquals("Verify USA Banner is not displayed", false, hp.isUsaBannerDisplayed());

		// Verify VA header is not displayed
		vpEquals("Verify VA header is not displayed", false, hp.isVaHeaderDisplayed());

		// Clicking the Up and Down arrow
		hp.clickImgAngleUpDownArrow();
		sleep(3);

		// Verify angle direction is up
		vpEquals("Verify angle direction is up", "up", hp.readImgAngleUpDownArrowDirection());

		// Verify USA Banner is displayed
		vpEquals("Verify USA Banner is displayed", true, hp.isUsaBannerDisplayed());

		// Verify VA header is displayed
		vpEquals("Verify VA header is displayed", true, hp.isVaHeaderDisplayed());

		// Verify USA Banner image alternate text
		vpEquals("Verify USA Banner image alternate text", "An official website of the United States government",
				hp.readImgAltTxtUsaBanner());

		// Verify USA Banner text
		vpEquals("Verify USA Banner text", "An official website of the United States government",
				hp.readTxtUsaBanner());

		// Verify USA Banner button text
		vpEquals("Verify USA Banner button text", "Here's how you know", hp.readBtnLblUsaBanner());

		// Click USA Banner button
		hp.clickBtnUsaBanner();
		sleep(5);

		// Verify Government image alternate text
		vpEquals("Verify Government image alternate text", "The .gov means it’s official",
				hp.readImgAltTxtGovernment());

		// Verify Government header text
		vpEquals("Verify Government header text", "The .gov means it’s official.", hp.readTxtHeaderGovernment());

		// Verify Government text
		vpEquals("Verify Government text",
				"Federal government websites often end in .gov or .mil. Before sharing sensitive information, make sure you’re on a federal government site.",
				hp.readTxtGovernment());

		// Verify Secure image alternate text
		vpEquals("Verify Secure image alternate text", "The site is secure", hp.readImgAltTxtSecure());

		// Verify Secure header text
		vpEquals("Verify Secure header text", "The site is secure.", hp.readTxtHeaderSecure());

		// Verify Secure text
		vpEquals("Verify Secure text",
				"The https:// ensures that you are connecting to the official website and that any information you provide is encrypted and transmitted securely.",
				hp.readTxtSecure());

		// Verify Accessibility link label
		vpEquals("Verify Accessibility link label", "Accessibility", hp.readLinkLblAccessibility());

		// Click the Accessibility link
		hp.clickLinkAccessibility();
		sleep(5);

		// Verify clicking Accessibility link goes to VA Section 508 Office url
		vpEquals("Verify clicking Accessibility link goes to VA Section 508 Office url", "VA Section 508 Office",
				r.readCurrentPageTitle());

		// Close current page
		r.closeCurrentBrowserTab();
		sleep(3);

		// Verify Office of Inspector General link label
		vpEquals("Verify Office of Inspector General link label", "Office of Inspector General",
				hp.readLinkLblOfficeofInspectorGeneral());

		// Click the Office of Inspector General link
		hp.clickLinkOfficeofInspectorGeneral();
		sleep(5);

		// Verify clicking Office of Inspector General link goes to VA Section 508
		// Office url
		vpEquals("Verify clicking Office of Inspector General link goes to VA Office of Inspector General url",
				"VA Office of Inspector General", r.readCurrentPageTitle());

		// Close current page
		r.closeCurrentBrowserTab();
		sleep(3);

		// Verify Plain Language link label
		vpEquals("Verify Plain Language link label", "Plain Language", hp.readLinkLblPlainLanguage());

		// Click the Plain Language link
		hp.clickLinkPlainLanguage();
		sleep(5);

		// Verify clicking Plain Language link goes to VA Section 508 Office url
		vpEquals("Verify clicking Plain Language link goes to Plain Language url",
				"Plain Language (Updated for 2021) - Office of Public and Intergovernmental Affairs",
				r.readCurrentPageTitle());

		// Close current page
		r.closeCurrentBrowserTab();
		sleep(3);

		// Verify Privacy, Policies, and Legal Information link label
		vpEquals("Verify Privacy, Policies and Legal Information link label",
				"Privacy, Policies, and Legal Information", hp.readLinkLblPrivacyPoliciesAndLegalInformation());

		// Click the Privacy Policies and Legal Information link
		hp.clickLinkPrivacyPoliciesAndLegalInformation();
		sleep(5);

		// Verify clicking Accessibility link goes to VA Section 508 Office url
		vpEquals(
				"Verify clicking Privacy, Policies, and Legal Information link goes to Privacy, Policies, and Legal Information url",
				"Privacy, Policies, And Legal Information | Veterans Affairs", r.readCurrentPageTitle());

		// Close current page
		r.closeCurrentBrowserTab();
		sleep(3);

		// Verify that the home page has a label of Welcome to ISS
		vpEquals("Welcome to ISS text", "Welcome to ISS", hp.readTxtWelcomeToIss());

		// Verify that the home page has a label of Welcome to ISS
		vpEquals("Integrated Scheduling Solution text", "Integrated Scheduling Solution",
				hp.readTxtIntegratedSchedulingSolution());

		// Verify that the home page has a label of Welcome to ISS
		vpEquals("One Mission: Connect Veterans and Medical Providers text",
				"One Mission: Connect Veterans and Medical Providers",
				hp.readTxtOneMissionConnectVeteransAndMedicalProviders());

		// Verify App Version is displayed
		vpEquals("Verify App Version is displayed", true, hp.isAppVersionDisplayed());

		// Verify Sign Out button label
		vpEquals("Verify Sign Out button label", "Sign Out", hp.readBtnLblSignOut());

		// Click the Sign Out Button
		hp.clickBtnSignOut();
		sleep(3);

		// Verify clicking Sign Out goes to VA Identity and Access Management System
		// page
		vpEquals("Verify clicking Sign Out goes to VA Identity and Access Management System page",
				"VA Identity and Access Management System (IAM)", r.readCurrentPageTitle());

	}
}