package utility;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelUtility 
{

    /**
     * Reads data from an Excel file and returns it as a List of Maps (each row as a Map).
     *
     * @param filePath Path to the Excel file.
     * @param sheetName Name of the sheet to read.
     * @return List of Maps (each row's data).
     * @throws IOException If file is not found or invalid.
     */
    public static List<Map<String, String>> readExcel(String filePath, String sheetName) throws IOException {
        List<Map<String, String>> data = new ArrayList<>();
        Workbook workbook = getWorkbook(filePath);
        Sheet sheet = workbook.getSheet(sheetName);

        if (sheet == null) {
            throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
        }

        // Read headers (first row)
        Row headerRow = sheet.getRow(0);
        List<String> headers = new ArrayList<>();
        for (Cell cell : headerRow) {
            headers.add(cell.getStringCellValue());
        }

        // Read data rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Map<String, String> rowData = new HashMap<>();
            for (int j = 0; j < headers.size(); j++) {
                Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                rowData.put(headers.get(j), getCellValueAsString(cell));
            }
            data.add(rowData);
        }

        workbook.close();
        return data;
    }

    /**
     * Writes data to an Excel file.
     *
     * @param filePath Path to the Excel file.
     * @param sheetName Name of the sheet to write.
     * @param data List of Maps (each row's data).
     * @throws IOException If file cannot be written.
     */
    public static void writeExcel(String filePath, String sheetName, List<Map<String, String>> data) throws IOException {
        Workbook workbook = filePath.endsWith(".xlsx") ? new XSSFWorkbook() : new HSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);

        // Write headers (first row)
        if (!data.isEmpty()) {
            Row headerRow = sheet.createRow(0);
            int colNum = 0;
            for (String header : data.get(0).keySet()) {
                headerRow.createCell(colNum++).setCellValue(header);
            }

            // Write data rows
            int rowNum = 1;
            for (Map<String, String> rowData : data) {
                Row row = sheet.createRow(rowNum++);
                colNum = 0;
                for (String value : rowData.values()) {
                    row.createCell(colNum++).setCellValue(value);
                }
            }
        }

        // Write to file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        }
        workbook.close();
    }

    /**
     * Gets the appropriate Workbook instance based on file extension.
     *
     * @param filePath Path to the Excel file.
     * @return Workbook instance.
     * @throws IOException If file is invalid.
     */
    private static Workbook getWorkbook(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        return filePath.endsWith(".xlsx") ? new XSSFWorkbook(fis) : new HSSFWorkbook(fis);
    }

    /**
     * Converts a Cell's value to String.
     *
     * @param cell The cell to read.
     * @return String representation of the cell's value.
     */
    private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    /**
     * Creates a new Excel file with default headers if it doesn't exist.
     *
     * @param filePath Path to the Excel file.
     * @param sheetName Name of the sheet to create.
     * @param headers List of column headers.
     * @throws IOException If file cannot be created.
     */
    public static void createExcelWithHeaders(String filePath, String sheetName, List<String> headers) throws IOException {
        Workbook workbook = filePath.endsWith(".xlsx") ? new XSSFWorkbook() : new HSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);

        // Write headers
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.size(); i++) {
            headerRow.createCell(i).setCellValue(headers.get(i));
        }

        // Save file
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        }
        workbook.close();
    }
}