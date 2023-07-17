package issPageClasses;


import platformIndependentCore.core.AutomatedObject;
import platformIndependentCore.core.Search;



/**
 * <b>Name :</b> IssHomePage.java
 * <p>
 * <b>Generated :</b> Dec 20, 2022
 * <p>
 * <b>Description :</b> Concrete class to work with objects on the ISS Home
 * page.
 * <p>
 *
 * @since Dec 20, 2022
 * @author VBAAUSJARAMJ
 */
public class HomePage extends IssBase {

	/**
	 * Constructor
	 */
	public HomePage() {
		setPageURL("iss");
	}

	/**
	 * page classes and resources
	 */
	Resources r = new Resources();

	/**
	 * get the Home button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnHome() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div[2]/div[1]/nav/ul/li[1]/a");
		return getObject(search);
	}

	/**
	 * read the Home button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblHome() {
		return getBtnHome().readText();
	}

	/**
	 * click the Home button.
	 */
	public void clickBtnHome() {
		getBtnHome().click();
		waitForPageLoad();
	}

	/**
	 * get the Main button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnMain() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div[2]/div[1]/nav/ul/li[2]/a");
		return getObject(search);
	}

	/**
	 * read the Main button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblMain() {
		return getBtnMain().readText();
	}

	/**
	 * click the Main button.
	 */
	public void clickBtnMain() {
		getBtnMain().click();
		waitForPageLoad();
	}

	/**
	 * get the Patient Search button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnPatientSearch() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div[2]/div[1]/nav/ul/li[3]/a");
		return getObject(search);
	}

	/**
	 * read the Patient Search button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblPatientSearch() {
		return getBtnPatientSearch().readText();
	}

	/**
	 * click the Patient Search button.
	 */
	public void clickBtnPatientSearch() {
		getBtnPatientSearch().click();
		waitForPageLoad();
	}

	/**
	 * get the Facility Location button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnFacilityLocation() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"facility-location-button\"]");
		return getObject(search);
	}

	/**
	 * read the Facility Location button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblFacilityLocation() {
		return getBtnFacilityLocation().readText();
	}

	/**
	 * click the Facility Location button.
	 */
	public void clickBtnFacilityLocation() {
		getBtnFacilityLocation().click();
		waitForPageLoad();
	}

	/**
	 * get Angle Up Down Arrow image object.
	 *
	 * @return arrow image object
	 */
	private AutomatedObject getImgAngleUpDownArrow() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div/div[2]/div/button[2]/i");
		return getObject(search);
	}

	/**
	 * click Angle Up Down Arrow.
	 */
	public void clickImgAngleUpDownArrow() {
		getImgAngleUpDownArrow().click();
		waitForPageLoad();
	}

	/**
	 * read Angle Up Down Arrow direction.
	 *
	 * @return angle direction string "up" or "down" based on arrow image direction
	 */
	public String readImgAngleUpDownArrowDirection() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div/div[2]/div/button[2]/i");
		String up = getImgAngleUpDownArrow().getPropertyValue("class");
		if (up.contains("fa-angle-up")) {
			return "up";
		} else {
			return "down";
		}
	}

	/**
	 * read Welcome To ISS text.
	 *
	 * @return text string
	 */
	public String readTxtWelcomeToIss() {
		Search search = getSearch();
		search.addCriteria("tag", "h1");
		return getObject(search).readText();
	}

	/**
	 * read Integrated Scheduling Solution text.
	 *
	 * @return text string
	 */
	public String readTxtIntegratedSchedulingSolution() {
		Search search = getSearch();
		search.addCriteria("tag", "h2");
		return getObject(search).readText();
	}

	/**
	 * read One Mission: Connect Veterans and Medical Providers text.
	 *
	 * @return text string
	 */
	public String readTxtOneMissionConnectVeteransAndMedicalProviders() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"root\"]/div/div[2]/main/div/div/div/p");
		return getObject(search).readText();
	}

	/**
	 * get USA banner object.
	 *
	 * @return banner object
	 */
	private AutomatedObject getUsaBanner() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"root\"]/div/div[1]/div");
		return getObject(search);
	}

	/**
	 * is the USA banner displayed
	 *
	 * @return true displayed
	 */
	public Boolean isUsaBannerDisplayed() {
		Search search = getSearch();
		search.addCriteria("class",
				"vads-l-grid-container vads-u-max-width--none vads-u-margin-x--auto vads-u-padding-y--0");
		return isObjectPresent(search);
	}

	/**
	 * is the VA Header displayed
	 *
	 * @return true displayed
	 */
	public Boolean isVaHeaderDisplayed() {
		Search search = getSearch();
		search.addCriteria("class", "vads-l-row vads-u-align-items--center vads-u-margin-top--1");
		return isObjectPresent(search);
	}

	/**
	 * is the VA Footer displayed
	 *
	 * @return true displayed
	 */
	public Boolean isVaFooterDisplayed() {
		Search search = getSearch();
		search.addCriteria("id", "app-footer");
		return isObjectPresent(search);
	}

	/**
	 * get USA banner button object.
	 *
	 * @return banner button object
	 */
	private AutomatedObject getBtnUsaBanner() {
		Search search = getSearch();
		search.addCriteria("class", "usa-accordion-button usa-banner-button");
		return getObject(search);
	}

	/**
	 * click USA banner button.
	 */
	public void clickBtnUsaBanner() {
		getBtnUsaBanner().click();
	}

	/**
	 * read USA banner button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblUsaBanner() {
		return getBtnUsaBanner().readText();
	}

	/**
	 * read USA banner text.
	 *
	 * @return banner text string
	 */
	public String readTxtUsaBanner() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"root\"]/div/div[1]/div/div[1]/div/p");
		return getObject(search).readText();
	}

	/**
	 * get USA banner image object.
	 *
	 * @return image object
	 */
	private AutomatedObject getImgUsaBanner() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"root\"]/div/div[1]/div/div[1]/div/img");
		return getObject(search);
	}

	/**
	 * read USA banner image alt text.
	 *
	 * @return alt text string
	 */
	public String readImgAltTxtUsaBanner() {
		return getImgUsaBanner().getPropertyValue("alt");
	}

	/**
	 * get Government image object.
	 *
	 * @return image object
	 */
	private AutomatedObject getImgGovernment() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[1]/div/div[1]/img");
		return getObject(search);
	}

	/**
	 * read Government header text.
	 *
	 * @return government header text string
	 */
	public String readTxtHeaderGovernment() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[1]/div/div[2]/p[1]");
		return getObject(search).readText();
	}

	/**
	 * read Government text.
	 *
	 * @return government text string
	 */
	public String readTxtGovernment() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[1]/div/div[2]/p[2]");
		return getObject(search).readText();
	}

	/**
	 * read Government image alt text.
	 *
	 * @return alt text string
	 */
	public String readImgAltTxtGovernment() {
		return getImgGovernment().getPropertyValue("alt");
	}

	/**
	 * get Secure image object.
	 *
	 * @return image object
	 */
	private AutomatedObject getImgSecure() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[2]/div/div[1]/img");
		return getObject(search);
	}

	/**
	 * read Secure image alt text.
	 *
	 * @return alt text string
	 */
	public String readImgAltTxtSecure() {
		return getImgSecure().getPropertyValue("alt");
	}

	/**
	 * read Secure header text.
	 *
	 * @return Secure header text string
	 */
	public String readTxtHeaderSecure() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[2]/div/div[2]/p[1]");
		return getObject(search).readText();
	}

	/**
	 * read Secure text.
	 *
	 * @return Secure text string
	 */
	public String readTxtSecure() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"gov-banner\"]/div[2]/div/div[2]/p[2]");
		return getObject(search).readText();
	}

	/**
	 * get footer VA Department of Veterans Affairs image object.
	 *
	 * @return image object
	 */
	private AutomatedObject getImgFooterVADepartmentofVeteransAffairs() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/div/a/img");
		return getObject(search);
	}

	/**
	 * read footer VA Department of Veterans Affairs image alt text.
	 *
	 * @return image alt text
	 */
	public String readImgAltTxtFooterVADepartmentofVeteransAffairs() {
		return getImgFooterVADepartmentofVeteransAffairs().getPropertyValue("alt");
	}

	/**
	 * click footer VA Department of Veterans Affairs link.
	 */
	public void clickLinkFooterVADepartmentofVeteransAffairs() {
		getImgFooterVADepartmentofVeteransAffairs().click();
	}

	/**
	 * get header VA Department of Veterans Affairs image object.
	 *
	 * @return image object
	 */
	private AutomatedObject getImgHeaderVADepartmentofVeteransAffairs() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-header\"]/div/div/div[1]/div[1]/a/img");
		return getObject(search);
	}

	/**
	 * read header VA Department of Veterans Affairs image alt text.
	 *
	 * @return image alt text
	 */
	public String readImgAltTxtHeaderVADepartmentofVeteransAffairs() {
		return getImgFooterVADepartmentofVeteransAffairs().getPropertyValue("alt");
	}

	/**
	 * click header VA Department of Veterans Affairs link.
	 */
	public void clickLinkHeaderVADepartmentofVeteransAffairs() {
		getImgHeaderVADepartmentofVeteransAffairs().click();
	}

	/**
	 * get the Sign Out button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnSignOut() {
		Search search = getSearch();
		search.addCriteria("class", "usa-button vads-u-margin-right--0");
		return getObject(search);
	}

	/**
	 * read the Sign Out button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblSignOut() {
		return getBtnSignOut().readText();
	}

	/**
	 * click the Sign Out button.
	 */
	public void clickBtnSignOut() {
		getBtnSignOut().click();
		waitForPageLoad();
	}

	/**
	 * get Link Accessibility object.
	 *
	 * @return object of link
	 *
	 */
	private AutomatedObject getLinkAccessibility() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/ul/li[1]/a");
		return getObject(search);
	}

	/**
	 * read Link Accessibility label.
	 *
	 * @return link label string
	 */
	public String readLinkLblAccessibility() {
		return getLinkAccessibility().readText();
	}

	/**
	 * click Link Accessibility.
	 */
	public void clickLinkAccessibility() {
		waitForNewWindowAfterClick(getLinkAccessibility(), true);
	}

	/**
	 * get Link Office of Inspector General.
	 *
	 * @return object of link
	 */
	private AutomatedObject getLinkOfficeofInspectorGeneral() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/ul/li[2]/a");
		return getObject(search);
	}

	/**
	 * read Link Office of Inspector General label.
	 *
	 * @return link label string
	 */
	public String readLinkLblOfficeofInspectorGeneral() {
		return getLinkOfficeofInspectorGeneral().readText();
	}

	/**
	 * click Link Office of Inspector General.
	 */
	public void clickLinkOfficeofInspectorGeneral() {
		waitForNewWindowAfterClick(getLinkOfficeofInspectorGeneral(), true);
	}

	/**
	 * get Link Plain Language.
	 *
	 * @return object of link
	 */
	private AutomatedObject getLinkPlainLanguage() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/ul/li[3]/a");
		return getObject(search);
	}

	/**
	 * read Link Plain Language label.
	 *
	 * @return link label string
	 */
	public String readLinkLblPlainLanguage() {
		return getLinkPlainLanguage().readText();
	}

	/**
	 * click Link Plain Language.
	 */
	public void clickLinkPlainLanguage() {
		waitForNewWindowAfterClick(getLinkPlainLanguage(), true);
	}

	/**
	 * Link Privacy, Policies, and Legal Information.
	 *
	 * @return object of link
	 */
	private AutomatedObject getLinkPrivacyPoliciesAndLegalInformation() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/ul/li[4]/a");
		return getObject(search);
	}

	/**
	 * read Link Privacy Policies and Legal Information label.
	 *
	 * @return link label string
	 */
	public String readLinkLblPrivacyPoliciesAndLegalInformation() {
		return getLinkPrivacyPoliciesAndLegalInformation().readText();
	}

	/**
	 * click Link Privacy, Policies, and Legal Information.
	 */
	public void clickLinkPrivacyPoliciesAndLegalInformation() {
		waitForNewWindowAfterClick(getLinkPrivacyPoliciesAndLegalInformation(), true);
	}

	/**
	 * get app version object.
	 *
	 * @return app version object
	 */
	private AutomatedObject getAppVersion() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/div/p");
		return getObject(search);
	}

	/**
	 * is app version displayed.
	 *
	 * @return true app version displayed
	 */
	public Boolean isAppVersionDisplayed() {
		Search search = getSearch();
		search.addCriteria("xpath", "//*[@id=\"app-footer\"]/div/div/nav/div/p");
		return isObjectPresent(search);
	}

	/**
	 * read app version
	 *
	 * @return app version string
	 */
	public String readAppVersion() {
		return getAppVersion().readText();
	}

}