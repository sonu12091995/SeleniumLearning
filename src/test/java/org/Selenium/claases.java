package org.Selenium;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class claases {
    WebDriver driver;
@Parameters("browser")
@Test
public void test1(String browserValue){

    if (browserValue.equals("chrome")){
        System.out.println("Run the chrome");
    }
    if (browserValue.equals("Firefox")){
        System.out.println("Run the Firefox");
    }
}

    }


