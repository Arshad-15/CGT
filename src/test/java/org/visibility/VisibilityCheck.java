package org.visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityCheck {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

       
        WebElement loginButton = driver.findElement(By.id("login"));

       
        if (loginButton.isDisplayed()) {
            System.out.println("Login button is displayed.");
        } else {
            System.out.println("Login button is not displayed.");
        }

       
        if (loginButton.isEnabled()) {
            System.out.println("Login button is enabled.");
        } else {
            System.out.println("Login button is disabled.");
        }

       // Thread.sleep(3000);
       driver.quit();
    }
}