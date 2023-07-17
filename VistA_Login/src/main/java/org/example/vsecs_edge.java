package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.edge.EdgeDriver;

public class vsecs_edge {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub
        System.setProperty("webdriver.edge.driver", "C:\\Installed Program\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://google.com");


    }


}
