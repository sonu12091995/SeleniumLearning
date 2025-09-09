package org.Selenium.Input_Alert_Checkbox;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Input_Alert_Checkbox extends commanToAll {

    @Test
    public void Alert_Checkbox_Input(){

        WebDriver driver = new ChromeDriver();
        open_Browser(driver,"https://awesomeqa.com/practice.html");

        // InputBox
        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstName.sendKeys("Sonu sharma");



        // Radio Button
        WebElement RadioButton = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
        RadioButton.click();

        // Checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@value=\"Manual Tester\"]"));
        checkBox.click();

        // Click Radio buton first get all click 3rd

        WebElement radioButton = driver.findElement(By.xpath("//input[@value=\"Manual Tester\"]"));
        checkBox.click();

        // Click on the sub,it button

        WebElement Submit = driver.findElement(By.xpath("//button[@name=\"submit\"]"));
        Submit.click();
    }


}
