package org.Selenium.Screnshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {


    public static void main(String[] args) throws IOException {

        // Set ChromeDriver path if not set in system PATH
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1) Full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"/ScreenShot/fullPage"+Math.random()+".png");

        // Copy screenshot to desired location
        FileUtils.copyFile(sourceFile, targetFile);

        System.out.println("Screenshot captured successfully at: " + targetFile.getAbsolutePath());

        driver.quit();
    }
}

