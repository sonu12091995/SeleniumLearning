package org.Selenium.DetaDriven;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHardcore_Handle {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/org/Selenium/DetaDriven/TESTDATA.xlsx");

        Workbook w = WorkbookFactory.create(file);
        String UserName = w.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        String pass = w. getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();

            WebElement input_username = driver.findElement(By.id("email"));
            input_username.sendKeys(UserName);
            WebElement input_password = driver.findElement(By.id("pass"));
            input_password.sendKeys(pass + Keys.ENTER);

        }

    }




