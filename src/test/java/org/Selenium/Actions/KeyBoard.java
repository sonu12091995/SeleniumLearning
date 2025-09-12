package org.Selenium.Actions;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoard extends commanToAll {

    @Test
    public void keyboardActions() {

        ChromeDriver driver = new ChromeDriver();
        open_Browser(driver, "https://awesomeqa.com/practice.html");

        WebElement fistName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(fistName,"Sonu").keyUp(Keys.SHIFT).build().perform();
        actions.keyDown(Keys.SHIFT).sendKeys(lastName,"sharma").keyUp(Keys.SHIFT).build().perform();
        Close_Browser(driver);
    }
}
