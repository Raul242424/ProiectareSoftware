package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SecoundMain {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Note");


        CellStyle headerStyle = workbook.createCellStyle(); //antet cu bold
        Font font = workbook.createFont();
        font.setBold(true);
        headerStyle.setFont(font);

        // Stil pentru coloanele galbene (Max și Average)
        CellStyle yellowStyle = workbook.createCellStyle();
        yellowStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Header
        Row header = sheet.createRow(0);
        String[] columns = {"Name", "Surname", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Max", "Average"};
        for (int i = 0; i < columns.length; i++) {
            Cell cell = header.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerStyle);
        }


        Map<String, Object[]> data = new TreeMap<>();
        data.put("2", new Object[]{"Gunda", "Schmidt", 9, 8, 7, 5});
        data.put("3", new Object[]{"Marcel", "Capacel", 8, 9, 6, 7});
        data.put("4", new Object[]{"John", "Adwards", 8, 8, 7, 6});
        data.put("5", new Object[]{"Brian", "Schultz", 7, 6, 8, 9});

        int rowNum = 1;
        for (String key : data.keySet()) {
            Row row = sheet.createRow(rowNum);
            Object[] values = data.get(key);
            for (int i = 0; i < values.length; i++) {
                if (values[i] instanceof String) {
                    row.createCell(i).setCellValue((String) values[i]);
                } else if (values[i] instanceof Integer) {
                    row.createCell(i).setCellValue((Integer) values[i]);
                }
            }


            Cell maxCell = row.createCell(6);
            String maxFormula = "MAX(C" + (rowNum + 1) + ":F" + (rowNum + 1) + ")";
            maxCell.setCellFormula(maxFormula);
            maxCell.setCellStyle(yellowStyle);


            Cell avgCell = row.createCell(7);
            String avgFormula = "AVERAGE(C" + (rowNum + 1) + ":F" + (rowNum + 1) + ")";
            avgCell.setCellFormula(avgFormula);
            avgCell.setCellStyle(yellowStyle);

            rowNum++;
        }

        // Auto-size coloane
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }


        try (FileOutputStream fos = new FileOutputStream("output8.xlsx")) {
            workbook.write(fos);
            workbook.close();
            System.out.println("Fișierul output8.xlsx a fost generat cu succes!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
