package org.Selenium.DropDown;

import org.Selenium.Utils.commanToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Select_DropDown extends commanToAll {
    @Test

    public void SelectDropDown(){

        WebDriver driver = new ChromeDriver();
        open_Browser(driver,"https://www.amazon.in/");

        // Select dropdown xpath
        WebElement selectDrop = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));

        Select select = new Select(selectDrop);// Select dropdown

        // get Select All option
        List<WebElement> selectList = select.getOptions();
        for(int i = 0; i<selectList.size(); i++){
            System.out.println(selectList.get(i).getText());

    }
        // Select by text
        select.selectByValue("search-alias=amazon-pharmacy");

        Close_Browser(driver);

    }

}
