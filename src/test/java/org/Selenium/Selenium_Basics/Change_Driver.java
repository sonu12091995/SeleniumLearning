package org.Selenium.Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Change_Driver {
    public static void main(String[] args) {

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
    }
}
