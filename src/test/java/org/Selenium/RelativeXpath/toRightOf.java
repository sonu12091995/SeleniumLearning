package org.Selenium.RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class toRightOf {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement yearOfExp = driver.findElement(By.xpath("//span[text() =\"Years of Experience\" ]"));
        // click on the right side of the element
        driver.findElement(with(By.id("exp-2")).toRightOf(yearOfExp)).click();
    }
}
