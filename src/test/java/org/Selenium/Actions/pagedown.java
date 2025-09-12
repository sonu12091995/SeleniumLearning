package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.Selenium.WaitHelper.Waits;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class pagedown extends commanToAll {
    @Test
    public void pageDown() {

        WebDriver driver = new ChromeDriver();
        open_Browser(driver, "https://thetestingacademy.com/");

Actions actions = new Actions(driver);
actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();


        Waits.waitJVM(3000);
    }
}
