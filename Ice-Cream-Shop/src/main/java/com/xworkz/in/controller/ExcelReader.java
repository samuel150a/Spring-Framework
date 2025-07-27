package com.xworkz.in.controller;

import com.xworkz.in.dto.IceCreamShopDto;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    public List<IceCreamShopDto> readIceCreamData(String filePath) {
        List<IceCreamShopDto> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            if (rowIterator.hasNext()) rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                IceCreamShopDto dto = new IceCreamShopDto();
                int cellIndex = 0;

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    switch (cellIndex) {
                        case 0:
                            dto.setName(cell.getStringCellValue());
                            break;
                        case 1:
                            dto.setFlavour(cell.getStringCellValue());
                            break;
                        case 2:
                            dto.setQuantity((int) cell.getNumericCellValue());
                            break;
                        case 3:
                            dto.setCoupon(cell.getStringCellValue());
                            break;
                        case 4:
                            dto.setAddOn(cell.getStringCellValue());
                            break;
                        case 5:
                            dto.setTakeAway(cell.getStringCellValue());
                            break;
                    }

                    cellIndex++;
                }

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
