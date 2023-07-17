package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vsecs_gui {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Installed Program\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");



        System.out.println(driver.getTitle()); // validate if your page Tile is correct

        driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo

        driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo
        driver.findElement(By.className("img-fluid piv-img application-button-image")).click(); // click on PIV card logo





    }
}
