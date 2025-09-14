package org.Selenium.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement file = driver.findElement(By.xpath("//input[@name=\"fileToUpload\"]"));
        file.sendKeys("D:\\iBus\\attendants_template.xlsx");
    }
}
