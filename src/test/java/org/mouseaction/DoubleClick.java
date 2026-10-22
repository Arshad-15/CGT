package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

       
        driver.manage().window().maximize();

        
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

       
        Actions actions = new Actions(driver);

       
        actions.doubleClick(button).perform();
    }
}