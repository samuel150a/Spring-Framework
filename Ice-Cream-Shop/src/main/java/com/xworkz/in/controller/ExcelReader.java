package com.xworkz.in.controller;

import com.xworkz.in.dto.IceCreamShopDto;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public List<IceCreamShopDto> readIceCreamData(String filePath) {
        List<IceCreamShopDto> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                IceCreamShopDto dto = new IceCreamShopDto();

                dto.setName(row.getCell(0).getStringCellValue());
                dto.setFlavour(row.getCell(1).getStringCellValue());
                dto.setQuantity((int) row.getCell(2).getNumericCellValue());
                dto.setCoupon(row.getCell(3).getStringCellValue());
                dto.setAddOn(row.getCell(4).getStringCellValue());
                dto.setTakeAway(row.getCell(5).getStringCellValue());

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
