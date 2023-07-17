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
public class ChangeLocationModalPage extends IssBase {

	/**
	 * Constructor
	 */
	public ChangeLocationModalPage() {
		setPageURL("iss");
	}

	/**
	 * page classes and resources
	 */
	Resources r = new Resources();

	/**
	 * get the Change Location Close button object.
	 *
	 * @return button object
	 */
	private AutomatedObject getBtnChangeLocationClose() {
		Search search = getSearch();
		search.addCriteria("class", "usa-button-secondary vads-u-margin-right--0");
		return getObject(search);
	}

	/**
	 * read the Change Location Close button label.
	 *
	 * @return button label string
	 */
	public String readBtnLblChangeLocationClose() {
		return getBtnChangeLocationClose().readText();
	}

	/**
	 * is the Change Location modal form displayed.
	 *
	 * @return true if form displayed
	 */
	public Boolean isChangeLocationFormDisplayed() {
		Search search = getSearch();
		search.addCriteria("id", "change-location-modal");
		return isObjectPresent(search);
	}

	/**
	 * click the Change Location Close button.
	 */
	public void clickBtnChangeLocationClose() {
		getBtnChangeLocationClose().click();
		waitForPageLoad();
	}

}