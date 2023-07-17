package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static java.lang.Thread.sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;

import static java.lang.Thread.sleep;


public class MyStepdefs {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    }
        public static void main(String[] args) throws InterruptedException {
         //   System.setProperty("webdriver.chrome.driver", "C:\\Installed Program\\driver\\Chromedriver.exe");

            System.setProperty("webdriver.chrome.driver", "C:\\Installed Program\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://google.com");
            driver.get("https://staff.apps-staging.va.gov/iss/");

//
            System.out.println(driver.getCurrentUrl());

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            // identify element

            driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo

            driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo
            driver.findElement(By.className("img-fluid piv-img application-button-image")).click(); // click on PIV card logo

            driver.findElement(By.xpath(".//*[@id='main']/div[4]/div/button")).click();
              sleep(10000);
            driver.findElement(By.className("OK"));
            driver.findElement(By.xpath("//button[@name='OK']")).click();
            //        .className("img-fluid piv-img application-button-image")).click(); // OK button click


            driver.findElement(By.xpath("//*[@id=\"app-header\"]/div/div/div[2]/div[1]/nav/ul/li[2]")).click();// Menu button Main click
              driver.findElement(By.linkText("iss/main")).click();
              //        .xpath("//*[@id=\'app-header\']/div/div/div[2]/div[1]/nav/ul/li[2]/a")).click();// Menu button Main click
//*[@id="app-header"]/div/div/div[2]/div[1]/nav/ul/li[2]


            driver.findElement(By.xpath("//*[@id=\"app-header\"]/div/div/div[2]/div[1]/nav/ul/li[3]/a")).click();// Patient suarch button Main click

//
//            System.setProperty("webdriver.edge.driver", "C:\\Installed Program\\IEDriverServer_x64_4.6.0\\IEDriverServer.exe");
//      //      WebDriver driver = new ChromeDriver();
//
//            driver.get("https://google.com");
//     //       WebDriver driver=new ChromeDriver();
//           // WebDriver driver=new msedgedriver();
//           // driver.get("https://google.com/");
//            driver.get("https://staff.apps-staging.va.gov/vsecs/");

            System.out.println(driver.getTitle()); // validate if your page Tile is correct

            //	System.out.println(driver.getTitle()); // validate if your page Tile is correct

            System.out.println("Hello Friends!");
        }






    @And("I enter the username as admin and password as admin")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {
    }

    @And("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
    }
}
