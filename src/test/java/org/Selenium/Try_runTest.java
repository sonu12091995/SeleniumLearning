package org.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Try_runTest {
    @Test
    public void Demotest(){
        System.out.println("Checking setup");
        Assert.assertEquals("Sonu","Sonu");
        System.out.println("End the test");
    }
@Test
    public void openBrowser(){
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/in/sonu-sharma-697baa238/");
    }
}
