package org.Selenium.CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;




    public class ParllelTest {
        WebDriver driver;
        @Test
        @Parameters("browser")
        public void Scenario1(String nameofbrowser) {

            if (nameofbrowser.equals("chrome")) {
                driver = new ChromeDriver();
            }
            if (nameofbrowser.equals("edge")) {
                driver = new EdgeDriver();
            }
            if (nameofbrowser.equals("firefox")) {
                driver = new FirefoxDriver();
            }

            driver.get("https://www.google.co.in/");


        }
}
