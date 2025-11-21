package datadriven.Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WebTableToExcel {
    public static void main(String[] args) throws IOException {
        
        WebDriver driver = new ChromeDriver();
        // Navigate to the webpage containing the table
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

        // Locate the table
        WebElement table = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody"));

        // Get all rows from the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Table Data");

        // Iterate through rows and cells to extract data
        int rowNum = 0;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            Row excelRow = sheet.createRow(rowNum++);
            int cellNum = 0;
            for (WebElement cell : cells) {
                excelRow.createCell(cellNum++).setCellValue(cell.getText());
            }
        }

        // Write the workbook to an Excel file
        try (FileOutputStream outputStream = new FileOutputStream("TableData.xlsx")) {
            workbook.write(outputStream);
        }

        // Close the workbook and the WebDriver
        workbook.close();
        driver.quit();
    }
}