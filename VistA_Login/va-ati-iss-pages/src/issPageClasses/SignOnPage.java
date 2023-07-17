package issPageClasses;

import platformIndependentCore.core.AutomatedPage;
import platformIndependentCore.core.Search;
import platformIndependentCore.exceptions.InvalidParameterException;
import platformIndependentCore.utilities.ConfigProperties;

/**
 * <b>Name :</b> SignOnPage.java
 * <p>
 * <b>Generated :</b> Dec 20, 2022
 * <p>
 * <b>Description :</b> Concrete class to work with objects on the SSOI Page
 * page.
 * <p>
 *
 * @since Dec 20, 2022
 * @author VBAAUSJARAMJ
 */
public class SignOnPage extends AutomatedPage {

	/** URL for SSOI login for the active test environment */
	protected static final String SSOI_URL = ConfigProperties.getValue("SSOI_URL");

	/**
	 * Constructor
	 */
	public SignOnPage() {
		if (SSOI_URL.isEmpty()) {
			throw new InvalidParameterException("Value for SSOI_URL must be specified in config.properties file");
		}
		setPageURL(SSOI_URL);
	}

	/**
	 * Clicks the "Sign In with VA PIV Card" link on the VA Single Sign-On page.
	 * Script should expect the tester to manually select certificate, enter PIN,
	 * and click OK.
	 */
	public void clickSignInWithPIVCard() {
		Search search = getSearch();
		search.addCriteria("Title", "sign in with piv");
		getObject(search).click();
	}

	/**
	 * Clicks the "View Other Sign-in Options" link on the VA Single Sign-On page.
	 * Then clicks on Sign in with Windows Authentication
	 */
	public void clickSignInWithWindowsAuthentication() {
		getObjectById("bs4-piv-lower-a").click();
		getObjectById("other-sign-in-modal-iwa-logon-btn").click();
		waitForPageLoad();
	}

	/**
	 * Clicks the Logout button on the SSOi Page.
	 */
	public void clickSSOiLogoutButton() {
		Search search = getSearch();
		search.addCriteria("class", "btn-logout btn btn-default pull-center");
		getObject(search).click();
		waitForPageLoad();
	}

}
