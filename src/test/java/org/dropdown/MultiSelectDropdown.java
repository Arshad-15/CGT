package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testkru.com/Elements/Dropdowns");

        Thread.sleep(2000);

       
        WebElement dropdown = driver.findElement(By.id("multiSelect"));

        
        Select select = new Select(dropdown);

       
        if (select.isMultiple()) {
            System.out.println("Dropdown supports multiple selection");
        } else {
            System.out.println("Dropdown does NOT support multiple selection");
        }

       
        select.selectByVisibleText("Selenium");
        select.selectByVisibleText("Playwright");
        select.selectByVisibleText("Cypress");

       
        System.out.println("\nSelected Options:");

        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }


        WebElement firstSelected =
                select.getFirstSelectedOption();

        System.out.println("\nFirst Selected Option: "
                + firstSelected.getText());

       Thread.sleep(3000);
        select.deselectByVisibleText("Playwright");
        Thread.sleep(3000);
        System.out.println("\nAfter deselecting Playwright:");

        selectedOptions = select.getAllSelectedOptions();

        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

       
        select.deselectAll();

        System.out.println("\nAfter deselectAll(): "
                + select.getAllSelectedOptions().size());

        driver.quit();
    }
}