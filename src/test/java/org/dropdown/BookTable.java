package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTable {

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

        
        driver.get("https://testautomationpractice.blogspot.com/");    

        
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        System.out.println("Total Rows: " + rows.size());

        List<WebElement> columns = rows.get(0).findElements(By.xpath("./th"));

        System.out.println("Total Columns: " + columns.size());

        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));

            for (WebElement cell : cells) {

                System.out.print(cell.getText() + "\t");
            }

            System.out.println();
        }

        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));

           
            if (cells.get(0).getText().equals("BookName")) {
                continue;
            }

            String bookName = cells.get(0).getText();
            String author = cells.get(1).getText();

            if (author.equals("Amit")) {

                System.out.println("Book Name: " + bookName);
            }
        }

        boolean found = false;

        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));

            for (WebElement cell : cells) {

                if (cell.getText().equals("Learn Java")) {

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Learn Java is present");
        } else {
            System.out.println("Learn Java is NOT present");
        }

        for (int i = 1; i < rows.size(); i++) {

            List<WebElement> cells = rows.get(i).findElements(By.xpath("./td"));

           String price = cells.get(3).getText();

            System.out.println(price);
        }
        driver.quit();
    }
}