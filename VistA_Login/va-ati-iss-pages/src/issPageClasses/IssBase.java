package issPageClasses;

import platformIndependentCore.core.AutomatedObject;
import platformIndependentCore.core.AutomatedPage;
import platformIndependentCore.core.Search;
import platformIndependentCore.exceptions.InvalidParameterException;
import platformIndependentCore.utilities.ConfigProperties;

/**
 * <b>Name :</b> IssBase.java
 * <p>
 * <b>Generated :</b> Dec 20, 2022
 * <p>
 * <b>Description :</b> Base class for the ISS application.
 * <p>
 *
 * @since Dec 20, 2022
 * @author VBAAUSJARAMJ
 */
public abstract class IssBase extends AutomatedPage {

	/**
	 * ISS URL
	 */
	protected static final String ISS_URL = ConfigProperties.getValue("ISS_URL");
	/**
	 * ISS_SSOI_URL
	 */
	protected static final String ISS_SSOI_URL = ConfigProperties.getValue("ISS_SSOI_URL");

	/**
	 * Sets the page URL for the inheriting page object
	 *
	 * @param address the page URL (less the base URL) for the inheriting page
	 */
	@Override
	public void setPageURL(String address) {
		if (ISS_URL.isEmpty()) {
			throw new InvalidParameterException("Value for ISS_URL must be specified in config.properties file");
		}
		super.setPageURL(ISS_URL + address);
	}

	/**
	 * Gets an object that matches the passed in text.
	 *
	 * @param text Text of object
	 * @return AutomatedObject
	 */
	protected AutomatedObject getObjectByText(String text) {
		Search sc = getSearch();
		sc.addCriteria("text", text);
		return getObject(sc);
	}

}
