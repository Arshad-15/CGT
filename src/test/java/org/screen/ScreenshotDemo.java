package org.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

    public static void main(String[] args) throws IOException {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        
        File source = screenshot.getScreenshotAs(OutputType.FILE);

       
        File destination = new File("C:\\SeleniumScreenshots\\google.png");

        
        FileUtils.copyFile(source, destination);

        System.out.println("Screenshot saved successfully.");

        
        driver.quit();
    }
}