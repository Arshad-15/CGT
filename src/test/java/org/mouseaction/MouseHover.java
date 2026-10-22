package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        WebElement continueShopping = driver.findElement(By.xpath("//button[text()='Continue shopping']"));

        continueShopping.click();

       
        WebElement account = driver.findElement(By.id("nav-link-accountList"));

       
        Actions actions = new Actions(driver);

       
        actions.moveToElement(account).perform();
    }
}