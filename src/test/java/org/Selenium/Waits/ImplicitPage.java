package org.Selenium.Waits;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitPage {
    public  static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://app.vwo.com");
        /// e1,e2,2



    }
}
