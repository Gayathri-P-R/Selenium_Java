package com.sample.Sample_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void particular_cell_Data() throws IOException {
		
		File file = new File("C:\\Users\\kannan\\Selenium\\Sample_Maven\\target\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(1);		
		CellType type=cell.getCellType();
		if(type.equals(CellType.STRING))
		{
			String cellvalue=cell.getStringCellValue();
			System.out.println(cellvalue);
		}
		else if(type.equals(CellType.NUMERIC))
		{
			double cellvalue=cell.getNumericCellValue();
			int value=(int)cellvalue;
			System.out.println(Integer.toString(value));
		}
		workbook.close();
		
		}
	
	public static void read_All_Data() throws IOException
	{
		File file= new File("C:\\Users\\kannan\\Selenium\\Sample_Maven\\target\\Testdata.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell=row.getCell(j);
				CellType type=cell.getCellType();
				if(type.equals(CellType.STRING))
				{
					String value=cell.getStringCellValue();
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC))
				{
					double value=cell.getNumericCellValue();
					int val=(int) value;
					System.out.println(Integer.toString(val));
				}
			}
		}
		workbook.close();
	}
	public static void read_Particular_Row() throws IOException
	{
		File file= new File("C:\\Users\\kannan\\Selenium\\Sample_Maven\\target\\Testdata.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Row row=sheet.getRow(1);
		System.out.println("Read particular row");
		for(int j=0;j<row.getPhysicalNumberOfCells();j++)
		{
			Cell cell=row.getCell(j);
			CellType celltype=cell.getCellType();
			
			if(celltype.equals(CellType.STRING))
			{
				String value=cell.getStringCellValue();
				System.out.println(value);
			}
			else if(celltype.equals(CellType.NUMERIC))
			{
				double value=cell.getNumericCellValue();
				int val=(int) value;
				System.out.println(Integer.toString(val));
			}
		}
		workbook.close();
	}
	public static void read_Particular_column() throws IOException
	{
		File file= new File("C:\\Users\\kannan\\Selenium\\Sample_Maven\\target\\Testdata.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		System.out.println("Read particular column");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row=sheet.getRow(i);
			Cell cell=row.getCell(1);
			CellType celltype=cell.getCellType();
			
			if(celltype.equals(CellType.STRING))
			{
				String value=cell.getStringCellValue();
				System.out.println(value);
			}
			else if(celltype.equals(CellType.NUMERIC))
			{
				double value=cell.getNumericCellValue();
				int val=(int) value;
				System.out.println(Integer.toString(val));
			}
		}
		workbook.close();
			
		}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		particular_cell_Data();
		//read_All_Data();
		//read_Particular_Row();
		//read_Particular_column();
		
		
	}

}
