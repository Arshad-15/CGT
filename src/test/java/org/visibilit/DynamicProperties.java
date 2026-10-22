package org.visibilit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://demoqa.com/dynamic-properties");

       
        WebElement enableButton = driver.findElement( By.id("enableAfter"));

       
        System.out.println(enableButton.isEnabled());

       
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        WebElement visibleButton = driver.findElement(By.id("visibleAfter"));

        System.out.println(visibleButton.isDisplayed());

       
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.id("visibleAfter")));

        System.out.println(visibleButton.isDisplayed());
         driver.quit();
    }
}


