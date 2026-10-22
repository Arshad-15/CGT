package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor{

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demoqa.com/text-box");

        
        driver.manage().window().maximize();

        
        JavascriptExecutor js = (JavascriptExecutor) driver;

       
        WebElement name = driver.findElement(By.id("userName"));

        
        js.executeScript("arguments[0].value='Career Guidance Technologies';",name);

        
        WebElement submit = driver.findElement(By.xpath("//span[text()='Check Box']"));

        
        js.executeScript("arguments[0].click();",submit);

        
    }
}