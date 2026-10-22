package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class KeyboardShortcut {

    public static void main(String[] args) {

       
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");

        
        driver.manage().window().maximize();

        
        WebElement searchBox = driver.findElement(By.name("q"));

        
        searchBox.sendKeys("Career Guidance Technologies");

        
        Actions actions = new Actions(driver);

       
        actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();

    }
}