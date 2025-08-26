package org.Selenium.Selenium_Basics;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Navigate_command {

        @Description("Open the URL")
        @Test
        public void test_Selenium01(){

            WebDriver driver = new FirefoxDriver();
            driver.get("https://google.com"); // 95%



            //  Use Navigation Commands
            // driver.get("url") -> Navigate to a URL

            //  navigate.to()


            // Use navigation methods
            driver.navigate().to("https://bing.com");
            driver.navigate().back();
            driver.navigate().refresh();
            driver.navigate().forward();



        }
    }

