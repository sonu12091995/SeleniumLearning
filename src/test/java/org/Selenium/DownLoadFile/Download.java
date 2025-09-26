package org.Selenium.DownLoadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class Download {
    public static void main(String[] args) throws InterruptedException {

        // Set download directory
        String downloadFilepath = "D:\\Bug video";

        // Configure Chrome options
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefs.put("download.prompt_for_download", false);
        chromePrefs.put("profile.default_content_settings.popups", 0);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        // Initialize driver
        WebDriver driver = new ChromeDriver(options);

        // Open demo site
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");

        // Click the first Download button
        driver.findElement(By.xpath("(//a[text()='Download sample pdf file'])[1]")).click();

        // Wait for download to complete (simple demo, adjust as needed)
        Thread.sleep(10000); // wait 10 seconds

        // Verify file exists
        File file = new File(downloadFilepath + "\\file-sample_150kB.pdf");
        if(file.exists()) {
            System.out.println("File downloaded successfully: " + file.getAbsolutePath());
        } else {
            System.out.println("Download failed");
        }

        driver.quit();
    }
}
