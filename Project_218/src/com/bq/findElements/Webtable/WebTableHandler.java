package com.bq.findElements.Webtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTableHandler {

    private WebDriver driver;

    // Constructor to initialize the WebDriver
    public WebTableHandler(WebDriver driver) {
        this.driver = driver;
    }

    // 1. Locate the WebTable
    public WebElement getWebTable(By locator) {
        return driver.findElement(locator);
    }

    // 2. Get Total Rows in the Table
    public int getRowCount(WebElement table) {
        return table.findElements(By.tagName("tr")).size();
    }

    // 3. Get Total Columns in a Row
    public int getColumnCount(WebElement table, int rowNumber) {
        WebElement row = table.findElements(By.tagName("tr")).get(rowNumber);
        return row.findElements(By.tagName("td")).size();
    }

    // 4. Get Cell Data
    public String getCellData(WebElement table, int rowNumber, int columnNumber) {
        WebElement row = table.findElements(By.tagName("tr")).get(rowNumber);
        WebElement cell = row.findElements(By.tagName("td")).get(columnNumber);
        return cell.getText();
    }

    // 5. Get All Data from the Table
    public List<List<String>> getAllTableData(WebElement table) {
        List<List<String>> tableData = new ArrayList<>();
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            List<String> rowData = new ArrayList<>();
            for (WebElement cell : cells) {
                rowData.add(cell.getText());
            }
            tableData.add(rowData);
        }
        return tableData;
    }

    // 6. Verify Data in the Table
    public boolean isDataPresent(WebElement table, String searchText) {
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if (cell.getText().equals(searchText)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 7. Click on a Cell
    public void clickCell(WebElement table, int rowNumber, int columnNumber) {
        WebElement row = table.findElements(By.tagName("tr")).get(rowNumber);
        WebElement cell = row.findElements(By.tagName("td")).get(columnNumber);
        cell.click();
    }

    // 8. Get Row Index for a Specific Value
    public int getRowIndexForValue(WebElement table, String searchText) {
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if (cell.getText().equals(searchText)) {
                    return i;
                }
            }
        }
        return -1; // Return -1 if not found
    }

    // 9. Get Column Index for a Specific Header
    public int getColumnIndexForHeader(WebElement table, String headerText) {
        WebElement headerRow = table.findElement(By.tagName("tr"));
        List<WebElement> headers = headerRow.findElements(By.tagName("th"));
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText().equals(headerText)) {
                return i;
            }
        }
        return -1; // Return -1 if not found
    }

    // 10. Handle Dynamic Tables with Pagination
    public List<List<String>> getAllDataWithPagination(By tableLocator, By nextButtonLocator) {
        List<List<String>> allData = new ArrayList<>();
        WebElement table = driver.findElement(tableLocator);

        while (true) {
            allData.addAll(getAllTableData(table));
            try {
                WebElement nextButton = driver.findElement(nextButtonLocator);
                if (nextButton.isEnabled()) {
                    nextButton.click();
                    Thread.sleep(1000); // Wait for the next page to load
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
        return allData;
    }

    // Example Usage (for demonstration)
    public static void main(String[] args) {
        // Initialize WebDriver (e.g., ChromeDriver)
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/table");

        // Initialize WebTableHandler
        WebTableHandler tableHandler = new WebTableHandler(driver);

        // Locate the table
        By tableLocator = By.id("myTable");
        WebElement table = tableHandler.getWebTable(tableLocator);

        // Get total rows
        int rowCount = tableHandler.getRowCount(table);
        System.out.println("Total Rows: " + rowCount);

        // Get cell data
        String cellData = tableHandler.getCellData(table, 1, 2);
        System.out.println("Cell Data: " + cellData);

        // Verify data exists
        boolean isPresent = tableHandler.isDataPresent(table, "Expected Text");
        System.out.println("Data Present: " + isPresent);

        // Close the driver
        driver.quit();
    }
}