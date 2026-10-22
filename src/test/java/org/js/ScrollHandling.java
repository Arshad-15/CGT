package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandling {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demoqa.com/text-box");

        
        driver.manage().window().maximize();

        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

       
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.id("submit"));

        js.executeScript("arguments[0].scrollIntoView(true);",submitButton);

        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(3000);
        
        driver.quit();
    }
}