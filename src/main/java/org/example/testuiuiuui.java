
package org.example;


        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import static java.lang.Thread.sleep;

    public class testuiuiuui {

            public static void main(String[] args) throws InterruptedException {

                // TODO Auto-generated method stub
                System.setProperty("webdriver.chrome.driver", "C:\\Installed Program\\chromedriver_win32\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();

                driver.get("https://google.com");
                driver.get("https://staff.apps-staging.va.gov/iss/");


                System.out.println(driver.getTitle()); // validate if your page Tile is correct

                driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo

               driver.findElement(By.xpath("//*[@id=\"bs4-piv-upper\"]/a/img")).click();// click on PIV card logo
                driver.findElement(By.className("img-fluid piv-img application-button-image")).click(); // click on PIV card logo



                driver.close(); // it closes current browser

                driver.quit();
//
//            driver.findElement(By.id("username")).sendKeys("editorbanglaamar@gmail.com"); // This line is to enter UserId
//            driver.findElement(By.name("pw")).sendKeys("ayed1234"); // this is to find  password
//            driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// used xpath for Login button
//        //driver.findElement(By.name("Login")).click(); // Login code without xpath


                //      driver.get("https://demoqa.com/alerts");

                driver.manage().window().maximize();
                sleep(1000);

                driver.manage().window().minimize();

                sleep(1000);
                driver.manage().window().maximize();
                sleep(1000);
                // This step will result in an alert on screen


                driver.findElement(By.className("current")).click();  //Label Main, class current
                driver.findElement(By.xpath("//*[@id=\'app-header\']/div/div/div[2]/div[1]/nav/ul/li[2]")).click();//Label Main, class current

//if driver.findElement(By.xpath("/html/body/div/div/main/div/div[2]/va-accordion/va-accordion-item//h2/button")).isEnabled();



                ///////////////////////////

                driver.findElement(By.id("alertButton")).click();
                Alert simpleAlert = driver.switchTo().alert();
                simpleAlert.accept();



//
//                driver.close(); // it closes current browser
//               driver.quit();
 //               driver.quit();
            }


        }





