package org.visibility;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowTest {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

       
        String mainWindow = driver.getWindowHandle();

        
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(3000);
        Set<String> allWindows = driver.getWindowHandles();

        System.out.println("Total Windows: " + allWindows.size());

        
        for (String window : allWindows) {

           
            driver.switchTo().window(window);

           
            System.out.println("Window ID: " + window);

            
            System.out.println("Window Title: " + driver.getTitle());

            
        }

       
        driver.switchTo().window(mainWindow);
        Thread.sleep(3000);

        System.out.println("Returned to Main Window");
        System.out.println("Main Window Title: " + driver.getTitle());

        driver.quit();
    }
}