package org.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://demoqa.com/droppable");

        
        driver.manage().window().maximize();

        Thread.sleep(3000);
        WebElement source = driver.findElement(By.xpath("(//div[text()='Drag Me'])[1]"));

        
        WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

       
        Actions actions = new Actions(driver);

        
       // actions.dragAndDrop(source, target).perform();
        actions
        .clickAndHold(source)
        .moveToElement(target)
        .release()
        .perform();

      
    }
}