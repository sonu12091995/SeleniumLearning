package org.Selenium.JavaScriptExecutor;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigteWbsite extends commanToAll {
@Test
public void NavigateWebsite(){

    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("window.location = 'https://www.google.com'");

    String url = js.executeScript("return document.URL;").toString();
    String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
}
}
