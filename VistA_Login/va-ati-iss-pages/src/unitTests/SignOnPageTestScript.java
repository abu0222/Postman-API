package unitTests;

import issPageClasses.HomePage;
import issPageClasses.SignOnPage;
import platformIndependentCore.scripts.Arguments;
import platformIndependentCore.scripts.TestScript;

/**
 * <b>Name :</b> SignOnPageTestScript.java
 * <p>
 * <b>Generated :</b> Dec 20, 2022
 * <p>
 * <b>Description :</b> Unit test for the SignOnPage.
 * <p>
 *
 * @since Dec 20, 2022
 * @author VBAAUSJARAMJ
 */
public class SignOnPageTestScript extends TestScript {

	/**
	 * @param args Args
	 */
	public static void main(String[] args) {
		runScript(args);
	}

	@Override
	public void testScript(Arguments args) {
		HomePage hp = new HomePage();
		hp.loadPage();
		SignOnPage sp = new SignOnPage();
		sp.clickSignInWithWindowsAuthentication();
		sleep(5);
		addScreenShot("LoggedInScreenShot", "LoggedInScreenShot");

	}

}
