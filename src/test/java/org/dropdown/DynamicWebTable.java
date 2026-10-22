package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/webtables");
        WebElement table = driver.findElement(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']"));

        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        System.out.println("Total Rows: " + rows.size());


        for (WebElement row : rows) {

            List<WebElement> cells = row.findElements(By.xpath(".//div[@role='gridcell']"));

            for (WebElement cell : cells) {

                System.out.print(cell.getText() + "\t");
            }

            System.out.println();
        }


        WebElement searchBox = driver.findElement( By.id("searchBox"));

        searchBox.sendKeys("Cierra");

       
        List<WebElement> searchRows = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@role='row']"));

        for (WebElement row : searchRows) {

            List<WebElement> cells = row.findElements( By.xpath(".//div[@role='gridcell']") );

            for (WebElement cell : cells) {

                System.out.print(cell.getText() + "\t");
            }

            System.out.println();
        }

       


        WebElement email = driver.findElement(By.xpath("//table/tbody/tr[td[1]='Cierra']/td[4]"));

        System.out.println("Cierra Email: " + email.getText());

        WebElement deleteButton = driver.findElement(By.xpath("//span[@id='delete-record-1']"));

        deleteButton.click();

        searchBox.clear();
        
        Thread.sleep(1000);
       
        
        List<WebElement> rowsAfterDelete = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@role='row']"));

        System.out.println( "Rows after delete: " + rowsAfterDelete.size());



        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));

        addButton.click();


        
        driver.findElement(By.id("firstName")).sendKeys("Arshad");


       
        driver.findElement(By.id("lastName")).sendKeys("Ayub");


       
        driver.findElement( By.id("userEmail")).sendKeys("arshad@example.com");


     
        driver.findElement( By.id("age")).sendKeys("32");


       
        driver.findElement(By.id("salary")).sendKeys("50000");


      
        driver.findElement(By.id("department")).sendKeys("QA");


      
        driver.findElement(By.id("submit")).click();
        
        searchBox = driver.findElement(By.id("searchBox"));
        
        searchBox.clear();

        Thread.sleep(1000);
        
        WebElement searchBox1 = driver.findElement( By.id("searchBox"));

        searchBox1.sendKeys("Arshad");
        
        WebElement newRecord = driver.findElement(By.xpath("//tbody/tr/td[text()='Arshad']" ) );

        if (newRecord.isDisplayed()) {

            System.out.println( "New record Arshad is present" );

        } else {

            System.out.println("New record is NOT present");
        }


       
        driver.quit();
    }
}