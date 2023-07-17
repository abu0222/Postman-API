package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VistALogin {
    @io.cucumber.java.en.Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
            // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "C:\\Installed Program\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://google.com");


    }

    @io.cucumber.java.en.And("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {

        {
            System.out.println("Hello world!");
        }
    }

    @io.cucumber.java.en.And("^I click login button$")
    public void iClickLoginButton() {

    }

    @io.cucumber.java.en.Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
    }
}
