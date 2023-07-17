package org.example;

import org.openqa.selenium.SessionNotCreatedException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import static java.lang.System.*;
import static java.lang.Thread.sleep;
import static org.apache.commons.collections4.MapUtils.getObject;


//        import org.openqa.selenium.Alert;432qedtf5r4e
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        import org.openqa.selenium.edge.EdgeDriver;
//        import static java.lang.Thread.sleep;
//        import org.openqa.selenium.SearchContext;


//        package unitTests;
//
//import 2issPageClasses.ChangeLocationModalPage;
//import issPageClasses.HomePage;
//import issPageClasses.Resources;
//import issPageClasses.SignOnPage;
//import platformIndependentCore.scripts.Arguments;
//import platformIndependentCore.scripts.TestScript;
//import platformIndependentCore.utilities.ConfigProperties;


////package issPageClasses;
//import platformIndependentCore.core.AutomatedPage;
//import platformIndependentCore.core.Search;
//import platformIndependentCore.exceptions.InvalidParameterException;
//import platformIndependentCore.utilities.ConfigProperties;

public class iss_gui {


    public static <Search> void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // TODO Auto-generated method stub
 //       setProperty("webdriver.chrome.driver","C:\\Installed Program\\chromedriver\\chromedriver.exe");

       // setProperty("webdriver.chrome.driver","C:\\Installed Program\\drivers\\chromedriver.exe");
        setProperty("webdriver.chrome.driver","C:\\Installed Program\\chromedriver_win32\\chromedriver.exe");

        sleep(1000);
//        setProperty("webdriver.edge.driver", "C:\\Installed Program\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        driver.get("https://staff.apps-staging.va.gov/iss/");


        /// PIV CARD ##################################################################################
//        driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo
//        driver.findElement(By.className("img-fluid piv-img application-button-image")).click(); // click on PIV card logo
//        driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo

//Following code Copied from file sent by Ann ############################



    //    public class SignOnPage extends AutomatedPage {

            /** URL for SSOI login for the active test environment */
//            protected static final String SSOI_URL = ConfigProperties.getValue("SSOI_URL");

            /**
             * Constructor
             */
//            public SignOnPage() {
//                if (SSOI_URL.isEmpty()) {
//                    throw new InvalidParameterException("Value for SSOI_URL must be specified in config.properties file");
//                }
//                setPageURL(SSOI_URL);
//            }

            /**
             * Clicks the "Sign In with VA PIV Card" link on the VA Single Sign-On page.
             * Script should expect the tester to manually select certificate, enter PIN,
             * and click OK.
             */
//            public void clickSignInWithPIVCard() {
//                Search search = getSearch();
//                search.addCriteria("Title", "sign in with piv");
//                getObject(search).click();
//            }

//    private static <Search> Search getSearch() {
    }

    /**
             * Clicks the "View Other Sign-in Options" link on the VA Single Sign-On page.
             * Then clicks on Sign in with Windows Authentication
//             */
//            public void clickSignInWithWindowsAuthentication() {
//                getObjectById("bs4-piv-lower-a").click();
//                getObjectById("other-sign-in-modal-iwa-logon-btn").click();
//                waitForPageLoad();
//            }

            /**
             * Clicks the Logout button on the SSOi Page.
//             */
//            public void clickSSOiLogoutButton() {
//                Search search = getSearch();
//                search.addCriteria("class", "btn-logout btn btn-default pull-center");
//                getObject(search).click();
//                waitForPageLoad();
//            }

  //      }


        //Above code Copied from file sent by Ann ############################






        // Flowing code copied from HOmePage File sent by Ann ###
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
//        public class HomePageTestScript extends TestScript {
//
//            /** URL for SSOI login for the active test environment */
//            protected static final String BROWSER = ConfigProperties.getValue("BROWSER");
//
//            /**
//             * Main method
//             *
//             * @param args Args
//             */
//            public static void main(String[] args) {
//                runScript(args);
//            }

//            @Override
//            public void testScript(Arguments args) {
//                HomePage hp = new HomePage();
//                ChangeLocationModalPage clmp = new ChangeLocationModalPage();
//                Resources r = new Resources();
//
//                hp.loadPage();
//                SignOnPage sp = new SignOnPage();
//                if (BROWSER.equals("FIREFOX")) {
//                    sp.clickSignInWithPIVCard();
//                } else {
//                    sp.clickSignInWithWindowsAuthentication();
//                }
//                sleep(10);
//
//                // Clicking the Main link
//                hp.clickBtnMain();
//                sleep(3);
//
//                // Verify you are on Main page
//                vpEquals("Verify you are on Main page", "Pending and Appointment Requests", r.readCurrentPageTitle());
//
//                // Clicking the Patient Search link
//                hp.clickBtnPatientSearch();
//                sleep(3);
//
//                // Verify you are on Patient Search page
//                vpEquals("Verify you are on Patient Search page", "Patient Search", r.readCurrentPageTitle());
//
//                hp.clickBtnHome();
//                sleep(3);
//
//                // Verify you are on Home page
//                vpEquals("Verify you are on Home page", "ISS Integrated Scheduling Solutions", r.readCurrentPageTitle());
//
//                // Click the Facility Location drop down
//                hp.clickBtnFacilityLocation();
//                sleep(3);
//
//                // Verify you are on Change Location modal page is display
//                vpEquals("Verify you are on Change Location page is displayed", true, clmp.isChangeLocationFormDisplayed());
//
//                // Clicking the Change Location Close Button
//                clmp.clickBtnChangeLocationClose();
//                sleep(3);
//
//                // Verify you are on Change Location modal page is no longer displayed
//                vpEquals("Verify you are on Change Location page is no longer displayed", false,
//                        clmp.isChangeLocationFormDisplayed());
//
//                // Clicking the Up and Down arrow
//                hp.clickImgAngleUpDownArrow();
//                sleep(3);
//
//                // TO DO - Verify angle direction is down and header and footer are no longer
//                // displayed
//
//                // Verify angle direction is down
//                vpEquals("Verify angle direction is down", "down", hp.readImgAngleUpDownArrowDirection());
//
//                // Verify USA Banner is not displayed
//                vpEquals("Verify USA Banner is not displayed", false, hp.isUsaBannerDisplayed());
//
//                // Verify VA header is not displayed
//                vpEquals("Verify VA header is not displayed", false, hp.isVaHeaderDisplayed());
//
//                // Clicking the Up and Down arrow
//                hp.clickImgAngleUpDownArrow();
//                sleep(3);
//
//                // Verify angle direction is up
//                vpEquals("Verify angle direction is up", "up", hp.readImgAngleUpDownArrowDirection());
//
//                // Verify USA Banner is displayed
//                vpEquals("Verify USA Banner is displayed", true, hp.isUsaBannerDisplayed());
//
//                // Verify VA header is displayed
//                vpEquals("Verify VA header is displayed", true, hp.isVaHeaderDisplayed());
//
//                // Verify USA Banner image alternate text
//                vpEquals("Verify USA Banner image alternate text", "An official website of the United States government",
//                        hp.readImgAltTxtUsaBanner());
//
//                // Verify USA Banner text
//                vpEquals("Verify USA Banner text", "An official website of the United States government",
//                        hp.readTxtUsaBanner());
//
//                // Verify USA Banner button text
//                vpEquals("Verify USA Banner button text", "Here's how you know", hp.readBtnLblUsaBanner());
//
//                // Click USA Banner button
//                hp.clickBtnUsaBanner();
//                sleep(5);
//
//                // Verify Government image alternate text
//                vpEquals("Verify Government image alternate text", "The .gov means it’s official",
//                        hp.readImgAltTxtGovernment());
//
//                // Verify Government header text
//                vpEquals("Verify Government header text", "The .gov means it’s official.", hp.readTxtHeaderGovernment());
//
//                // Verify Government text
//                vpEquals("Verify Government text",
//                        "Federal government websites often end in .gov or .mil. Before sharing sensitive information, make sure you’re on a federal government site.",
//                        hp.readTxtGovernment());
//
//                // Verify Secure image alternate text
//                vpEquals("Verify Secure image alternate text", "The site is secure", hp.readImgAltTxtSecure());
//
//                // Verify Secure header text
//                vpEquals("Verify Secure header text", "The site is secure.", hp.readTxtHeaderSecure());
//
//                // Verify Secure text
//                vpEquals("Verify Secure text",
//                        "The https:// ensures that you are connecting to the official website and that any information you provide is encrypted and transmitted securely.",
//                        hp.readTxtSecure());
//
//                // Verify Accessibility link label
//                vpEquals("Verify Accessibility link label", "Accessibility", hp.readLinkLblAccessibility());
//
//                // Click the Accessibility link
//                hp.clickLinkAccessibility();
//                sleep(5);
//
//                // Verify clicking Accessibility link goes to VA Section 508 Office url
//                vpEquals("Verify clicking Accessibility link goes to VA Section 508 Office url", "VA Section 508 Office",
//                        r.readCurrentPageTitle());
//
//                // Close current page
//                r.closeCurrentBrowserTab();
//                sleep(3);
//
//                // Verify Office of Inspector General link label
//                vpEquals("Verify Office of Inspector General link label", "Office of Inspector General",
//                        hp.readLinkLblOfficeofInspectorGeneral());
//
//                // Click the Office of Inspector General link
//                hp.clickLinkOfficeofInspectorGeneral();
//                sleep(5);
//
//                // Verify clicking Office of Inspector General link goes to VA Section 508
//                // Office url
//                vpEquals("Verify clicking Office of Inspector General link goes to VA Office of Inspector General url",
//                        "VA Office of Inspector General", r.readCurrentPageTitle());
//
//                // Close current page
//                r.closeCurrentBrowserTab();
//                sleep(3);
//
//                // Verify Plain Language link label
//                vpEquals("Verify Plain Language link label", "Plain Language", hp.readLinkLblPlainLanguage());
//
//                // Click the Plain Language link
//                hp.clickLinkPlainLanguage();
//                sleep(5);
//
//                // Verify clicking Plain Language link goes to VA Section 508 Office url
//                vpEquals("Verify clicking Plain Language link goes to Plain Language url",
//                        "Plain Language (Updated for 2021) - Office of Public and Intergovernmental Affairs",
//                        r.readCurrentPageTitle());
//
//                // Close current page
//                r.closeCurrentBrowserTab();
//                sleep(3);
//
//                // Verify Privacy, Policies, and Legal Information link label
//                vpEquals("Verify Privacy, Policies and Legal Information link label",
//                        "Privacy, Policies, and Legal Information", hp.readLinkLblPrivacyPoliciesAndLegalInformation());
//
//                // Click the Privacy Policies and Legal Information link
//                hp.clickLinkPrivacyPoliciesAndLegalInformation();
//                sleep(5);
//
//                // Verify clicking Accessibility link goes to VA Section 508 Office url
//                vpEquals(
//                        "Verify clicking Privacy, Policies, and Legal Information link goes to Privacy, Policies, and Legal Information url",
//                        "Privacy, Policies, And Legal Information | Veterans Affairs", r.readCurrentPageTitle());
//
//                // Close current page
//                r.closeCurrentBrowserTab();
//                sleep(3);
//
//                // Verify that the home page has a label of Welcome to ISS
//                vpEquals("Welcome to ISS text", "Welcome to ISS", hp.readTxtWelcomeToIss());
//
//                // Verify that the home page has a label of Welcome to ISS
//                vpEquals("Integrated Scheduling Solution text", "Integrated Scheduling Solution",
//                        hp.readTxtIntegratedSchedulingSolution());
//
//                // Verify that the home page has a label of Welcome to ISS
//                vpEquals("One Mission: Connect Veterans and Medical Providers text",
//                        "One Mission: Connect Veterans and Medical Providers",
//                        hp.readTxtOneMissionConnectVeteransAndMedicalProviders());
//
//                // Verify App Version is displayed
//                vpEquals("Verify App Version is displayed", true, hp.isAppVersionDisplayed());
//
//                // Verify Sign Out button label
//                vpEquals("Verify Sign Out button label", "Sign Out", hp.readBtnLblSignOut());
//
//                // Click the Sign Out Button
//                hp.clickBtnSignOut();
//                sleep(3);
//
//                // Verify clicking Sign Out goes to VA Identity and Access Management System
//                // page
//                vpEquals("Verify clicking Sign Out goes to VA Identity and Access Management System page",
//                        "VA Identity and Access Management System (IAM)", r.readCurrentPageTitle());
//
//            }

// Above code copied from Home page file sent by Ann




// ISS PAGE Elements Identified bellow ##################################

       // driver.findElement((By.xpath("//*[@id=\'app-header']/div/div/div[2]/div[1]/nav/ul/li[2]/a")).click();//Main


//        driver.findElement((By.xpath("//*[@id=\'app-header']/div/div/div[2]/div[1]/nav/ul/li[3]/a")).click();// Patience Search
//        driver.findElement((By.xpath("//*[@id=//'change-location-modal//']/div/div/div/div/div/div[2]/button[1]")).click();// Show Division
//        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// used xpath for Login button

//        driver.findElement(By.name("pass")).sendKeys("//*[@id=\'txtSearch\']").click(); // this is to search by 3 letter name
//        driver.findElement(By.id("identifierId")).sendKeys("txtSearch"); // this is to search by 3 letter nam

//        driver.findElement(By.linkText("SIGN IN")).click(); // Click on SIGN IN LINK
//        driver.findElement(By.id("identifierId")).sendKeys("ditorbanglaamar@gmail.com"); // enter Gmail Userid
//        driver.findElement(By.className("CwaK9")).click();  // Click on Next button
    
//
//        driver.findElement(By.className("current")).click(); //Patience search button
//        driver.findElement(By.id("//*[@id=\'facility-location-button\']")).click(); // 442 Green button upper Right
//        driver.findElement(By.id("react-select-6-live-region")).click(); // 442 react-select-6-live-region
//
//
//        driver.findElement(By.className("usa-button change-location-button")).click(); // 442 Green button upper Right
//        driver.findElement(By.className("usa-button-primary va-button-primary")).click(); // 442 Green button upper Right
//        driver.findElement(By.id("txtSearch")).sendKeys();// enter 3 letter of name or ssn
//
//

//
 //       System.out.println(driver.getTitle()); // validate if your page Tile is correct
//
//        driver.close(); // it closes current browser
//        driver.quit();




//            driver.findElement(By.id("username")).sendKeys("editorbanglaamar@gmail.com"); // This line is to enter UserId
//            driver.findElement(By.name("pw")).sendKeys("ayed1234"); // this is to find  password
//            driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// used xpath for Login button
//        //driver.findElement(By.name("Login")).click(); // Login code without xpath


        //      driver.get("https://demoqa.com/alerts");

//        driver.manage().window().maximize();
 // sleep(1000);

      //  driver.manage().window().minimize();

//        sleep(1000);
 //       driver.manage().window().maximize();

        // This step will result in an alert on screen


//        driver.findElement(By.className("current")).click();  //Label Main, class current
//        driver.findElement(By.xpath("//*[@id=\'app-header\']/div/div/div[2]/div[1]/nav/ul/li[2]")).click();//Label Main, class current

//if driver.findElement(By.xpath("/html/body/div/div/main/div/div[2]/va-accordion/va-accordion-item//h2/button")).isEnabled();



        ///////////////////////////

//        driver.findElement(By.id("alertButton")).click();
//        Alert simpleAlert = driver.switchTo().alert();
//        simpleAlert.accept();



//
//                driver.close(); // it closes current browser
//               driver.quit();
        //               driver.quit();
    }







