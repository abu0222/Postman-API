package issPageClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import platformIndependentCore.core.BrowserObject;

/**
 * <b>Name :</b> Resources.java
 * <p>
 * <b>Generated :</b> Mar 22, 2023
 * <p>
 * <b>Description : Common methods that all page classes and script test can use
 * can. Uses IssBase class just like page class would but does not set a page
 * URL like a normal page would</b>
 * <p>
 *
 * @since Mar 22, 2023
 * @author OITLEXGreenA
 */
public class Resources extends IssBase {

	/**
	 * Constructor
	 */
	public Resources() {
		// Do not set a page url here
	}

	/**
	 * get the current page url string
	 *
	 * @return current page url string
	 */
	public String getCurrentPageUrl() {

		BrowserObject browser = getBrowser();
		return browser.getCurrentUrl();
	}

	/**
	 * read the current page title string
	 *
	 * @return current page title string
	 */
	public String readCurrentPageTitle() {

		return readPageTitle();
	}

	/**
	 * refresh the current page
	 *
	 */
	public void refreshCurrentPage() {

		BrowserObject browser = getBrowser();
		browser.refresh();
	}

	/**
	 * close the current browser tab
	 *
	 */
	public void closeCurrentBrowserTab() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_W);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
